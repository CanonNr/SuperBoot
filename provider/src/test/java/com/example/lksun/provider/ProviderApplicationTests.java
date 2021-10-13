package com.example.lksun.provider;

import com.example.lksun.provider.dao.GoodsDao;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ProviderApplicationTests {

    @Resource
    GoodsDao goodsDao;

    @Test
    void contextLoads() {
        int deduct = goodsDao.deduct(1);
        System.out.println(deduct);
    }

}
