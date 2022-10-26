package com.example.springcloud.basedata.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springcloud.basedata.vo.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 黄志华
 * @since 2022-10-21
 */
public interface UserInfoService extends IService<UserInfo> {

}
