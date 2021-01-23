package com.how2java.tmall.controller;

import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.service.CategoryService;
import com.how2java.tmall.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("test")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping("category_select")
    @ResponseBody
    public Result list() throws Exception {
        List<Category> list = categoryService.list();
        Result result = new Result();
        result.setCode(200);
        result.setMsg("获取数据成功");
        result.add("data", list);
        return result;
    }
    @RequestMapping(value="category_add",method= RequestMethod.GET)
    @ResponseBody
    public Result add(@RequestParam String name) throws Exception {
        Category category = new Category();
        category.setName(name);
        categoryService.add(category);
        Result result = new Result();
        result.setCode(200);
        result.setMsg("添加成功");
        return result;
    }
    @RequestMapping(value="category_delById",method= RequestMethod.GET)
    @ResponseBody
    public Result add(@RequestParam Integer id) throws Exception {
        Result result = new Result();
        result.setCode(200);
        result.setMsg("删除成功");
        categoryService.delete(id);
        return result;
    }
    @RequestMapping(value="category_getById",method= RequestMethod.GET)
    @ResponseBody
    public Result get(@RequestParam Integer id) throws Exception {
        Category category = categoryService.get(id);
        Result result = new Result();
        result.setCode(200);
        result.setMsg("查询成功");
        result.add("data", category);
        return result;
    }
    @RequestMapping(value="category_update",method= RequestMethod.GET)
    @ResponseBody
    public Result update(@RequestParam Integer id, String name) throws Exception {
        Category category = categoryService.get(id);
        category.setName(name);
        categoryService.update(category);
        Result result = new Result();
        result.setCode(200);
        result.setMsg("更新成功");
        return result;
    }
}