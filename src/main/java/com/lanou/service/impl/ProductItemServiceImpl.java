package com.lanou.service.impl;

import com.lanou.dao.ProductItemMapper;
import com.lanou.dao.ProductMapper;
import com.lanou.model.Discuss;
import com.lanou.model.Ectype;
import com.lanou.model.ProductItem;
import com.lanou.service.ProductItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "productItemService")
public class ProductItemServiceImpl implements ProductItemService {
    @Autowired
    private ProductItemMapper productItemMapper;
    @Autowired
    private ProductMapper productMapper;

    public List<ProductItem> productItem(String prodId){
        List<ProductItem> list = productItemMapper.productItem(prodId);

       for(ProductItem productItem:list){
           //给每个商品的附属商品添加图片地址
           //获取每个商品的所有附属商品对象
           List<Ectype> ectypes = productItem.getEctypes();
           for (Ectype ectype:ectypes){
               //获取每个附属商品的商品编号
               String prodId1 = ectype.getEctId();
               //通过商品编号获取其所有图片地址
               List<String> allImg = productMapper.findAllImg(prodId1);
               //判断其商品是否有图片,如果有,取第一个图片 - 主要因为商品信息录入数据库不全
               if (allImg.size() != 0){
                   ectype.setImgUrl(allImg.get(0));
               }
           }
           //用来存储该商品的所有类名
           List<String> introduces = new ArrayList();
           //查出该商品的父类ID
           Integer parentid = productItem.getParentid();
           //给a赋值,一个跳出死循环的出口
           int a = parentid;
           //循环查询出该商品的所有父级类名
           while (a != 0) {
               //通过该商品的父类ID获取其父级的类名
               String nameById = productItemMapper.findNameById(a);
               introduces.add(nameById);
               //在通过其父类ID找出其再上一级ID
               a = findParentByParentdId(a);
           }
           System.out.println(introduces);
           //将该商品的所有类名按级排序,从大到小
           for(int i = 0; i < introduces.size() / 2; i ++){
               String b = introduces.get(i);
               introduces.set(i, introduces.get(introduces.size() - 1 - i));
               introduces.set(introduces.size() - 1 - i,b);
           }
           productItem.setIntroduces(introduces);

           List<Discuss> allDiscuss = productItem.getAllDiscuss();
           productItem.setDiscussSize(allDiscuss.size());
       }
        return list;
    }

    public Integer findParentByParentdId(Integer parentId){
        Integer pId = productItemMapper.findParentByParentdId(parentId);
        return pId;
    }

}
