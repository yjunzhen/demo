package com.example.controller;

import com.example.entity.User;
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

    @RequestMapping("/hello")
    public String helloSpringBoot() {
        return "Hello SpringBoot Project.";
    }
    @RequestMapping("/getUser")
    public User getUser() {
        User user=new User();
        user.setUserId("123");
        user.setUserName("小明");
        user.setEmail("xxxx");
        return user;
    }
}
