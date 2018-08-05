package com.lanou.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lanou.model.Product;
import com.lanou.service.ProductService;
import com.lanou.util.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.TreeSet;

@Controller
@RequestMapping("product")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;


    //查询某一个类的商品
    @ResponseBody
    @RequestMapping("/productsort")
                                //参数1,访问的是哪个大类  参数2,访问商品展示页第几页
    public ServerResponse product(Integer type,Integer pages,Integer order){
                                    //设置一页展示多少个商品
        PageHelper.startPage(pages,4);
        // 根据商品类型访问该类型所有商品
        List<Product> byType = productService.findByType(type,order);
        if (byType.size() == 0){
            ServerResponse serverResponse = ServerResponse.creatError(1, "查询失败");
            return serverResponse;
        }else {
            PageInfo pageInfo = new PageInfo(byType);
            ServerResponse serverResponse = ServerResponse.creatSuccess("查询成功", pageInfo);
            return serverResponse;
        }

    }


    // 根据类别分页展示商品
    @RequestMapping("type")
    @ResponseBody
    public ServerResponse selectType(Integer productSort,Integer pages){
        //传入 商品类别  当前页数
        PageHelper.startPage(pages,10);
        //设置每页展示商品数量
        List<Product> products = productService.selectByType(productSort);
        if (products.size()!=0){
            PageInfo pageInfo = new PageInfo(products);
            return ServerResponse.creatSuccess("分类查询成功",pageInfo);
        }else {
            return ServerResponse.creatError(1,"分类查询失败");
        }

    }

    //模糊查询
    @RequestMapping("selMF")
    @ResponseBody
    public ServerResponse selectByMF(String str){
        Product product = new Product();
        product.setProdId(str);
        product.setProdName(str);
        product.setProdDesc(str);
        List<Product> products = productService.selectByMF(product);


        if (products.size() != 0){
            return ServerResponse.creatSuccess("查到商品",products);
        }else {
            return ServerResponse.creatError(1,"没有该数据");
        }
    }

    @RequestMapping("sortByPrice")
    @ResponseBody
    public ServerResponse sortByPrice(Integer pages){
        PageHelper.startPage(pages,10);
        List<Product> products = productService.sortByPrice();

        if (products.size()!=0){
            PageInfo pageInfo = new PageInfo(products);
            return ServerResponse.creatSuccess("排序成功",pageInfo);
        }else {
            return ServerResponse.creatError(1,"无法排序");
        }

    }


}
