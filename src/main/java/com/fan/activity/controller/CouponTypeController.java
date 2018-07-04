package com.fan.activity.controller;

import com.fan.activity.domain.CouponType;
import com.fan.activity.service.CouponTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @author fanxinyin
 * @date 2018/7/4
 * @Description
 */
@RestController
@RequestMapping(path ="/activity")
public class CouponTypeController {

    /**
     * 日志
     */
    private static final Logger logger = LoggerFactory.getLogger(CouponTypeController.class);

    @Autowired
    private CouponTypeService couponTypeService;

    /**
     *  分页查询卡卷类型列表
     * @param page
     * @param pageSize
     * @return
     */
    @GetMapping (path = "/getCouponTypeList")
    public List<CouponType> getCouponList(@RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
                                          @RequestParam(value = "pageSize", required = false, defaultValue = "20") Integer pageSize) {

        return couponTypeService.couponTypeList(page,pageSize);
    }

    /**
     *  根据卡卷类型id查询
     * @param couponTypeId
     * @return
     */
    @GetMapping(path = "/findByCouponTypeId/{couponTypeId}")
    public CouponType findByCouponTypeId(@PathVariable("couponTypeId")Long couponTypeId){
        CouponType byCouponTypeId = couponTypeService.findByCouponTypeId(couponTypeId);
        return byCouponTypeId;
    }

    /**
     *  添加卡卷类型
     * @param couponType
     * @return
     */
    @PostMapping(path = "/addCouponType")
    public Integer addCouponType(CouponType couponType){
        int addCouponType = couponTypeService.addCouponType(couponType);
        return addCouponType;
    }
}
