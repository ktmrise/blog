package com.ktm.config;


import com.ktm.template.ArticleTemplate;
import com.ktm.template.TimeAgoMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Configuration
public class FreemarkerConfig {
    @Resource
    private freemarker.template.Configuration configuration;


    @Resource
    private ArticleTemplate articleTemplate;

//
//    @Autowired
//    HotsTemplate hotsTemplate;

    @PostConstruct
    public void setUp() {
        configuration.setSharedVariable("timeAgo", new TimeAgoMethod());
        configuration.setSharedVariable("articles", articleTemplate);
//        configuration.setSharedVariable("hots", hotsTemplate);
//        configuration.setSharedVariable("shiro", new ShiroTags());
    }
}
