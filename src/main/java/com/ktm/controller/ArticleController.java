package com.ktm.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ArticleController extends BaseController {


    @GetMapping("/category/{id:\\d*}")
    public String category(@PathVariable(name = "id") Long id) {
        request.setAttribute("currentCategoryId",id);
        return "article/category";
    }

    @GetMapping("/detail/{id:\\d*}")
    public String detail(@PathVariable(name = "id") Long id) {
        return "article/detail";
    }
}
