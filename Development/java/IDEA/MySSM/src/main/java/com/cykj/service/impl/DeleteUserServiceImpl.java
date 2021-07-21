package com.cykj.service.impl;

import com.cykj.mapper.UserMapper;
import com.cykj.service.DeleteUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @version 1.0
 * @author: OldStreetHong
 * @date: 2021/6/4 09:22
 * @desc:
 */
@Service
public class DeleteUserServiceImpl implements DeleteUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean DeleteUser(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String id = req.getParameter("id");  //用户的id
        System.out.println(id);
        boolean DeleteUser = userMapper.DeleteUser(id);
        PrintWriter out = resp.getWriter();
        out.print("修改成功");

        return false;
    }
}
