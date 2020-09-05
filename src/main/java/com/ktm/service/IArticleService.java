package com.ktm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ktm.entity.Article;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ktm
 * @since 2020-09-05
 */
public interface IArticleService extends IService<Article> {

    IPage paging(Page page, Long categoryId, Long userId, Integer level, Boolean recommend, String order);
}
