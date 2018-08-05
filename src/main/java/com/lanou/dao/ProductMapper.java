package com.lanou.dao;

import com.lanou.model.Product;
import com.lanou.model.StoragePrice;

import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    //查询某个类的所有商品
    List<Product> findByType(Integer type);

    //查询某个商品的所有图片
    List<String> findAllImg(String prodId);

    //通过商品编号查询其已有评论个数
    Integer findDiscussSize(String prodId);

    //通过商品编号查询其对应的规格物品的价格以及库存量
    List<StoragePrice> findStoragePrice(String prodId);

    List<Product> selectByType(Integer parentId);

    List<Product> selectByMF(Product pro);

    List<Product> sortByPrice();

    Product selectAllByProd_id(String prodId);

}