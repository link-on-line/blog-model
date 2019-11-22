package com.leisure.small.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("demo")
public class DemoController {

    @RequestMapping(value = "getDemoPage", method = RequestMethod.GET)
    public String getDemoPath(){
        return "layout/laynew";
    }
}
