package com.utilitybilling.electricmetering.billing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description:
 * @author: xiangshuai
 * @date: 2019-07-27
 * @time: 00:45
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.utilitybilling.electricmetering")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
