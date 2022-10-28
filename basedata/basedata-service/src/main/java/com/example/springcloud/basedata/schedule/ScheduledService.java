package com.example.springcloud.basedata.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.IntStream;

/**
 * @Author 黄志华
 * @Date 2022/10/28 12:10
 */
@Service
public class ScheduledService {

    @Autowired
    private ThreadTask threadTask;

    public void scheduleCheckUserInfo() {
        IntStream.range(1, 100).forEach(i -> threadTask.checkUserInfo());
    }

}
