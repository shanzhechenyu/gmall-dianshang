package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.pms.entity.Product;

import com.atguigu.gmall.vo.PageInfoVo;
import com.atguigu.gmall.vo.product.PmsProductQueryParam;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 商品信息 服务类
 * </p>
 *
 * @author Mr.Dong
 * @since 2019-05-08
 */

public interface ProductService extends IService<Product> {

    /**
     * 根据复杂查询条件返回分页数据
     * */
    PageInfoVo productPageInfo(PmsProductQueryParam productQueryParam);
}
