package com.example.springcloud.schedule.remoteJob;

import com.example.springcloud.basedata.job.UserInfoJobService;
import com.example.springcloud.basedata.service.UserInfoService;
import com.example.springcloud.schedule.IRemoteJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author 黄志华
 * @Date 2022/10/27 18:17
 */
@Component
public class RemoteJobs implements IRemoteJob {

    @Autowired
    UserInfoJobService userInfoJobService;

    public void autoCheckUserInfoJob() {
        userInfoJobService.autoCheckUserInfoJob();
    }
    
}
