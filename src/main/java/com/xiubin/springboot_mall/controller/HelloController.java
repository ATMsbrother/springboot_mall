package com.xiubin.springboot_mall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @FileName
 * @Author cxb
 * @Date 2019/4/19 11:17
 * @Description
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello world,fuck the world！！！！！！";
    }
}
