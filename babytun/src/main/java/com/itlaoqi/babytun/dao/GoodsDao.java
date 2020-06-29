package com.itlaoqi.babytun.dao;

import com.itlaoqi.babytun.entity.Goods;

public interface GoodsDao {
    public Goods findByid(Long goodsId);
}
