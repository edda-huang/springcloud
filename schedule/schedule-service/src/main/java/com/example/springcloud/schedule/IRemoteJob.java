package com.example.springcloud.schedule;

import org.springframework.scheduling.annotation.Async;

@Async("asyncServiceExecutor")
public interface IRemoteJob {
	
}
