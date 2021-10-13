package com.example.lksun.provider.controller;

import com.example.lksun.provider.service.GoodService;
import com.example.lksun.provider.service.OrderService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/ltx")
public class LTXController {

    @Resource
    GoodService goodService;

    @Resource
    OrderService orderService;

    @GetMapping("/buy")
    @Transactional(propagation = Propagation.REQUIRED)
    public String buy(){
        goodService.deduct(1);
        orderService.create(1,1);
        return "ok";
    }
}
