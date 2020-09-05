package com.ktm.controller;


import com.ktm.vo.ArticleVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ArticleController extends BaseController {


    @GetMapping("/category/{id:\\d*}")
    public String category(@PathVariable(name = "id") Long id, @RequestParam(name = "current",defaultValue = "1") Long current) {
        request.setAttribute("currentCategoryId",id);
        request.setAttribute("current",current);
        return "article/category";
    }

    @GetMapping("/detail/{id:\\d*}")
    public String detail(@PathVariable(name = "id") Long id) {
        request.setAttribute("currentCategoryId",id);
        ArticleVo article = articleService.selectOneArticle(id);
        assert article != null;
        request.setAttribute("article",article);
        return "article/detail";
    }
}
