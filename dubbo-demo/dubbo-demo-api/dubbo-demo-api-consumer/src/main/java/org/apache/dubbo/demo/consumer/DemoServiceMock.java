package org.apache.dubbo.demo.consumer;

import org.apache.dubbo.demo.DemoService;

public class DemoServiceMock implements DemoService {
    @Override
    public String sayHello(String name) {
        return "DemoServiceMock.sayHello " + name;
    }
}
