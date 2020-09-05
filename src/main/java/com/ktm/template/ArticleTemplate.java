package com.ktm.template;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ktm.common.templates.DirectiveHandler;
import com.ktm.common.templates.TemplateDirective;
import com.ktm.service.IArticleService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
public class ArticleTemplate extends TemplateDirective {


    @Resource
    private IArticleService articleService;

    @Override
    public String getName() {
        return "articles";
    }

    @Override
    public void execute(DirectiveHandler handler) throws Exception {
        Integer level = handler.getInteger("level");
        Integer pn = handler.getInteger("pn", 1);
        Integer size = handler.getInteger("size", 2);
        Long categoryId = handler.getLong("categoryId");

        IPage page = articleService.paging(new Page(pn, size), categoryId, null, level, null, "created");

        handler.put(RESULTS, page).render();
    }
}
