package com.lanou.service;

import com.lanou.model.Product;

import java.util.List;

public interface ProductService {

    // 根据商品类型访问该类型所有商品
    List<Product> findByType(Integer type,Integer order);

    public List<Product> selectByType(Integer productSort);

    public List<Product> selectByMF(Product pro);

    public List<Product> sortByPrice();
}
