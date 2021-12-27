package com.pluto.blog.service.impl;

import com.pluto.blog.entity.Category;
import com.pluto.blog.mapper.ArticleCategoryRefMapper;
import com.pluto.blog.mapper.CategoryMapper;
import com.pluto.blog.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.List;

@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private ArticleCategoryRefMapper articleCategoryRefMapper;
    @Override
    public Integer countCategory() {
        Integer count = 0;
        try {
            count = categoryMapper.countCategory();
        } catch (Exception e) {
            e.printStackTrace();
            log.error("统计分类失败, cause:{}", e);
        }
        return count;
    }

    @Override
    public List<Category> listCategory() {

        List<Category> categoryList = null;
        try {
            categoryList = categoryMapper.listCategory();
        } catch (Exception e) {
            e.printStackTrace();
            log.error("根据文章获得分类列表失败, cause:{}", e);
        }
        return categoryList;
    }

    @Override
    public List<Category> listCategoryWithCount() {
        List<Category> categoryList = null;
        try {
            categoryList = categoryMapper.listCategory();
            for (Category category : categoryList) {
                Integer count = articleCategoryRefMapper.countArticleByCategoryId(category.getCategoryId());
                category.setArticleCount(count);
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.error("根据文章获得分类列表失败, cause:{}", e);
        }
        return categoryList;
    }

    @Override
    //若该方法出现异常，就会回滚，数据库里的数据也会回滚
    @Transactional(rollbackFor = Exception.class)
    public void deleteCategory(Integer id) {
        try {
            categoryMapper.deleteCategory(id);
            articleCategoryRefMapper.deleteByCategoryId(id);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("删除分类失败, id:{}, cause:{}", id, e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
    }

    @Override
    public Category getCategoryById(Integer id) {
        Category category = null;
        try {
            category = categoryMapper.getCategoryById(id);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("根据分类ID获得分类, id:{}, cause:{}", id, e);
        }
        return category;
    }

    @Override
    public Category insertCategory(Category category) {
        try {
            categoryMapper.insert(category);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("创建分类失败, category:{}, cause:{}", category, e);
        }
        return category;
    }

    @Override
    public void updateCategory(Category category) {
        try {
            categoryMapper.update(category);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("更新分类失败, category:{}, cause:{}", category, e);
        }
    }

    @Override
    public Category getCategoryByName(String name) {
        Category category = null;
        try {
            category = categoryMapper.getCategoryByName(name);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("更新分类失败, category:{}, cause:{}", category, e);
        }
        return category;
    }
}
