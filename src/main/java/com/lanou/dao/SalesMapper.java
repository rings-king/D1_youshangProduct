package com.lanou.dao;

import com.lanou.model.Sales;

public interface SalesMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Sales record);

    int insertSelective(Sales record);

    Sales selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(Sales record);

    int updateByPrimaryKey(Sales record);
}