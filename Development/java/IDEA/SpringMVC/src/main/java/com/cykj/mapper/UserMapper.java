package com.cykj.mapper;

import com.cykj.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version 1.0
 * @author: OldStreetHong
 * @date: 2021/7/10 13:28
 * @desc:
 */
@Repository
public interface UserMapper {

    //学生登录
    public List<User> studentLogin(@Param("stuacc") String stuacc, @Param("stuidcard") String stuidcard);

}
