package com.example.service;

/**
 * @Author: 于军振
 * @Date: 2019/8/22 16:57
 * @Version 1.0
 */
public interface MailService {
    void sendSimpleMail(String to, String subject, String content);
}
