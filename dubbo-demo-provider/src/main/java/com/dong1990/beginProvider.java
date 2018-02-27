package com.dong1990;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class beginProvider {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"provider.xml"});
        context.start();
        System.out.println("服务提供方开始服务");
        System.in.read();//让程序阻塞  代表是持久化
    }
}
