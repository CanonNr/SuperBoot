package com.example.lksun.web.controller;

import com.example.lksun.web.service.SentinelService;
import feign.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
@RequestMapping("/Sentinel")
public class SentinelDemoController {

    @Resource
    SentinelService sentinelService;


    @GetMapping("/time")
    public String test1(){
        return sentinelService.getCurrentTime();
    }

    @GetMapping("/name")
    public String test2(@RequestParam String name){
        return sentinelService.getName(name);
    }
}
