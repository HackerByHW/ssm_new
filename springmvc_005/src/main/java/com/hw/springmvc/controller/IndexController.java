package com.hw.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: IndexController
 * Package: com.hw.springmvc.controller
 * Description:
 *
 * @Author Hacker by HW
 * @Create 2024/7/2 16:35
 * @Version 1.0
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
