package com.example.springcloud.basedata.controller;

import com.esotericsoftware.minlog.Log;
import com.example.springcloud.basedata.service.SensitiveWordService;
import com.example.springcloud.core.response.Result;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * @Author 黄志华
 * @Date 2022/11/28 16:31
 */
@RestController
public class SensitiveWordController {
    
    @Autowired
    private SensitiveWordService sensitiveWordService;

    /**
     * 敏感词过滤
     *
     * @param text
     * @return
     */
    @RequestMapping(value = "/word/filter")
    @ResponseBody
    public Result sensitiveWordFiltering(String text) {
        Result result = new Result();
        try {
            //Set<String> set = sensitiveWordService.sensitiveWordFiltering(text);
            //result.setData(set);
        } catch (Exception e) {
            Log.error("过滤敏感词出错，请联系维护人员");
        }

        return result;
    }
    
}
