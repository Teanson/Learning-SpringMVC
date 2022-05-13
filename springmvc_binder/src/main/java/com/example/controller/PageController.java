package com.example.controller;

import com.example.pojo.User;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class PageController {

    //返回值为void类型的页面跳转,要求映射地址与jsp文件的名称相同
    @RequestMapping("/register")
    public void toRegister(){

    }

    @RequestMapping("/toRegisterByString")
    public String toRegisterPage(HttpServletRequest request){
        request.setAttribute("username","张三"); //向转发的页面传送数据(传递普通字符串)
        request.setAttribute("password","12345678");
        return "register";   //返回值要与页面的名称相同(注意：不要在后面加.jsp后缀)
    }

    @RequestMapping("/toRegisterByString2")
    public String toRegisterPage2(HttpServletRequest request){
        User user=new User();
        user.setUsername("李四");
        user.setPassword("88888888");
        request.setAttribute("user",user); //传递对象数据
        return "register";   //返回值要与页面的名称相同(注意：不要在后面加.jsp后缀)
    }

    @RequestMapping("/toRegisterByString3")
    public String toRegisterPage3(HttpServletRequest request){
//        String[] names={"张三","李四","王五","赵六","王大刚"};
//        request.setAttribute("names",names);
        List<String> list=new ArrayList<>();
        list.add("Java程序设计");
        list.add("PHP程序设计");
        list.add("Android程序设计");
        list.add("C++程序设计");
        request.setAttribute("course",list);
        return "register";   //返回值要与页面的名称相同(注意：不要在后面加.jsp后缀)
    }

    @RequestMapping("/toIndex")
    public String showPageForward() {
        return "forward:index.jsp";    //使用forward转发
    }

    @RequestMapping("/toBaidu")
    public String toBaidu() {
        //使用redirect重定向，既可以跳转到站内地址，也可以跳转到站外地址
        //redirect不能传递数据
        return "redirect:http://www.baidu.com";
    }

    @RequestMapping("/toX")
    public String toX() {
        //使用redirect重定向，既可以跳转到站内地址，也可以跳转到站外地址
        //redirect不能传递数据
        return "redirect:http://xsear.ch";
    }

    @RequestMapping("/showPageModel")
    public String showPageModel(Model model){
        User user=new User();
        user.setUsername("光头强");
        user.setPassword("999999999");
        model.addAttribute(user);
        return "register";
    }

    @RequestMapping("showPageMV")
    public ModelAndView showPageModelAndView(){
        User user=new User();
        user.setUsername("小明");
        user.setPassword("666666666");
        ModelAndView mv=new ModelAndView();
        mv.addObject("user",user);  //数据
        mv.setViewName("register");  //设置视图名称
        return mv;
    }

    @RequestMapping("/showText")  //显示普通文字
    public void showText(HttpServletResponse response)throws IOException {
        response.setContentType("text/html;charset=utf-8");   //解决中文乱码
        response.getWriter().println("这是从服务器发送到浏览器的普通文字");
        response.getWriter().println("<br/><span style='font-size:18pt;color:red'>这是HTML内容</span>");
    }

    @RequestMapping("/showJson")
    public void showJson(HttpServletResponse response)throws IOException{
        User user=new User();
        user.setUsername("熊大");
        user.setPassword("88888888");
        Gson gson=new Gson();
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println(gson.toJson(user));
    }
}
