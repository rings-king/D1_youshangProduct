package com.lanou.controller;

import com.lanou.model.ProductItem;
import com.lanou.service.ProductItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("productItem")
@CrossOrigin
public class ProductItemController {
    @Autowired
    private ProductItemService productItemService;

    @ResponseBody
    @RequestMapping("/product")
    public List<ProductItem> productItem(String prodId){


        List<ProductItem> lists = productItemService.productItem(prodId);
//        for (ProductItem productItem:lists){
//            System.out.println(productItem);
//        }

        return lists;
//        if (lists.size() == 0){
//            ServerResponse serverResponse = ServerResponse.creatError(1, "失败");
//            return serverResponse;
//        }else {
//            ServerResponse serverResponse = ServerResponse.creatSuccess("成功", lists);
//            return serverResponse;
//        }

    }
}
