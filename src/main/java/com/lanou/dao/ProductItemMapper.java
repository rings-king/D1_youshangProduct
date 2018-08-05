package com.lanou.dao;

import com.lanou.model.ProductItem;

import java.util.List;

public interface ProductItemMapper {
    List<ProductItem> productItem(String prodId);

    //通过商品编号获取其父级商品种类编号
    Integer findParentByParentdId(Integer parentId);

    String findNameById(Integer id);
}
