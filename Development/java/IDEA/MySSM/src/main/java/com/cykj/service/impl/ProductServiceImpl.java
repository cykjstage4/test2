package com.cykj.service.impl;

import com.cykj.bean.ProductTable;
import com.cykj.mapper.ProductMapper;
import com.cykj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * @version 1.0
 * @author: OldStreetHong
 * @date: 2021/6/3 16:04
 * @desc:
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    //查找所有用户
    @Override
    public boolean selectProduct(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ArrayList<ProductTable> productTables = productMapper.selectProduct();
        req.getSession().setAttribute("productTables", productTables);
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.print("ok");
        return true;
    }

    @Override
    public boolean queryProduct(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String id = req.getParameter("id");  //商品的id
        System.out.println(id);
        ArrayList<ProductTable> productTables = productMapper.queryProduct(id);
        req.getSession().setAttribute("produc", productTables);
        PrintWriter out = resp.getWriter();
        out.print("ok");
        return false;
    }

    @Override
    public boolean updataProduct(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String id = req.getParameter("id");  //商品的id
        String number = req.getParameter("number");
        String name = req.getParameter("name");
        String stattingPrice = req.getParameter("stattingPrice");
        String type = req.getParameter("type");
        String img = req.getParameter("img");
        String brief = req.getParameter("brief");
        ProductTable productTable = new ProductTable();
        productTable.setID(id);
        productTable.setNumber(number);
        productTable.setName(name);
        productTable.setStattingPrice(1233);
        productTable.setType(type);
        productTable.setImg(img);
        productTable.setBrief(brief);
        boolean updataProduct =  productMapper.updataProduct(productTable);
        PrintWriter out = resp.getWriter();
        out.print("修改成功");
        System.out.println(updataProduct);

        return false;
    }

}
