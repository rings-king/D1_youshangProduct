package com.lanou.dao;

import com.lanou.model.Discuss;

public interface DiscussMapper {
    int deleteByPrimaryKey(Integer disId);

    int insert(Discuss record);

    int insertSelective(Discuss record);

    Discuss selectByPrimaryKey(Integer disId);

    int updateByPrimaryKeySelective(Discuss record);

    int updateByPrimaryKey(Discuss record);

    int findDiscussSize(String prodId);
}