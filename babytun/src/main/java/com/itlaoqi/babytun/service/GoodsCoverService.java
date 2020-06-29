package com.itlaoqi.babytun.service;

import com.itlaoqi.babytun.entity.GoodsCover;
import com.itlaoqi.babytun.mapper.GoodsCoverMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsCoverService {
    @Autowired
    GoodsCoverMapper goodsCoverMapper;
    public List<GoodsCover> findByGoodsId(Long gid){
        System.out.println("----------------------");
        List<GoodsCover> byGoodsId = goodsCoverMapper.findByGoodsId(gid);

        return byGoodsId;
    }

}
