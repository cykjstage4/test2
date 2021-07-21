package com.cykj.service.impl;

import com.cykj.bean.User;
import com.cykj.mapper.UserMapper;
import com.cykj.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @author: OldStreetHong
 * @date: 2021/6/2 16:21
 * @desc:
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> userLisr(User user) {
        List<User> us = userMapper.checkLogin(user);

        return us;
    }

    @Override
    public boolean userLogin(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        String acc = req.getParameter("account");
        String pwd = req.getParameter("pwd");
        String code = req.getParameter("code");
        User us = new User();
        us.setAcc(acc);
        us.setPwd(pwd);
        List<User> users = this.userLisr(us);
        //获取系统生成的验证码
        String validateCode = (String)req.getSession().getAttribute("verificationCode");
        System.out.println("验证码："+validateCode);
        System.out.println(users);
        System.out.println(code);
        //将验证码全部转成小写进行对比
        if ((validateCode.toLowerCase()).equals(code.toLowerCase())){
            if (!users.isEmpty())
            {
                //查询所有的用户
                ArrayList<User> userTables = this.selectAllUser();
                req.getSession().setAttribute("userTables",userTables);
                out.print("ok");
            }else {
                out.print("账号或密码有误");
            }
        }else {
            out.print("验证码错误");
        }



        return true;
    }

    @Override
    public ArrayList<User> selectAllUser() {
        ArrayList<User> us = userMapper.selectAllUser();
        return us;
    }
}
