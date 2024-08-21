package com.hw.springmvc.controller;

import com.hw.springmvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: UserController
 * Package: com.hw.springmvc.controller
 * Description:
 *
 * @Author Hacker by HW
 * @Create 2024/7/1 16:54
 * @Version 1.0
 */
@Controller
public class UserController {

    @RequestMapping("/")
    public String toRegister() {
        //返回一个逻辑视图
        return "register";
    }

    //    @RequestMapping(value = "/user/reg", method = RequestMethod.POST)
//    @PostMapping("/user/reg")
//    public String register(HttpServletRequest req, HttpServletResponse resp , HttpSession session ){
//        //HttpServletRequest,HttpServletResponse,HttpSession都属于原生Servlet API
//        System.out.println("req = " + req);
//        System.out.println("resp = " + resp);
//        System.out.println("session = " + session);
//
//        //获取请求提交的数据
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//        String sex = req.getParameter("sex");
//        String[] interest = req.getParameterValues("interest");//interest=smoke&interest=drink&interest=tt
//        String intro = req.getParameter("intro");
//
//        System.out.println(username);
//        System.out.println(password);
//        System.out.println(sex);
//        System.out.println(Arrays.toString(interest));
//        System.out.println(intro);
//
//        return "ok";
//    }
//    @PostMapping("/user/reg")
//    public String register(
//            @RequestParam(value = "username") //value可以,name也可以 -->源码中 value别名是name , name别名是value!
//            String username,
//            @RequestParam(value = "password")
//            String password,
//            @RequestParam(value = "sex")
//            Integer sex,
//            @RequestParam(value = "interest")
//            String[] interest,
//            @RequestParam(value = "intro")
//            String intro,
//            @RequestParam(value = "age",required = false)
//            Integer age) {
//
//            System.out.println(username);
//            System.out.println(password);
//            System.out.println(sex);
//            System.out.println(Arrays.toString(interest));
//            System.out.println(intro);
//            System.out.println(age);
//        return "ok";
//    }

//    @PostMapping("/user/reg")
//    public String register(String username, String password,Integer sex,String[] interest,String intro,Integer age) {
//
//        System.out.println(username);
//        System.out.println(password);
//        System.out.println(sex);
//        System.out.println(Arrays.toString(interest));
//        System.out.println(intro);
//        System.out.println(age);
//        return "ok";
//    }
//    @PostMapping("/user/reg")
//    public String register(User user) {
//        System.out.println(user);
//        return "ok";
//    }

//    @PostMapping("/user/reg")
//    @RequestMapping("/user/reg")
//    public String register(User user,
//                           @RequestHeader(value = "Referer", required = false, defaultValue = "")
//                           String referer,
//                           @RequestHeader(value = "Host", required = false, defaultValue = "")
//                           String host,
//                           @CookieValue(value = "id",required = false,defaultValue = "2222222")
//                           String id) {
//        System.out.println(user);
//        System.out.println(referer);
//        System.out.println(host);
//        System.out.println("客户端提交过来的cookie , 值为: " + id);
//        return "ok";
//    }

    @RequestMapping("/user/reg")
    public String register(User user) {
        System.out.println(user);
        return "ok";
    }

}
