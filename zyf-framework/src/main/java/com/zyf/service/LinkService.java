package com.zyf.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyf.domain.ResponseResult;
import com.zyf.domain.entity.Link;


/**
 * 友链(Link)表服务接口
 *
 * @author makejava
 * @since 2023-04-25 19:31:05
 */
public interface LinkService extends IService<Link> {

    ResponseResult getAllLink();
}
