package com.how2java.tmall.service.impl;
import com.how2java.tmall.mapper.CategoryMapper;
import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CategoryServiceImpl  implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;
    @Override
    public List<Category> list(){
        return categoryMapper.list();
    }
    @Override
    public void add(Category category) {
        categoryMapper.add(category);
    }
    @Override
    public void delete(Integer id) {
        categoryMapper.delete(id);
    }
    @Override
    public Category get(int id) {
        return categoryMapper.get(id);
    };
    @Override
    public void update(Category category) {
        categoryMapper.update(category);
    };
}