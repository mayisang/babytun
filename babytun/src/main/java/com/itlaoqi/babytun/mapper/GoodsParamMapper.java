package com.itlaoqi.babytun.mapper;

import com.itlaoqi.babytun.entity.Goods;
import com.itlaoqi.babytun.entity.GoodsParam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface GoodsParamMapper {
    @Select("SELECT * FROM t_goods_param WHERE goods_id=#{value} ORDER BY gp_order")
    List<GoodsParam> findByGoodsId(Long goodsId);
}
