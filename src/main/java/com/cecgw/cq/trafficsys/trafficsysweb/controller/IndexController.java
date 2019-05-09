package com.cecgw.cq.trafficsys.trafficsysweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yydeng
 * @version V1.0
 * @since 2019-05-09
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
