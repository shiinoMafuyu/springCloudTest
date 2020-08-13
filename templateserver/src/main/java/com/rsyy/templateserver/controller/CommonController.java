package com.rsyy.templateserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: wangzg
 * @create: 2020-08-13 22:45
 **/
@RestController
public class CommonController {

    @RequestMapping("/time")
    public String get(){
        return "现在时间："+new SimpleDateFormat("yyyy-MM-DD HH:mm:ss").format(new Date());
    }
}
