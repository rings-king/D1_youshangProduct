package com.lanou.controller;

import com.lanou.service.ProvinceService;
import com.lanou.util.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class ProvinceController {
    @Autowired
    private ProvinceService provinceService;


    @RequestMapping("showProvince")
    @ResponseBody
    public ServerResponse showProvince(){
        ServerResponse serverResponse = provinceService.showAllProvince();
        if (serverResponse.getErrorCode()==0){
            return serverResponse;
        }else {
            return ServerResponse.creatError(1,"显示失败");
        }

    }

    @RequestMapping("serCity")
    @ResponseBody
    public ServerResponse serCity(String code){
        ServerResponse serverResponse = provinceService.searchCity(code);
        if (serverResponse.getErrorCode()==0){
            return serverResponse;
        }else {
            return ServerResponse.creatError(1,"找不到");
        }
    }

    @RequestMapping("serArea")
    @ResponseBody
    public ServerResponse serArea(String code){
        List<String> strings = provinceService.serchArea(code);

        if (strings!=null){
            return ServerResponse.creatSuccess("查到",strings);
        }else {
            return ServerResponse.creatError(1,"没查到");
        }
    }



}