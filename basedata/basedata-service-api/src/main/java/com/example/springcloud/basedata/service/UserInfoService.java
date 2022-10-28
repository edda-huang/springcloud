package com.example.springcloud.basedata.service;


import com.example.springcloud.basedata.user.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author 黄志华
 * @since 2022-10-21
 */
@FeignClient(value = "basedata-service")
public interface UserInfoService {

    @GetMapping("/user-info/list")
    List<UserInfo> list();
    
}
