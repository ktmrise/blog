package com.ktm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ktm.entity.Comment;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ktm.vo.CommentVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ktm
 * @since 2020-09-06
 */
public interface ICommentService extends IService<Comment> {

    IPage<CommentVo> paging(Page page, Long articleId, Long userId, String order);
}
