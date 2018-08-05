package com.lanou.service;

import com.lanou.util.ServerResponse;

import java.util.List;

public interface ProvinceService {

    public ServerResponse showAllProvince ();

    public ServerResponse searchCity(String code);

    public List<String> serchArea(String code);
}