package com.lanou.dao;

import com.lanou.model.Customer;

public interface CustomerMapper {
    int deleteByPrimaryKey(Integer custId);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer custId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    int checkedTel(String str);

    Customer selectNoAndPaw (Customer customer);
}