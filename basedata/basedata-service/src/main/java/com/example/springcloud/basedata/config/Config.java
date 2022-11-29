package com.example.springcloud.basedata.config;

import com.example.springcloud.basedata.util.sensitiveword.SensitiveWordFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Value(value = "${SENSITIVE_WORD_PATH:/ehospital5/config/sensitive_word.txt}")
    private String SENSITIVE_WORD_PATH;

    @Bean
    SensitiveWordFilter createSensitivewordFilter() {
        return new SensitiveWordFilter(SENSITIVE_WORD_PATH);
    }
    
}
