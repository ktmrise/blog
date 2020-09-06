package com.ktm.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ktm.entity.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ktm.vo.CommentVo;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ktm
 * @since 2020-09-06
 */
public interface CommentMapper extends BaseMapper<Comment> {

    IPage<CommentVo> selectComments(Page page, QueryWrapper<Comment> wrapper);
}
