package com.cykj.servlet;

import com.cykj.bean.User;
import com.cykj.service.impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @version 1.0
 * @author: OldStreetHong
 * @date: 2021/6/2 16:10
 * @desc:
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Autowired
    private LoginServiceImpl loginServiceImpl;

    @Override
    public void init(ServletConfig config) throws ServletException {
        //Servlet中本来不能使用@Autowired注入bean，解决办法是在Servlet的 init(ServletConfig)方法中调用
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        boolean userlogin = loginServiceImpl.userLogin(req,resp);



    }
}
