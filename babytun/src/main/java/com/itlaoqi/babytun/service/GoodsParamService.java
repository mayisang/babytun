package com.itlaoqi.babytun.service;

import com.itlaoqi.babytun.entity.GoodsParam;
import com.itlaoqi.babytun.mapper.GoodsDetailMapper;
import com.itlaoqi.babytun.mapper.GoodsParamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsParamService {
    @Autowired
    GoodsParamMapper goodsParamMapper;
    public List<GoodsParam> findByGoods(Long gid){
        return goodsParamMapper.findByGoodsId(gid);
    }
}
