package com.ktm.vo;

import com.ktm.entity.Comment;
import lombok.Data;


@Data
public class CommentVo extends Comment {

    private Long authorId;

    private String authorName;
    private String authorAvatar;
}
