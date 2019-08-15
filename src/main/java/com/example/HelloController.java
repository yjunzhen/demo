package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author: 于军振
 * @Date: 2019/4/3 9:37
 * @Version 1.0
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        System.out.println("1234");
        return "8888 ";
    }
}
