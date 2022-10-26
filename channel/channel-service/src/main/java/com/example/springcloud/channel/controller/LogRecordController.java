package com.example.springcloud.channel.controller;


import com.example.springcloud.channel.log.LogRecord;
import com.example.springcloud.channel.service.LogRecordService;
import com.example.springcloud.core.response.Result;
import com.example.springcloud.core.utils.VoUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author 黄志华
 * @since 2022-10-25
 */
@RestController
@RequestMapping("/log-record")
public class LogRecordController {

    @Autowired
    LogRecordService logRecordService;

    @PostMapping(value = "/save")
    public Result saveRecord(@RequestBody LogRecord record) {
        logRecordService.save(VoUtils.copyProperties(record, com.example.springcloud.channel.vo.LogRecord.class));
        return new Result();
    }

}

