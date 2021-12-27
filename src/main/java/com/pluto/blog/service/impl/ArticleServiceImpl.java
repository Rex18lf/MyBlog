package com.pluto.blog.service.impl;

import com.github.pagehelper.PageInfo;
import com.pluto.blog.entity.Article;
import com.pluto.blog.service.ArticleService;

import java.util.HashMap;
import java.util.List;

public class ArticleServiceImpl implements ArticleService {
    @Override
    public Integer countArticle(Integer status) {
        return null;
    }

    @Override
    public Integer countArticleComment() {
        return null;
    }

    @Override
    public Integer countArticleView() {
        return null;
    }

    @Override
    public Integer countArticleByCategoryId(Integer categoryId) {
        return null;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public List<Article> listArticleByCategoryId(Integer cateId, Integer limit) {
        return null;
    }

    @Override
    public List<Article> listArticleByCategoryIds(List<Integer> cateIds, Integer limit) {
        return null;
    }

    @Override
    public List<Integer> listCategoryIdByArticleId(Integer articleId) {
        return null;
    }

    @Override
    public List<Article> listAllNotWithContent() {
        return null;
    }

    @Override
    public Article getLastUpdateArticle(){

    }

    @Override
    public void updateCommentCount(Integer articleId) {

    }

    @Override
    public void insertArticle(Article article) {

    }

    @Override
    public List<Article> listRandomArticle(Integer limit) {
        return null;
    }

    @Override
    public List<Article> listArticleByCommentCount(Integer limit) {
        return null;
    }

    @Override
    public Integer countArticleByTagId(Integer tagId) {
        return null;
    }

    @Override
    public List<Article> listArticle(HashMap<String, Object> criteria) {
        return null;
    }

    @Override
    public List<Article> listRecentArticle(Integer userId, Integer limit) {
        return null;
    }

    @Override
    public void updateArticleDetail(Article article) {

    }

    @Override
    public void updateArticle(Article article) {

    }

    @Override
    public void deleteArticleBatch(List<Integer> ids) {

    }

    @Override
    public void deleteArticle(Integer id) {

    }

    @Override
    public PageInfo<Article> pageArticle(Integer pageIndex, Integer pageSize, HashMap<String, Object> criteria) {
        return null;
    }

    @Override
    public Article getArticleByStatusAndId(Integer status, Integer id) {
        return null;
    }

    @Override
    public List<Article> listArticleByViewCount(Integer limit) {
        return null;
    }

    @Override
    public Article getAfterArticle(Integer id) {
        return null;
    }

    @Override
    public Article getPreArticle(Integer id) {
        return null;
    }
}
