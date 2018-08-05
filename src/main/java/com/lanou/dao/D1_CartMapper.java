package com.lanou.dao;

import com.lanou.model.D1_Cart;
import com.lanou.model.Product;

import java.util.List;
import java.util.Map;

public interface D1_CartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(D1_Cart record);

    int insertSelective(D1_Cart record);

    D1_Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(D1_Cart record);

    int updateByPrimaryKey(D1_Cart record);

    D1_Cart selById (Map map);

    List<Product> selectProductByProdId(Integer custId);

    List<Integer> selQuity (Integer custId);
}












