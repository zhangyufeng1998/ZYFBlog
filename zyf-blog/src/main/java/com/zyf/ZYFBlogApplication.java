package com.zyf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zyf.mapper")
public class ZYFBlogApplication {
    public static void main(String[] args){
        SpringApplication.run(ZYFBlogApplication.class,args);
    }
}
