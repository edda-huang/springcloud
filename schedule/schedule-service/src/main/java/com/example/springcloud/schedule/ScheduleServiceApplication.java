package com.example.springcloud.schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync
@EnableScheduling
@EnableFeignClients(basePackages = {"com.example.springcloud"})
@SpringBootApplication
@EnableDiscoveryClient
public class ScheduleServiceApplication{

    public static void main(String[] args) {
        SpringApplication.run(ScheduleServiceApplication.class, args);
    }

}
