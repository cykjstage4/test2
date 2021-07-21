package com.cykj.mapper;

import com.cykj.bean.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @author: OldStreetHong
 * @date: 2021/6/2 16:42
 * @desc:
 */
@Repository
public interface UserMapper {
    List<User> checkLogin(User user);

    //查找所有用户
    ArrayList<User> selectAllUser();

    //删除用户
    boolean DeleteUser(String ID);
}
