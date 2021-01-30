package com.jn.xingdaba.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.jn.*"})
@EnableDiscoveryClient
@SpringBootApplication
public class JnXingdabaSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(JnXingdabaSystemApplication.class, args);
    }

}
