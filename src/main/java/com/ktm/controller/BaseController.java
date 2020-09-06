package com.ktm.controller;

import com.ktm.service.IArticleService;
import com.ktm.service.ICommentService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

public class BaseController {



    @Resource
    HttpServletRequest request;


    @Resource
    IArticleService articleService;


    @Resource
    ICommentService commentService;
}
