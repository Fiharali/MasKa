package com.maska.test;

import com.maska.service.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MemberService memberService = context.getBean(MemberService.class);

        System.out.println("Static data has been inserted.");
    }
}