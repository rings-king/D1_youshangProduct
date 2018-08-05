package com.lanou.service.impl;

import com.lanou.dao.ProductMapper;
import com.lanou.dao.TrCartMapper;
import com.lanou.model.ShoppingCart;
import com.lanou.model.TrCart;
import com.lanou.service.TrCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service("trCartService")
public class TrCartServiceImpl implements TrCartService {
    @Autowired
    private TrCartMapper trCartMapper;
    @Autowired
    private ProductMapper productMapper;



    public boolean addProduct(TrCart trCart) {
        Integer custId = trCart.getCustId();
        String productId = trCart.getProductId();
        if (null == custId || null == productId){
           return false;
        }else {
            TrCart trCart1 = trCartMapper.selectByMap(trCart);
            if (trCart1 != null){
                Integer quantity = trCart.getQuantity();
                trCart1.setQuantity(quantity + trCart1.getQuantity());
                trCart1.setUpdateTime(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(System.currentTimeMillis())));
                int i = trCartMapper.updateByPrimaryKeySelective(trCart1);
               if (i != 0){
                   System.out.println("添加成功");
                    return true;
               }else {
                   System.out.println("插入失败");
                   return false;
               }
            }else {
                trCart.setCreatTime(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(System.currentTimeMillis())));
                int i = trCartMapper.insertSelective(trCart);
                if (i != 0){
                    System.out.println("添加成功");
                    return true;
                }else {
                    System.out.println("添加失败方");
                    return false;
                }
            }
        }


    }

    public ShoppingCart showAllProduct(Integer custId) {
        int count = 0;
        float total = 0;
        List<TrCart> lists = new ArrayList();
        List<TrCart> trCarts = trCartMapper.showAllTrCart(custId);
        for (TrCart trCart:trCarts){
            //获取该用户购物车中商品的数量
            Integer quantity = trCart.getQuantity();
            count += quantity;

            TrCart trCart1 = trCartMapper.showProduct(trCart);
            //获取该用户购物车中商品的所有价格
            String unitPrice = trCart1.getProduct().getStorageprice().getUnitPrice();
            float v = Float.parseFloat(unitPrice);
            total += v * quantity;

            String productId = trCart1.getProductId();
            List<String> allImg = productMapper.findAllImg(productId);
            if (allImg.size() != 0){
                trCart1.getProduct().setImgUrl(allImg.get(0));
            }
            lists.add(trCart1);
        }
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setTrCarts(lists);
        shoppingCart.setCount(count);
        String money = "" + total;
        shoppingCart.setAllMoney(money);
        return shoppingCart;
    }

    public int deleteOneProduct(TrCart trCart) {
        int i = trCartMapper.deleteOneProduct(trCart);
        return i;
    }

    public int deleteAllProduct(Integer custId) {
        int i = trCartMapper.deleteAllProduct(custId);
        return i;
    }

    public int updateTrCart(TrCart trCart) {
        int i = trCartMapper.updateByPrimaryKeySelective(trCart);
        if( i != 0){
            if (trCart.getQuantity() == 0){
                trCartMapper.deleteOneProduct(trCart);
            }
        }
        return i;
    }


}
