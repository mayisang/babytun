package com.itlaoqi.babytun.service;


import com.itlaoqi.babytun.entity.Goods;
import com.itlaoqi.babytun.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    public Goods getGoods(Long goodId){

       // System.out.println("0000000000000000000");
        Goods byid = goodsMapper.findById(goodId);
       // System.out.println(byid.getSubTitle());
        return byid;
    }
}
