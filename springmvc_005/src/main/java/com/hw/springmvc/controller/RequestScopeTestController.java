package com.hw.springmvc.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: RequestScopeTestController
 * Package: com.hw.springmvc.controller
 * Description:
 *
 * @Author Hacker by HW
 * @Create 2024/7/2 16:39
 * @Version 1.0
 */
@Controller
public class RequestScopeTestController {

    @RequestMapping("/testServletAPI")
    public String testServletAPI(HttpServletRequest request) {

        // 将共享的数据存储到request域当中
        request.setAttribute("testRequestScope", "在SpringMVC当中使用原生Servlet API完成request域数据共享");

        // 跳转视图，在视图页面将request域中的数据取出来，这样就完成了：Controller和View在同一个请求当中两个组件之间数据的共享。
        // 这个跳转，默认情况下是：转发的方式。（转发forward是一次请求）
        // 这个返回的是一个逻辑视图名称，经过视图解析器解析，变成物理视图名称。/WEB-INF/thymeleaf/ok.html
        return "ok";
    }
    @RequestMapping("/testModel")
    public String testModel(Model model){
        //// 向request域当中绑定数据
        model.addAttribute("testRequestScope", "在SpringMVC当中使用Model接口完成request域数据共享");
        // 转发
        return "ok";
    }

}
