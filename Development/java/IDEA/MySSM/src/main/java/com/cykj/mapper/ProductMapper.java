package com.cykj.mapper;

import com.cykj.bean.ProductTable;
import com.cykj.bean.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * @version 1.0
 * @author: OldStreetHong
 * @date: 2021/6/3 15:56
 * @desc:
 */
@Repository
public interface ProductMapper {
    //查找所有商品
    ArrayList<ProductTable> selectProduct();

    //查找单个商品信息
    ArrayList<ProductTable> queryProduct(String ID);

    //修改商品信息
    boolean updataProduct(ProductTable productTable);
}
