package cn.toj.zuulprovider02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ZuulProvider02Application {

    public static void main(String[] args) {
        SpringApplication.run(ZuulProvider02Application.class, args);
    }

}
