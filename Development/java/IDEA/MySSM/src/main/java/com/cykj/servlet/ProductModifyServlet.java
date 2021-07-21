package com.cykj.servlet;

import com.cykj.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @version 1.0
 * @author: OldStreetHong
 * @date: 2021/6/3 16:54
 * @desc:
 */
@WebServlet("/productModify")
public class ProductModifyServlet extends HttpServlet {
    @Autowired
    private ProductServiceImpl productService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        //Servlet中本来不能使用@Autowired注入bean，解决办法是在Servlet的 init(ServletConfig)方法中调用
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //查询商品信息
        boolean b = productService.queryProduct(req,resp);
    }
}
