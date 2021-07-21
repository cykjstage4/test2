package com.cykj.service.Impl;

import com.cykj.bean.User;
import com.cykj.mapper.UserMapper;
import com.cykj.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @author: OldStreetHong
 * @date: 2021/7/10 13:28
 * @desc:
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    /**
     * @Description: 学生登录
     * @Param:
     * @Author: BWL
     * @Date: 2021-06-14 16:35
     */
    @Override
    public List<User> studentLogin(@Param("stuacc") String stuacc, @Param("stuidcard") String stuidcard) {
        List<User> falgk = userMapper.studentLogin(stuacc,stuidcard);
        return falgk;
    }

}
