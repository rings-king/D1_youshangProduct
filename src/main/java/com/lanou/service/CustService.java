package com.lanou.service;

import com.lanou.model.Customer;
import com.lanou.model.Shiping;
import com.lanou.util.ServerResponse;

public interface CustService {
    //注册
    public ServerResponse<String> register(Customer customer);
    //登录
    public Customer login(Customer customer);

    //添加地址
    public ServerResponse addAdress(Shiping shiping , Integer custId);

    public int deleteAdress(Integer custId,Integer shipId);

}