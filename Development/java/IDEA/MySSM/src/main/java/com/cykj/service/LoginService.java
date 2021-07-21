package com.cykj.service;

import com.cykj.bean.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @author: OldStreetHong
 * @date: 2021/6/2 16:17
 * @desc:
 */

public interface LoginService {
    //用户查找
    List<User> userLisr(User user);
    //用户登陆实现
    boolean userLogin(HttpServletRequest req, HttpServletResponse resp) throws IOException;
    //查找所有用户
    //查找所有用户
    ArrayList<User> selectAllUser();

}
