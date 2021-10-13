package com.example.lksun.provider.service.impl;

import com.example.lksun.provider.dao.OrderDao;
import com.example.lksun.provider.entity.Order;
import com.example.lksun.provider.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    OrderDao orderDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Integer create(Integer goodsId, Integer userId) {
        int insert = orderDao.insert(Order.builder().
                goodId(goodsId).
                userId(userId).
                build()
        );
        System.out.println(10/0);
        return insert;
    }
}
