package com.street.service;

import com.street.pojo.Dept;

import java.util.List;

/**
 * @version 1.0
 * @author: OldStreetHong
 * @date: 2021/7/18 13:57
 * @desc:
 */
public interface DeptService {
    //添加一个部门
    public boolean addDept(Dept dept);
    //查询一个部门
    public Dept queryById(int id);
    //查询所有部门
    public List<Dept> queryAll();
}
