package com.ktm.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ktm.entity.Article;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ktm.vo.ArticleVo;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ktm
 * @since 2020-09-05
 */
public interface ArticleMapper extends BaseMapper<Article> {

    IPage<ArticleVo> selectArticles(Page page,@Param(Constants.WRAPPER)  QueryWrapper wrapper);

    ArticleVo selectOneArticle(@Param(Constants.WRAPPER) QueryWrapper<ArticleVo> wrapper);
}
