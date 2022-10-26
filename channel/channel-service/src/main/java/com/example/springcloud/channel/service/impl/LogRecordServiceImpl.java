package com.example.springcloud.channel.service.impl;

import com.example.springcloud.channel.service.LogRecordService;
import com.example.springcloud.channel.vo.LogRecord;
import com.example.springcloud.channel.dao.LogRecordMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 黄志华
 * @since 2022-10-25
 */
@Service
public class LogRecordServiceImpl extends ServiceImpl<LogRecordMapper, LogRecord> implements LogRecordService {

}
