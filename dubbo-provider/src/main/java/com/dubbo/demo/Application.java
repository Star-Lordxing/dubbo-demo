package com.dubbo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("classpath:dubbo-provider.xml");
        context.start();
        // 阻塞当前进程，否则程序会直接停止
        System.in.read();
    }
}
