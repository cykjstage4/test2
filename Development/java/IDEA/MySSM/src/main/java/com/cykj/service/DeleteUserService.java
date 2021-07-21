package com.cykj.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @version 1.0
 * @author: OldStreetHong
 * @date: 2021/6/4 09:20
 * @desc:
 */
public interface DeleteUserService {
    //删除商品
    boolean DeleteUser(HttpServletRequest req, HttpServletResponse resp) throws IOException;
}
