package com.lanou.controller;

import com.lanou.model.IndexProduct;
import com.lanou.service.IndexProductService;
import com.lanou.util.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("indexPro")
@CrossOrigin
public class IndexProController {
    @Autowired
    private IndexProductService indexProductService;

    @ResponseBody
    @RequestMapping("/index")
    public ServerResponse indexPage(HttpServletResponse response){
        List<List<IndexProduct>> indexProducts = indexProductService.indexPage();
        ServerResponse serverResponse = null;
        if (indexProducts != null){
            serverResponse = ServerResponse.creatSuccess("查询成功", indexProducts);
            response.setHeader("Access-Control-Allow-Origin", "*");
            return serverResponse;
        }else{
            serverResponse = ServerResponse.creatError(1,"查询失败");
            return serverResponse;
        }

    }
}
