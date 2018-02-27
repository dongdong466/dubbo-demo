package com.dong1990;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class consumerTest {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
        context.start();
        HelloWorld helloWorlds = (HelloWorld) context.getBean("myHelloWorld");
        String name = helloWorlds.helloWorld(2);
        System.out.println("消费端从生产者获取到name："+name);
    }
}
