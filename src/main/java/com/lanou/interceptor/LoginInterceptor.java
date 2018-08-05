package com.lanou.interceptor;

import com.lanou.model.Customer;
import com.lanou.service.CustService;
import com.lanou.service.impl.CustServiceImpl;
import com.lanou.util.ServerResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {

        HttpSession session = request.getSession();
        Customer cust = (Customer)session.getAttribute("cust");
        if (cust==null){
            Cookie[] cookies = request.getCookies();
            String custname = "";
            String custpaw = "";

            for (Cookie cookie : cookies) {
                //判断
                if (cookie.getName().equals("user")) {
                    //取出对应的值  wanglong&123
                    String value = cookie.getValue();
                    String[] values = value.split("&");
                    custname = values[0];
                    custpaw = values[1];
                }
            }

            //自动登录
            CustService custService = new CustServiceImpl();
            Customer customer = new Customer();
            customer.setTelNo(custname);
            customer.setCustPaw(custpaw);
            System.out.println(customer);
            Customer user = custService.login(customer);
            if (null != user){
                request.getSession().setAttribute("cust",user);
            }
        }

        return true;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
