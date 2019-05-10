package com.atguigu.gmall.ums.service;

import com.atguigu.gmall.ums.entity.Admin;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 后台用户表 服务类
 * </p>
 *
 * @author Mr.Dong
 * @since 2019-05-08
 */
public interface AdminService extends IService<Admin> {

    Admin login(String username, String password);

    /**
     * 获取用户详情
     * */
    Admin getUserInfo(String userName);
}
