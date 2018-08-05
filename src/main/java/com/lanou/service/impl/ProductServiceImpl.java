package com.lanou.service.impl;

import com.lanou.dao.ProductMapper;
import com.lanou.model.Product;
import com.lanou.model.StoragePrice;
import com.lanou.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.TreeSet;

@Service("service")
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    //查询某个类的所有商品
    public List<Product> findByType(Integer type,Integer order) {
        List<Product> list = productMapper.findByType(type);
        for(Product product : list){
            //获取商品的商品编号
            String prodId = product.getProdId();
            //获取商品的所有图片
            List<String> allImg = productMapper.findAllImg(prodId);
            if (allImg.size() != 0) {
                String s = allImg.get(0);
                product.setImgUrl(s);
            }
            //通过商品编号获取其评论个数
            Integer size = productMapper.findDiscussSize(prodId);
            product.setDiscussSize(size);
            //通过商品编号获取其所有可能的一组价格
            List<StoragePrice> lists = productMapper.findStoragePrice(prodId);
            if (lists.size() != 0) {
                StoragePrice storagePrice = lists.get(0);
                product.setUnitPrice(storagePrice.getUnitPrice());
                product.setMkPrice(storagePrice.getMkPrice());
                product.setStorage(storagePrice.getStorage());
            }
        }
        for (Product product:list){
            System.out.println(product);
        }
        System.out.println("++++++++++++++++++++++++++++");
        if(null == order){
            return list;
        }else if (order == 1){
            List<Product> listByPrice = sortByPrice(list);
            System.out.println(list);
            return listByPrice;
        }else {
            return list;
        }

    }

    //按价格排序
    public List<Product> sortByPrice(List<Product> list){
        TreeSet<Product> treeSet = new TreeSet();
        for (int i = 0; i < list.size(); i++){
            treeSet.add(list.get(i));
        }
        list.clear();
        list.addAll(treeSet);
        return list;
    }



    //分类查询
    public List<Product> selectByType(Integer productSort){
        List<Product> products = productMapper.selectByType(productSort);
        return products;
    }

    //模糊查询str
    public List<Product> selectByMF(Product pro){
        List<Product> products = productMapper.selectByMF(pro);
        return products;
    }

    //按价格排序
    public List<Product> sortByPrice(){
        List<Product> products = productMapper.sortByPrice();
        return products;
    }
}
