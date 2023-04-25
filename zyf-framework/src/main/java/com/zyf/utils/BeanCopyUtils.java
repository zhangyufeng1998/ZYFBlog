package com.zyf.utils;

import com.zyf.domain.entity.Article;
import com.zyf.domain.vo.HotArticleVo;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

public class BeanCopyUtils {
    private BeanCopyUtils() {

    }

    public static <V> V copyBean(Object source, Class<V> clazz) {
        // 创建目标对象
        V result = null;
        try {
            result = clazz.newInstance();
            //实现属性copy
            BeanUtils.copyProperties(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //返回结果
        return result;
    }

    public static <O,V> List<V> copyBeanList(List<O> list, Class<V> clazz) {
        return list.stream()
                .map(o -> copyBean(o, clazz))
                .collect(Collectors.toList());  //收集到list中

    }

//    public static void main(String[] args) {
//        Article article = new Article();
//        article.setId(1L);
//        article.setTitle("测试");
//
//        HotArticleVo hotArticleVo = copyBean(article, HotArticleVo.class);
//        System.out.println(hotArticleVo);
//
//    }

}
