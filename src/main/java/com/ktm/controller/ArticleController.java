package com.ktm.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ktm.entity.Comment;
import com.ktm.vo.ArticleVo;
import com.ktm.vo.CommentVo;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
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


    //查询文章详情
    @GetMapping("/detail/{id:\\d*}")
    public String detail(@PathVariable(name = "id") Long id,@RequestParam(name = "current", defaultValue = "1") int current, @RequestParam(name = "size", defaultValue = "2") int size) {
        Page page = new Page(current, size);

        ArticleVo article = articleService.selectOneArticle(id);
        Assert.notNull(article, "文章已被删除");


        //3.userId
        IPage<CommentVo> records= commentService.paging(page, article.getId(), null,"created");



        request.setAttribute("currentCategoryId",article.getCategoryId());
        request.setAttribute("article",article);
        request.setAttribute("pageData",records);
        return "article/detail";
    }
}
