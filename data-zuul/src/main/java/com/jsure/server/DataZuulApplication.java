package com.jsure.server;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableZuulProxy
@SpringCloudApplication
public class DataZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataZuulApplication.class, args);
    }
}
