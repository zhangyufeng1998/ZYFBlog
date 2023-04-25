package com.zyf.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyf.domain.ResponseResult;
import com.zyf.domain.entity.Article;
import org.apache.poi.ss.formula.functions.T;

public interface ArticleService extends IService<Article> {
    ResponseResult hotArticleList();

    ResponseResult articleList(Integer pageNum, Integer pageSize, Long categoryId);

    ResponseResult getArticleDetail(Long id);

}
