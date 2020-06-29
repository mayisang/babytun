package com.itlaoqi.babytun.mapper;

import com.itlaoqi.babytun.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface GoodsMapper {
     @Select(  "select  * from t_goods where goods_id=#{value}")
     Goods findById(Long goodsId);
}
