package cn.toj.zuuleurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ZuulEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulEurekaServerApplication.class, args);
    }

}
