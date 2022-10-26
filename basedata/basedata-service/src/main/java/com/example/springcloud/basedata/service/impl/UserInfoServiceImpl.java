package com.example.springcloud.basedata.service.impl;

import com.example.springcloud.basedata.dao.UserInfoMapper;
import com.example.springcloud.basedata.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springcloud.basedata.vo.UserInfo;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 黄志华
 * @since 2022-10-21
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
