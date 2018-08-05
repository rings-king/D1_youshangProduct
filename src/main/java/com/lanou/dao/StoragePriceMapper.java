package com.lanou.dao;

import com.lanou.model.StoragePrice;

import java.util.Map;

public interface StoragePriceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StoragePrice record);

    int insertSelective(StoragePrice record);

    StoragePrice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StoragePrice record);

    int updateByPrimaryKey(StoragePrice record);

    StoragePrice selAllByProdId (Map map);
}