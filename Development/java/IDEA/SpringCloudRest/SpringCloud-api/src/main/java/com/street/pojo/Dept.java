package com.street.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @version 1.0
 * @author: OldStreetHong
 * @date: 2021/7/18 10:14
 * @desc:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)     //链式写法
public class Dept implements Serializable {

    private int deptno;
    private String dname;

    //这个数据是看存在哪一个数据库的字段 微服务 一个服务对应一个数据库，同一个信息可能存在不同的数据库
    private String db_source;
}
