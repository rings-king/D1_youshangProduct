package com.lanou.service.impl;

import com.lanou.dao.AreaMapper;
import com.lanou.dao.CityMapper;
import com.lanou.dao.ProvinceMapper;
import com.lanou.model.City;
import com.lanou.model.Province;
import com.lanou.service.ProvinceService;
import com.lanou.util.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("provinceService")
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    private ProvinceMapper provinceMapper;
    @Autowired
    private CityMapper cityMapper;
    @Autowired
    private AreaMapper areaMapper;


    //查询所有省的信息
    public ServerResponse showAllProvince (){
        List<Province> provinces = provinceMapper.selAllProvince();
        if (provinces.size()!=0){
            return ServerResponse.creatSuccess("查询成功",provinces);
        }else {
            return ServerResponse.creatError(1,"查询失败");
        }

    }

    //根据前端返回的code 查询所有市
    public ServerResponse searchCity(String code){
        List<City> cities = cityMapper.searCityByPcode(code);
        if ((cities.size()!=0)){
            return ServerResponse.creatSuccess("查到所有",cities);
        }else {
            return ServerResponse.creatError(1,"没有查到");
        }
    }

    //根据前端返回的citycode 查询旗下的所有的县区
    public List<String> serchArea(String code) {
        List<String> strings = areaMapper.serchAreaBycode(code);
        if (strings.size() != 0) {
            return strings;
        } else {
            return null;
        }

    }

}