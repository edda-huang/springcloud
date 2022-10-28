package com.example.springcloud.basedata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;


@Configuration  
public class ThreadPoolTaskConfig {  
  
/**   
 *   默认情况下，在创建了线程池后，线程池中的线程数为0，当有任务来之后，就会创建一个线程去执行任务，  
 *    当线程池中的线程数目达到corePoolSize后，就会把到达的任务放到缓存队列当中；  
 *  当队列满了，就继续创建线程，当线程数量大于等于maxPoolSize后，开始使用拒绝策略拒绝   
 */  
  
    /** 核心线程数（默认线程数） */  
    private static final int corePoolSize = 5;  
    /** 最大线程数 */  
    private static final int maxPoolSize = 10;  
    /** 允许线程空闲时间（单位：默认为秒） */  
    private static final int keepAliveTime = 60;  
    /** 缓冲队列大小 */  
    private static final int queueCapacity = 200;  
    /** 线程池名前缀 */  
    private static final String threadNamePrefix = "Async-Service-";

    @Bean("taskExecutor")
    public TaskExecutor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        // 设置核心线程数
        executor.setCorePoolSize(corePoolSize);
        // 设置最大线程数
        executor.setMaxPoolSize(maxPoolSize);
        // 设置队列容量
        executor.setQueueCapacity(queueCapacity);
        // 设置线程活跃时间（秒）
        executor.setKeepAliveSeconds(keepAliveTime);
        // 设置默认线程名称
        executor.setThreadNamePrefix(threadNamePrefix);
        // 设置拒绝策略
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        // 等待所有任务结束后再关闭线程池
        executor.setWaitForTasksToCompleteOnShutdown(true);
        executor.setAwaitTerminationSeconds(60);
        return executor;
    }
    
} 