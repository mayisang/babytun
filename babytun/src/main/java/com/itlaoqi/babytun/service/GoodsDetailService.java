package com.itlaoqi.babytun.service;

import com.itlaoqi.babytun.entity.GoodsDetail;
import com.itlaoqi.babytun.mapper.GoodsDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsDetailService {
    @Autowired
    GoodsDetailMapper goodsDetailMapper;
    public List<GoodsDetail> findByGoods(Long gid){
        return goodsDetailMapper.findByGoodsId(gid);
    }
}
