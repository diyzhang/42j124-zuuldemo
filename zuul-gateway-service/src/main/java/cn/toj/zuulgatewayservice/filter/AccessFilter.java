package cn.toj.zuulgatewayservice.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import io.micrometer.core.instrument.util.StringUtils;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Carlos
 * @description
 * @Date 2020/8/26
 */

@Configuration
public class AccessFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //获取上下文
        RequestContext ctx = RequestContext.getCurrentContext();
        //获取Request
        HttpServletRequest request = ctx.getRequest();
        //获取请求参数accessToken
        String accessToken = request.getParameter("accessToken");
        //使用String工具类
        if (StringUtils.isBlank(accessToken)) {
            ctx.setSendZuulResponse(false);  //进行拦截
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("accessToken is empty");
            } catch (Exception ignored) {
            }
            return null;
        }
        return null;
    }
}
