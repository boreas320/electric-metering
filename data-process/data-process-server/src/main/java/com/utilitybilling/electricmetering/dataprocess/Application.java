package com.utilitybilling.electricmetering.dataprocess;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

/**
 * @description:
 * @author: xiangshuai
 * @date: 2019-07-27
 * @time: 01:43
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public NewTopic newTopic() {
        return new NewTopic("processed_metering_data", 1, (short) 1);
    }
}
