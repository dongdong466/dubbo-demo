package com.dong1990;

public class HelloWorldImpl implements HelloWorld {

    public String helloWorld(Integer index) {
        System.out.println("被客户端消费（消费者）...index："+index);
        if(index == 1){
            return "张冬晖";
        } else if (index == 2) {
            return "朱敏";
        }
        return "未找到";
    }
}
