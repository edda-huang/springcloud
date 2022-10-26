package com.example.springcloud.basedata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = {"com.example.springcloud"})
@SpringCloudApplication
@MapperScan(basePackages = {"com.example.springcloud.basedata.dao"})
public class BasedataServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasedataServiceApplication.class, args);
    }

}
