package com.example.lksun.provider.dao;

import com.example.lksun.provider.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsDao {

    int deduct(Integer goodsId);

    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}