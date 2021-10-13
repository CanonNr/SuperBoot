package com.example.lksun.web.controller;

import com.example.lksun.web.entity.Order;
import com.example.lksun.web.service.SentinelService;
import com.example.lksun.web.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class SentinelDemoController {

    @Resource
    TestService testService;


    @GetMapping("/get")
    public int test1(){
        Order order = new Order();
        System.out.println(order);

        return 1;
    }


}
