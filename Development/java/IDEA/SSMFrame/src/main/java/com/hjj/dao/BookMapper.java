package com.hjj.dao;

import com.hjj.pojo.Books;

import java.util.List;

/**
 * @version 1.0
 * @author: OldStreetHong
 * @date: 2021/6/7 20:23
 * @desc:
 */
public interface BookMapper {
    //增加一个Book
    int addBook(Books book);

    //根据id删除一个Book
    int deleteBookById(int id);

    //更新Book
    int updateBook(Books books);

    //根据id查询,返回一个Book
    Books queryBookById(int id);

    //查询全部Book,返回list集合
    List<Books> queryAllBook();
}
