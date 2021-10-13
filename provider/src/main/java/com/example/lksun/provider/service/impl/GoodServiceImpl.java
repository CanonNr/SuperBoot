package com.example.lksun.provider.service.impl;

import com.example.lksun.provider.dao.GoodsDao;
import com.example.lksun.provider.service.GoodService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class GoodServiceImpl implements GoodService {

    @Resource
    GoodsDao goodsDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Integer deduct(Integer goodsId) {
        return goodsDao.deduct(goodsId);
    }
}
