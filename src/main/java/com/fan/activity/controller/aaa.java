package com.fan.activity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fanxinyin
 * @date 2018/7/4
 * @Description
 */
@Controller
public class aaa {


    @RequestMapping("/index")
    public String index(){

        return "index";
    }
}
