package com.lanou.dao;

import com.lanou.model.IndexProduct;

import java.util.List;

public interface IndexProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IndexProduct record);

    int insertSelective(IndexProduct record);

    IndexProduct selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IndexProduct record);

    int updateByPrimaryKey(IndexProduct record);

    List<IndexProduct> indexPage(Integer type);

    int indexPageCount();
}