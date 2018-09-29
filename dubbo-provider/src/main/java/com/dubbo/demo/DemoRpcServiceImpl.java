package com.dubbo.demo;
import com.dubbo.demo.api.DemoRpcService;
public class DemoRpcServiceImpl implements DemoRpcService {


    public String getUserName(String uid) {
        System.out.println("接收入参："+uid);
        return "小明";
    }
}
