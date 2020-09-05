package com.ktm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;
import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author ktm
 * @since 2020-09-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Article implements Serializable {

    static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    Long id;

    /**
     * 标题
     */
    String title;

    /**
     * 内容
     */
    String content;

    /**
     * 编辑模式：html可视化，markdown ..
     */
    String editMode;

    Long categoryId;

    /**
     * 用户ID
     */
    Long userId;

    /**
     * 支持人数
     */
    Integer voteUp;

    /**
     * 反对人数
     */
    Integer voteDown;

    /**
     * 访问量
     */
    Integer viewCount;

    /**
     * 评论数量
     */
    Integer commentCount;

    /**
     * 是否为精华
     */
    Boolean recommend;

    /**
     * 置顶等级
     */
    Integer level;

    /**
     * 状态
     */
    Integer status;

    /**
     * 创建日期
     */
    LocalDateTime created;

    /**
     * 最后更新日期
     */
    LocalDateTime modified;


}
