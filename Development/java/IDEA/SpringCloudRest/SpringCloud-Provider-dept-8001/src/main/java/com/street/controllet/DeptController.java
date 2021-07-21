package com.street.controllet;

import com.street.pojo.Dept;
import com.street.service.impl.DeptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @version 1.0
 * @author: OldStreetHong
 * @date: 2021/7/18 14:01
 * @desc:
 */
//提供restful服务
@RestController

public class DeptController {
    @Autowired
    private DeptServiceImpl deptServiceImpl;

    @PostMapping("dept/add")
    public boolean addDept(Dept dept){

        return deptServiceImpl.addDept(dept);
    }

    @GetMapping("dept/get/{id}")
    public Dept queryById(@PathVariable("id") int id){

        return deptServiceImpl.queryById(id);
    }

    @GetMapping("dept/list")
    public List<Dept> queryAll(){

        return deptServiceImpl.queryAll();
    }
}
