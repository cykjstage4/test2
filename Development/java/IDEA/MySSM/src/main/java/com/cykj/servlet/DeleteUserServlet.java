package com.cykj.servlet;

import com.cykj.service.impl.DeleteUserServiceImpl;
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
 * @date: 2021/6/4 09:17
 * @desc:
 */
@WebServlet("/deleteUser")
public class DeleteUserServlet extends HttpServlet {
    @Autowired
    private DeleteUserServiceImpl deleteUserService;

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
        //删除用户
        deleteUserService.DeleteUser(req,resp);
    }
}
