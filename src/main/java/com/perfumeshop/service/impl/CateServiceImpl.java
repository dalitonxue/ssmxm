package com.perfumeshop.service.impl;


import com.perfumeshop.dao.CategoryMapper;
import com.perfumeshop.entity.Category;
import com.perfumeshop.entity.CategoryExample;
import com.perfumeshop.service.CateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cateService")
public class CateServiceImpl implements CateService {

    @Autowired(required = false)
    CategoryMapper categoryMapper;

    @Override
    public List<Category> selectByExample(CategoryExample example) {
        return categoryMapper.selectByExample(example);
    }

    @Override
    public void insertSelective(Category category) {
        categoryMapper.insertSelective(category);
    }

    @Override
    public List<Category> selectByExampleLimit(CategoryExample digCategoryExample) {
        return categoryMapper.selectByExampleLimit(digCategoryExample);
    }

    @Override
    public Category selectById(Integer category) {
        return categoryMapper.selectByPrimaryKey(category);
    }

    @Override
    public void updateByPrimaryKeySelective(Category category) {
        categoryMapper.updateByPrimaryKeySelective(category);
    }

    @Override
    public void deleteByPrimaryKey(Integer cateid) {
        categoryMapper.deleteByPrimaryKey(cateid);
    }
}
