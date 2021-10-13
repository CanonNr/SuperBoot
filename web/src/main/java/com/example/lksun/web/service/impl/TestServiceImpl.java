package com.example.lksun.web.service.impl;

import com.example.lksun.web.entity.Tool;
import com.example.lksun.web.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    private int i=0;



    @Override
    public int get() {
        return i++;
    }

    public void print(){
        System.out.println(1);
    }

}
