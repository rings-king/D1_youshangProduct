package com.lanou.dao;

import com.lanou.model.ProdImg;

import java.util.List;

public interface ProdImgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProdImg record);

    int insertSelective(ProdImg record);

    ProdImg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProdImg record);

    int updateByPrimaryKey(ProdImg record);

    List<String> seluelById(String prodId);


}