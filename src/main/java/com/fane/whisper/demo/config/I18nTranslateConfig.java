package com.fane.whisper.demo.config;

import com.fane.whisper.service.I18nTranslateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class I18nTranslateConfig {

    @Autowired
    ApplicationContext applicationContext;

    @Bean
    public I18nTranslateService init() {
        //this basic translator service always translate your data in  Chinese language
        return new I18nTranslateService(applicationContext,new MyTranslateToolService());

    }

}