package com.ktm.config;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ktm.entity.Category;
import com.ktm.service.ICategoryService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import java.util.List;

@Component
public class ContextStartup implements ApplicationRunner, ServletContextAware {

    @Resource
    private ICategoryService categoryService;


    @Resource
    private ServletContext servletContext;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<Category> categories = categoryService.list(new QueryWrapper<Category>().lambda().eq(Category::getStatus, 0));
        servletContext.setAttribute("categories", categories);

    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }
}
