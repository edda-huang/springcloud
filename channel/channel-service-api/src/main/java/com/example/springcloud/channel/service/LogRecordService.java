package com.example.springcloud.channel.service;


import com.example.springcloud.channel.log.LogRecord;
import com.example.springcloud.core.response.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author 黄志华
 * @since 2022-10-25
 */
@FeignClient(value = "channel-service")
public interface LogRecordService {

    @PostMapping(value = "/log-record/save")
    Result saveRecord(@RequestBody LogRecord record);

}
