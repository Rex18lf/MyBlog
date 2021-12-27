package com.pluto.blog.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
//Serializable接口：一个类实现了Serializable接口，那么这个类就可以序列化了
//通过writeObject把这个类的对象写到一个地方，再通过ObjectInputStream的readObject方法把这个对象读出来
public class Article implements Serializable {
    private static final long serialVersionUID = 5207865247400761539L;

    private Integer articleId;

    private Integer articleUserId;

    private String articleTitle;

    private Integer articleViewCount;

    private Integer articleCommentCount;

    private Integer articleLikeCount;

    private Date articleCreateTime;

    private Date articleUpdateTime;

    private Integer articleIsComment;

    private Integer articleStatus;

    private Integer articleOrder;

    private String articleContent;

    private String articleSummary;

    private String articleThumbnail;

    private User user;

    private List<Tag> tagList;

    private List<Category> categoryList;
}
