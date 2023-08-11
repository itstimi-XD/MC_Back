package com.mini.mbti_collector.service;

public interface MailSendService {

    //    난수를 생성하는 메소드
    int makeRandomNumber();

    //    보낼 메일 양식을 만드는 메소드
    String joinEmail(String email);

    //    메일을 보내는 메소드
    void mailSend(String message,String email, String title);

    boolean isEmailRegistered(String email);
}