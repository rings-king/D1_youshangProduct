package com.lanou.dao;

import com.lanou.model.Product;
import com.lanou.model.TrCart;

import java.util.List;
import java.util.Map;

public interface TrCartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TrCart record);

    int insertSelective(TrCart record);

    TrCart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TrCart record);

    int updateByPrimaryKey(TrCart record);

    TrCart selectByMap(TrCart trCart);

    List<Product> showAllProduct(Integer custId);

    List<TrCart> showAllTrCart(Integer custId);

    TrCart showProduct(TrCart trCart);

    int deleteOneProduct(TrCart trCart);

    int deleteAllProduct(Integer custId);
}
