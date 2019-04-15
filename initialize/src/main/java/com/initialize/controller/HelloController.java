package com.initialize.controller;

import com.initialize.model.Hello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 叫兽阿郎
 * @Date: 2019/4/15 10:41
 * @Email： elizhiyong@163.com
 * @link: http://blog.dwzurl.cn/
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Hello hello(Hello hello){
        hello.setPhone("手机号:"+hello.getPhone());
        hello.setAddress("地址："+ hello.getAddress());
        hello.setName("姓名："+hello.getName());
        return hello;
    }

}
