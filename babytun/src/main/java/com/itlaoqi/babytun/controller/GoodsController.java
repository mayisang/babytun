package com.itlaoqi.babytun.controller;

import  org.slf4j.*;
import com.itlaoqi.babytun.entity.Goods;
import com.itlaoqi.babytun.service.GoodsCoverService;
import com.itlaoqi.babytun.service.GoodsDetailService;
import com.itlaoqi.babytun.service.GoodsParamService;
import com.itlaoqi.babytun.service.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.FileWriter;
import java.io.Writer;

@Controller
public class GoodsController {

    Logger logger= LoggerFactory.getLogger(GoodsController.class);


    @Autowired
    private GoodsService goodsService;
    @Autowired
    private GoodsCoverService goodsCoverService;
    @Autowired
    private GoodsDetailService goodsDetailService;
    @Autowired
    private GoodsParamService goodsParamService;


    @GetMapping("/goods")
    public ModelAndView showGoods(Long gid){

        logger.info("gid"+gid);
        ModelAndView mav=new ModelAndView("goods");
        Goods goods = goodsService.getGoods(gid);

        mav.addObject("goods",goods);
        mav.addObject("covers", goodsCoverService.findByGoodsId(gid));
        mav.addObject("details", goodsDetailService.findByGoods(gid));
        mav.addObject("params",  goodsParamService.findByGoods(gid));


        return mav;
    }


}
