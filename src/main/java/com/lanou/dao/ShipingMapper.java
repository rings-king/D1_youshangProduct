package com.lanou.dao;

import com.lanou.model.Shiping;

import java.util.Map;

public interface ShipingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shiping record);

    int insertSelective(Shiping record);

    Shiping selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shiping record);

    int updateByPrimaryKey(Shiping record);

    int deleteByCustId(Map map);
}