package com.lanou.controller;


import com.lanou.model.ShoppingCart;
import com.lanou.model.TrCart;
import com.lanou.service.TrCartService;
import com.lanou.util.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("trCart")
@CrossOrigin
public class TrCartController {

    @Autowired
    private TrCartService trCartService;


    //向某个用户购物车中添加一个商品
    @ResponseBody
    @RequestMapping("/addProduct")
    public ServerResponse addProduct(String prodId,Integer custId,Integer count,Integer sfId){
        TrCart trCart = new TrCart();
        trCart.setProductId(prodId);
        trCart.setCustId(custId);
        trCart.setQuantity(count);
        trCart.setSfId(sfId);
        boolean b = trCartService.addProduct(trCart);
        if (b == true){
            ServerResponse.creatSuccess("成功",b);
        }
        return null;
    }

    //更新某个用户购物车中商品的数量
    @ResponseBody
    @RequestMapping("/addProduct/updateTrCart")
    public ServerResponse updateTrCart(String prodId,Integer custId,Integer count,Integer sfId){
        TrCart trCart = new TrCart();
        trCart.setProductId(prodId);
        trCart.setCustId(custId);
        trCart.setQuantity(count);
        trCart.setSfId(sfId);
        int i = trCartService.updateTrCart(trCart);
        if (i != 0) {
            ServerResponse serverResponse = ServerResponse.creatSuccess("更新成功", i);
            return serverResponse;
        }else {
            ServerResponse serverResponse = ServerResponse.creatError(1, "更新失败");
            return serverResponse;
        }
    }

    //展示某个用户购物车中所有商品
    @ResponseBody
    @RequestMapping("/showAllProduct")
    public  ServerResponse showAllProduct(Integer custId){
        ShoppingCart shoppingCart = trCartService.showAllProduct(custId);
        if (shoppingCart.getTrCarts().size() == 0){
            ServerResponse serverResponse = ServerResponse.creatError(1, "失败");
            return serverResponse;
        }else {
            ServerResponse serverResponse = ServerResponse.creatSuccess("成功", shoppingCart);
            return serverResponse;
        }
    }

    //删除某个用户购物车中某一个商品
    @ResponseBody
    @RequestMapping("/deleteOneProduct")
    public ServerResponse deleteOneProduct(Integer custId,String prodId,Integer sfId){
        TrCart trCart = new TrCart();
        trCart.setProductId(prodId);
        trCart.setCustId(custId);
        trCart.setSfId(sfId);
        int i = trCartService.deleteOneProduct(trCart);
        if ( i != 0){
            ServerResponse serverResponse = ServerResponse.creatSuccess("删除单个商品成功", i);
            return serverResponse;
        }else {
            ServerResponse serverResponse = ServerResponse.creatError(1, "删除单个商品失败");
            return serverResponse;
        }
    }

    //清空某个用户购物车中所有商品
    @ResponseBody
    @RequestMapping("/deleteAllProduct")
    public ServerResponse deleteAllProduct(Integer custId){
        int i = trCartService.deleteAllProduct(custId);
        if (i != 0) {
            ServerResponse serverResponse = ServerResponse.creatSuccess("清空购物车成功", i);
            return serverResponse;
        }else {
            ServerResponse serverResponse = ServerResponse.creatError(1, "清空购物车失败");
            return serverResponse;
        }
    }


}
