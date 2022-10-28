package com.example.springcloud.schedule;

import com.example.springcloud.schedule.remoteJob.RemoteJobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Author 黄志华
 * @Date 2022/10/27 18:15
 */
@Component
public class JobInvoker {

    @Autowired
    private RemoteJobs jobs;

    @Scheduled(cron = "0 0 13 * * ?")
    public void autoCheckUserInfoJob() {
        jobs.autoCheckUserInfoJob();
    }

}
