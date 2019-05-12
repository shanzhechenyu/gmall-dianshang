package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.pms.entity.ProductCategory;
import com.atguigu.gmall.vo.product.PmsProductCategoryWithChildrenItem;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 产品分类 服务类
 * </p>
 *
 * @author Mr.Dong
 * @since 2019-05-08
 */
public interface ProductCategoryService extends IService<ProductCategory> {

    // 查询所有一级分类及子分类,查询任意菜单以及它下面的子菜单
    List<PmsProductCategoryWithChildrenItem> listCatelogWithChilder(Integer i);
}
