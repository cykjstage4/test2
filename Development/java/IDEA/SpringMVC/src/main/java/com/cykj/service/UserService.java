package com.cykj.service;

import com.cykj.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @author: OldStreetHong
 * @date: 2021/7/10 13:28
 * @desc:
 */

@Service
public interface UserService {

    //学生登录
    public List<User> studentLogin(@Param("stuacc") String stuacc, @Param("stuidcard") String stuidcard);

}
