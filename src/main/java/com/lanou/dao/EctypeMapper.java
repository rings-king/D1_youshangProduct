package com.lanou.dao;

import com.lanou.model.Ectype;

public interface EctypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ectype record);

    int insertSelective(Ectype record);

    Ectype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ectype record);

    int updateByPrimaryKey(Ectype record);
}