package com.example.lksun.mywatchdoglock.service.impl;

import com.example.lksun.mywatchdoglock.service.ToolService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ToolServiceImpl implements ToolService {

    // 此处加了Async表示新开一个子线程异步执行
    @Async
    @Override
    public void print() {
        // flag 应该为对锁状态的查询
        // 如果锁失效则结束该线程 不然 while循环内一直续期
        boolean flag = true;

        while (flag){
            // 做个休眠 不要执行的太快 一般为原锁市场的三分之一
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 此处需要有个续命操作
            System.out.println("续命...");
        }
    }
}
