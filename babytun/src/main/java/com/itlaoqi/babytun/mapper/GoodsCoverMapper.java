package com.itlaoqi.babytun.mapper;

import com.itlaoqi.babytun.entity.GoodsCover;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface GoodsCoverMapper {
    @Select("SELECT * FROM t_goods_cover WHERE goods_id=#{value} ORDER BY gc_order")
    List<GoodsCover> findByGoodsId(Long goodsId);
}
