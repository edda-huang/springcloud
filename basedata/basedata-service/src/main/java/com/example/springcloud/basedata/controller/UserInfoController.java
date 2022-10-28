package com.example.springcloud.basedata.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.springcloud.basedata.schedule.ScheduledService;
import com.example.springcloud.basedata.service.UserInfoService;
import com.example.springcloud.basedata.user.UserInfo;
import com.example.springcloud.channel.log.LogRecord;
import com.example.springcloud.channel.service.LogRecordService;
import com.example.springcloud.core.utils.VoUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author 黄志华
 * @since 2022-10-21
 */
@RestController
@RequestMapping("/user-info")
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;

    @Autowired
    LogRecordService logRecordService;

    @GetMapping("/list")
    public List<UserInfo> list() {
        return VoUtils.copyPropertiesForList(userInfoService.list(new QueryWrapper<>()), UserInfo.class);
    }

    @GetMapping("/getOne/{id}")
    public UserInfo getOne(@PathVariable("id") String id) {
        UserInfo userInfo = VoUtils.copyProperties(userInfoService.getById(id), UserInfo.class);
        LogRecord logRecord = new LogRecord();
        logRecord.setRecord(userInfo);
        logRecordService.saveRecord(logRecord);
        return userInfo;
    }

}

