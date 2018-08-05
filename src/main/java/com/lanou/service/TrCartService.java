package com.lanou.service;

import com.lanou.model.ShoppingCart;
import com.lanou.model.TrCart;


public interface TrCartService {
    boolean addProduct(TrCart trCart);

    ShoppingCart showAllProduct(Integer custId);

    int deleteOneProduct(TrCart trCart);

    int deleteAllProduct(Integer custId);

    int updateTrCart(TrCart trCart);
}
