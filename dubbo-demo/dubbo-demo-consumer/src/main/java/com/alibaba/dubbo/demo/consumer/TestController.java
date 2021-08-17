package com.alibaba.dubbo.demo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.demo.DemoService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
public class TestController {

    @Reference
    DemoService DemoService;

    @GetMapping("test1")
    public String test1(String str){

        return str;
    }
}
