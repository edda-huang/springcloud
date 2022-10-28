package com.example.springcloud.basedata.controller;

import com.example.springcloud.basedata.schedule.ScheduledService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 黄志华
 * @Date 2022/10/28 12:26
 */
@RestController
@RequestMapping("/job")
public class UserInfoJobController {

    @Autowired
    ScheduledService scheduledService;

    @GetMapping("/autoCheckUserInfoJob")
    public void autoCheckUserInfoJob() {
        scheduledService.scheduleCheckUserInfo();
    }
    
}
