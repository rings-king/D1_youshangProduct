package com.lanou.dao;

import com.lanou.model.Sale_item;
import com.lanou.model.Sale_itemKey;

public interface Sale_itemMapper {
    int deleteByPrimaryKey(Sale_itemKey key);

    int insert(Sale_item record);

    int insertSelective(Sale_item record);

    Sale_item selectByPrimaryKey(Sale_itemKey key);

    int updateByPrimaryKeySelective(Sale_item record);

    int updateByPrimaryKey(Sale_item record);
}