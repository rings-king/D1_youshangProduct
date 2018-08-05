package com.lanou.service.impl;

import com.lanou.dao.CustomerMapper;
import com.lanou.dao.ShipingMapper;
import com.lanou.model.Customer;
import com.lanou.model.Shiping;
import com.lanou.service.CustService;
import com.lanou.util.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import java.util.HashMap;
import java.util.Map;


@Service("custService")
public class CustServiceImpl implements CustService {
    @Autowired
    private CustomerMapper customerMapper;
    @Autowired
    private ShipingMapper shipingMapper;
    //注册
    @Transactional
    public ServerResponse<String> register(Customer customer){
        //判断是否用户已经注册过
        int tel = customerMapper.checkedTel(customer.getTelNo());
        if (tel>0){
            return ServerResponse.creatError(1,"用户已存在");
        }
        int i = customerMapper.insertSelective(customer);

        if (i>0){
            return ServerResponse.creatSuccess("注册成功",customer);
        }

        return ServerResponse.creatError(1,"注册失败");

    }

    //登录
    public Customer login(Customer customer ){
        Customer customers = customerMapper.selectNoAndPaw(customer);
        System.out.println(customers);
        //判断数据库中是否有该用户的账户和密码
        if (customers==null){
            //如果查询没有结果 返回空 用户不存在
            return customers;
        }else

            return customers;
    }



    //添加用户收货地址
    @Transactional
    public ServerResponse addAdress(Shiping shiping ,Integer custId){

        shiping.setCustId(custId);
        int i = shipingMapper.insertSelective(shiping);

        if (i>0){
            Map map = new HashMap();
            map.put("shipingId",shiping.getId());
            return ServerResponse.creatSuccess("新建地址成功",map);
        }else {
            return ServerResponse.creatError(1,"新建地址失败");
        }

    }

    //删除收货地址
    @Transactional
    public int deleteAdress(Integer custId,Integer shipId){
        Map map = new HashMap();
        map.put("custId",custId);
        map.put("id",shipId);
        int i = shipingMapper.deleteByCustId(map);
        return i;
    }








}