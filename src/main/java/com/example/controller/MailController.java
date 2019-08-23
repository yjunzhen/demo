package com.example.controller;

import com.example.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 于军振
 * @Date: 2019/8/22 16:43
 * @Version 1.0
 */
@RestController
public class MailController {

@Autowired
private MailService mailService;
    @RequestMapping("/aa")
    public  void sendSimpleMail(String to, String subject, String content){
        mailService.sendSimpleMail(to,subject,content);
    }
}
