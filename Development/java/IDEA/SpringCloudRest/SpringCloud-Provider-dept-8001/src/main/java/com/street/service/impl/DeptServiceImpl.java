package com.street.service.impl;

import com.street.dao.DeptDao;
import com.street.pojo.Dept;
import com.street.service.DeptService;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @author: OldStreetHong
 * @date: 2021/7/18 13:58
 * @desc:
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;


    //添加一个部门
    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }


    //查询一个部门
    @Override
    public Dept queryById(int id) {
        return deptDao.queryById(id);
    }


    //查询所有部门
    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}
