package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.pms.entity.ProductAttributeCategory;
import com.atguigu.gmall.vo.PageInfoVo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 产品属性分类表 服务类
 * </p>
 *
 * @author Mr.Dong
 * @since 2019-05-08
 */
public interface ProductAttributeCategoryService extends IService<ProductAttributeCategory> {

    //分页查询所有商品属性分类
    PageInfoVo productAttributeCategoryPageInfo(Integer pageNum,Integer pageSize);
}
