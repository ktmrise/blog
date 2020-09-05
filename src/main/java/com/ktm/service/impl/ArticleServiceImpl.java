package com.ktm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ktm.entity.Article;
import com.ktm.mapper.ArticleMapper;
import com.ktm.service.IArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ktm.vo.ArticleVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ktm
 * @since 2020-09-05
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {


    @Resource
    private ArticleMapper articleMapper;

    @Override
    public IPage<ArticleVo> paging(Page page, Long categoryId, Long userId, Integer level, Boolean recommend, String order) {

        if (level == null) {
            level = -1;
        }

        QueryWrapper wrapper = new QueryWrapper<Article>()
                .eq(categoryId != null, "category_id", categoryId).eq(userId != null, "user_id", userId)
                .eq(level == 0, "level", 0)
                .gt(level > 0, "level", 0)
                .orderByDesc(order!=null,order);



        return articleMapper.selectArticles(page, wrapper);
    }
}
