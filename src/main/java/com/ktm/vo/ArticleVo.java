package com.ktm.vo;

import com.ktm.entity.Article;
import lombok.Data;


@Data
public class ArticleVo extends Article {

    private Long authorId;

    private String authorName;
    private String authorAvatar;
    private String categoryName;
}
