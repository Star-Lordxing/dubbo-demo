package com.dubbo.demo;

import com.dubbo.demo.api.DemoRpcService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
        context.start();

        String useId = "123456";
        DemoRpcService demoService = (DemoRpcService) context.getBean("demoRpcService");
        System.out.println("收到结果"+demoService.getUserName(useId));

        // 阻塞当前进程，否则程序会直接停止
        System.in.read();
    }
}
