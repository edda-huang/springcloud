package com.example.springcloud.basedata.service.impl;

import com.example.springcloud.basedata.service.SensitiveWordService;
import org.springframework.stereotype.Service;

/**
 * @Author 黄志华
 * @Date 2022/11/28 16:34
 */
@Service
public class SensitiveWordServiceImpl implements SensitiveWordService {


    /*@SuppressWarnings("rawtypes")
    @Override
    public Set<String> sensitiveWordFiltering(String text) {
        // 初始化敏感词库对象
        SensitiveWordInit sensitiveWordInit = new SensitiveWordInit();
        // 从数据库中获取敏感词对象集合（调用的方法来自Dao层，此方法是service层的实现类）
        List<SensitiveWord> sensitiveWords = sensitiveWordMapper.getSensitiveWordListAll();
        // 构建敏感词库
        Map sensitiveWordMap = sensitiveWordInit.initKeyWord(sensitiveWords);
        // 传入SensitivewordEngine类中的敏感词库
        SensitivewordEngine.sensitiveWordMap = sensitiveWordMap;
        // 得到敏感词有哪些，传入2表示获取所有敏感词
        Set<String> set = SensitivewordEngine.getSensitiveWord(text, 2);
        return set;
    }*/

}
