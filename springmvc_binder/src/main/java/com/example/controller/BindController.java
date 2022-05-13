package com.example.controller;

import com.example.pojo.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Controller
public class BindController {

    //@RequestParam注解用于当客户端提交的参数名称跟处理器（方法）的形参名称不相同的时候进行手动绑定
    @RequestMapping(value = "/simpleparam",method = RequestMethod.POST)
    public void getParams(@RequestParam("param1") int intdata,@RequestParam("param2") float floatdata, double param3, char param4, boolean param5, String param6, HttpServletResponse response) throws IOException {
        System.out.println(intdata);
        System.out.println(floatdata);
        System.out.println(param3);
        System.out.println(param4);
        System.out.println(param5);
        System.out.println(param6);
        response.getWriter().print("OK!");


    }

    //pojo绑定，要求客户端请求的参数名称跟POJO的属性名称相同
    @RequestMapping(value = "/getUser",method = RequestMethod.POST)
    public void getUser(User user,HttpServletResponse response)throws IOException{
        System.out.println(user.toString());
        response.setContentType("text/html;charset=UTF-8");  //解决输出的中文乱码问题
        response.getWriter().println(user.toString());
    }

    //绑定自定义类型数据（日期）
    @RequestMapping(value = "/getDate")
    public void getDate(Date date){
        System.out.println("Date="+date);
    }

//    //绑定数组类型的数据
//    @RequestMapping("/getHobby")
//    public void getHobby(String[] hobby){
//        System.out.println("您的爱好："+ Arrays.toString(hobby));
//    }


    //绑定List类型的数据
    @RequestMapping("/getHobby")
    public void getHobby(@RequestParam("hobby") List<String> hobby){
        System.out.println(hobby);
        for(String s:hobby){
            System.out.println(s);
        }
    }

    //绑定属性为List的POJO对象
    @RequestMapping("/showOrders")
    public void showOrders(User2 user2){
        String username=user2.getUsername();
        int id=user2.getId();
        List<Order> orders=user2.getOrders();
        System.out.println(username+"的订单列表下：");
        for (Order order:orders){
            System.out.println(order.toString());
        }
    }

    //绑定属性为Map类型的数据
    @RequestMapping("/orderInfo")
    public void getOrderInfo(OrderDetail orderDetail){
        String orderId=orderDetail.getOrderId();
        HashMap<String, Product> detail=orderDetail.getProductInfo();
        System.out.println(orderId+"号订单有下列商品：");
        System.out.println("生鲜产品"+detail.get("生鲜").toString());
        System.out.println("酒水产品"+detail.get("酒水").toString());
    }
}
