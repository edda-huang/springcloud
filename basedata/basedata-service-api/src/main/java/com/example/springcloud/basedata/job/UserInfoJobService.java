package com.example.springcloud.basedata.job;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author 黄志华
 * @Date 2022/10/28 13:10
 */
@FeignClient(value = "basedata-service")
public interface UserInfoJobService {

    @GetMapping("/job/autoCheckUserInfoJob")
    void autoCheckUserInfoJob();
    
}
