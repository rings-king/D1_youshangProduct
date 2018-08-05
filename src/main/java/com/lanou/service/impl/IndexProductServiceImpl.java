package com.lanou.service.impl;

import com.lanou.dao.IndexProductMapper;
import com.lanou.model.IndexProduct;

import com.lanou.service.IndexProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("indexProService")
public class IndexProductServiceImpl implements IndexProductService {

    @Autowired
    private IndexProductMapper indexProductMapper;

    //首页商品展示
    public List<List<IndexProduct>> indexPage(){
        List<List<IndexProduct>> lists = new ArrayList();
        int i = indexProductMapper.indexPageCount();
        for (int j = 0; j < i; j++){
            List<IndexProduct> list = indexProductMapper.indexPage(j);
            lists.add(list);
        }
        return lists;
    }


}
