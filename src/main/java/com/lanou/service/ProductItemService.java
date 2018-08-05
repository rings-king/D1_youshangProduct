package com.lanou.service;

import com.lanou.model.ProductItem;

import java.util.List;

public interface ProductItemService {

    List<ProductItem> productItem(String prodId);

    Integer findParentByParentdId(Integer parentId);
}
