package com.ktm.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController extends BaseController {


    @GetMapping({"/index", "/"})
    public String index(@RequestParam(name = "current", defaultValue = "1") int current, @RequestParam(name = "size", defaultValue = "2") int size) {

        Page page = new Page(current, size);


        //分页信息  分类  用户 置顶  精选 排序
        IPage result = articleService.paging(page, null, null, null, null, "created");
        request.setAttribute("pageData",result);
        request.setAttribute("currentCategoryId", 0);
        return "index";
    }
}
