package com.ktm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ktm.entity.Comment;
import com.ktm.mapper.CommentMapper;
import com.ktm.service.ICommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ktm.vo.CommentVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ktm
 * @since 2020-09-06
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {


    @Resource
    private CommentMapper commentMapper;

    @Override
    public IPage<CommentVo> paging(Page page, Long articleId, Long userId, String order) {
        return commentMapper.selectComments(page, new QueryWrapper<Comment>().
                eq(articleId != null, "post_id", articleId).
                eq(userId != null, "user_id", userId).
                orderByDesc(order))
                ;
    }
}
