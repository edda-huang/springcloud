package com.example.springcloud.basedata.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @Author 黄志华
 * @Date 2022/10/28 12:10
 */
@Component
@Slf4j
public class ThreadTask {

    @Async("taskExecutor")
    public void checkUserInfo() {
        try {
            log.info("当前线程-------{}", Thread.currentThread().getName());
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
