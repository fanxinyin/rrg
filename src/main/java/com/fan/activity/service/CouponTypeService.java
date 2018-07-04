package com.fan.activity.service;

import com.fan.activity.domain.CouponType;

import java.util.List;

/**
 * @author fanxinyin
 * @date 2018/7/3
 * @Description
 */
public interface CouponTypeService {

    /**
     * 添加卡片类型
     * @param couponType
     * @return
     */
    int addCouponType(CouponType couponType);

    /**
     * 根据卡片类型id删除卡片类型
     * @param id
     * @return
     */
    int deleteCouponType(Long id);


    /**
     * 查询全部卡片类型
     * @return
     */
    List<CouponType>couponTypeList(Integer page, Integer pageSize);

    /**
     * 根据卡片类型id查询
     * @param id
     * @return
     */
    CouponType findByCouponTypeId(Long id);


}
