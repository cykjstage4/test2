package com.cykj.service;

import com.cykj.bean.ProductTable;
import com.cykj.bean.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @version 1.0
 * @author: OldStreetHong
 * @date: 2021/6/3 16:03
 * @desc:
 */
public interface ProductService {
    //查询所有商品
   boolean selectProduct(HttpServletRequest req, HttpServletResponse resp) throws IOException;

   //单个修改操作
   boolean queryProduct(HttpServletRequest req, HttpServletResponse resp) throws IOException;

   //更新商品
    boolean updataProduct(HttpServletRequest req, HttpServletResponse resp) throws IOException;
}
