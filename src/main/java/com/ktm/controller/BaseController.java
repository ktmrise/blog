package com.ktm.controller;

import com.ktm.service.IArticleService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

public class BaseController {



    @Resource
    HttpServletRequest request;


    @Resource
    IArticleService articleService;
}
