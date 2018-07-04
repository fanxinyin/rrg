package com.fan.activity.mapper;


import com.fan.activity.domain.CouponType;
import tk.mybatis.mapper.common.BaseMapper;


public interface CouponTypeMapper  extends BaseMapper<CouponType> {


    /**
     * 查询上架状态
     * @return
     */
    int findByActivityIsShow();
}