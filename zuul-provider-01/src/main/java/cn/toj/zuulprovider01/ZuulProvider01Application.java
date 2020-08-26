package cn.toj.zuulprovider01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ZuulProvider01Application {

    public static void main(String[] args) {
        SpringApplication.run(ZuulProvider01Application.class, args);
    }

}
