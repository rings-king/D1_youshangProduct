package com.lanou.controller;

import com.lanou.model.Customer;
import com.lanou.model.Shiping;
import com.lanou.service.CustService;
import com.lanou.util.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@Controller
@RequestMapping(value = "customer")
@CrossOrigin
public class CustController {
    @Autowired
    private CustService custService;

    //注册
    @RequestMapping(value = "register",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> register(Customer customer){
        ServerResponse<String> register = custService.register(customer);
        if (register.getErrorCode()==0&customer.getTelNo()!=null){
            return ServerResponse.creatSuccess("成功",customer);
        }else {
            return ServerResponse.creatError(1,"注册失败");
        }

    }

    //登录
    @RequestMapping(value = "login")
    @ResponseBody
    public  ServerResponse<String> login(Customer customer, HttpServletRequest request, HttpServletResponse response) throws Exception{

        Customer customer1 = custService.login(customer);
        HttpSession session = request.getSession();
        //取出保存在session 中的验证码值
        Object mycode = session.getAttribute("mycode");
        System.out.println("mycode"+mycode);
        //接收到 前端传过来的值
        String ncode = request.getParameter("Ncode");
        System.out.println("Ncode"+ncode);
        //判断用户是否查询到
        if (customer1!=null){
            //判断是否验证码匹配
            if (mycode.equals(ncode)){
                Cookie cookie = new Cookie("user",customer1.getTelNo()+"&"+customer1.getCustPaw());
                cookie.setPath("/");
                String autoLogin = request.getParameter("auto");
                System.out.println(autoLogin);
                if (autoLogin != null){
                    //判断
                    cookie.setMaxAge(Integer.MAX_VALUE);
                }else {
                    cookie.setMaxAge(0);
                }
                response.addCookie(cookie);
                request.getSession().setAttribute("cust",customer);
                System.out.println(customer);
                //request.getRequestDispatcher("/resource/views/index.jsp").forward(request,response);
                return  ServerResponse.creatSuccess("登陆成功",customer1);

            }else {
                return  ServerResponse.creatError(1,"验证码错误");
            }
        }else {

            // request.getRequestDispatcher("/resource/views/login.jsp").forward(request,response);
            return ServerResponse.creatError(1,"用户名或密码错误登录失败");
        }

    }

    //注销用户
    @RequestMapping("logout")
    @ResponseBody
    public ServerResponse<String> logout(HttpSession session ){
        session.removeAttribute("cust");
        return ServerResponse.creatSuccess("注销成功","");

    }

    //添加收货地址
    @RequestMapping("addAddrce")
    @ResponseBody
    public ServerResponse addAddrce(Shiping shiping ,HttpSession session){
        Customer customer =(Customer)session.getAttribute("customer");
        //添加地址前 判断是否等录
        if (customer==null){
            //未登录
            return ServerResponse.creatError(1,"请先登录");
        }else {
            //登录 调用添加地址的方法
            return custService.addAdress(shiping,customer.getCustId());
        }
    }


    //删除收货地址
    @RequestMapping("delteAddrce")
    @ResponseBody
    public ServerResponse delteAddrce(Integer custId,Integer shipId){
        int i = custService.deleteAdress(custId, shipId);

        if (i>0){
            return ServerResponse.creatSuccess("删除成功",i);
        }else {
            return ServerResponse.creatError(1,"删除失败");
        }
    }










}