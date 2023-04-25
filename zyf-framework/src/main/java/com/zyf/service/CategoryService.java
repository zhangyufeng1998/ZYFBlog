package com.zyf.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyf.domain.ResponseResult;
import com.zyf.domain.entity.Category;


/**
 * 分类表(Category)表服务接口
 *
 * @author makejava
 * @since 2023-04-18 11:57:55
 */
public interface CategoryService extends IService<Category> {

    ResponseResult getCategoryList();
}
