package com.example.lksun.mywatchdoglock.controller;

import com.example.lksun.mywatchdoglock.service.ToolService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")

public class TestController {

    @Resource
    ToolService toolService;

    @GetMapping("/1")
    public String test() throws InterruptedException {
        toolService.print();
        Thread.sleep(1000);
        System.out.println("end...");
        return "ok";
    }
}
