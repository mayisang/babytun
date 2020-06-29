package com.itlaoqi.babytun.mapper;

import com.itlaoqi.babytun.entity.GoodsDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface GoodsDetailMapper {
    @Select("SELECT * FROM t_goods_detail WHERE goods_id=#{value} ORDER BY gd_order")
    List<GoodsDetail> findByGoodsId(Long goodsId);
}
