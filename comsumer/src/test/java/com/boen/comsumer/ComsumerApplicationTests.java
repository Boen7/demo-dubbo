package com.boen.comsumer;

import com.alibaba.dubbo.config.annotation.Reference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.boen.common.helloservice;

@SpringBootTest
class ComsumerApplicationTests {

    @Reference
    private helloservice helloservice;

    @Test
    void contextLoads() {
        String s = helloservice.sayHello();
        System.out.println(s);
    }

}
