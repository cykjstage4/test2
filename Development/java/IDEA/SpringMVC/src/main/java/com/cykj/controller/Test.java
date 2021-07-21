package com.cykj.controller;

import com.cykj.bean.User;
import com.cykj.service.UserService;
import com.google.gson.Gson;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @version 1.0
 * @author: OldStreetHong
 * @date: 2021/7/10 13:28
 * @desc:
 */

@Controller
@RequestMapping("/admin")
public class Test {

    @Autowired
    private UserService userService;

    Gson gson = new Gson();

//登录页
    @RequestMapping("/test")
    public String test() {
        System.out.println("登录页");
        return "Test";
    }


//登录按钮
    @RequestMapping("/login")
    public String login(String userName, String password) {
        System.out.println("登录");
        System.out.println(userName);
        System.out.println(password);
        return "FirstPage";
    }


//注册页
    @RequestMapping("/registery")
    public String registery() {
        System.out.println("注册页");
        return "Register";
    }

//注册按钮
    @RequestMapping("/register")
    public String register() {
        System.out.println("注册");
        return "Test";
    }

//ajax登录
    @PostMapping("/ajaxLogin")
    public @ResponseBody
    User ajaxLogin(String stuacc, String stuidcard, HttpSession httpSession) {
        System.out.println(stuacc);
        System.out.println(stuidcard);
        User user = new User();
        if (stuacc != null) {
            user.setStuacc(stuacc);
        }
        if (stuidcard != null) {
            user.setStuidcard(stuidcard);
        }
        if (stuacc != null && stuidcard != null) {
            List<User> studentLogin = userService.studentLogin(stuacc, stuidcard);
            System.out.println(studentLogin);
        }
//        String json = gson.toJson(user);
//        return json;
        return user;
    }

    @ResponseBody
    @RequestMapping("/login")
    public String Hello(User user){

        return "success";
    }
}
