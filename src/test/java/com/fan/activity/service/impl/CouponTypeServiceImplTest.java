package com.fan.activity.service.impl;

import com.fan.activity.ActivityApplication;
import com.fan.activity.domain.CouponType;
import com.fan.activity.service.CouponTypeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author fanxinyin
 * @date 2018/7/3
 * @Description
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ActivityApplication.class)
public class CouponTypeServiceImplTest {

    @Autowired
    private CouponTypeService couponTypeService;

    @Test
    public void addCouponType() throws Exception {

        for (int i = 0; i < 15; i++) {
            CouponType couponType=new CouponType();
            couponType.setCreateTime(new Date());
            couponType.setCreator("创建人"+i);
            couponType.setCreatorId(111111111111L);
            couponType.setTypeDesc("卡券类型描述"+i);
            couponType.setTypeName("卡券类型名称"+i);
            int i1 = couponTypeService.addCouponType(couponType);
            if (i1>0){
                System.out.println("添加成功");

            }else {
                System.out.println("添加失败");
            }
        }

    }

    @Test
    public void deleteCouponType() throws Exception {
        int i = couponTypeService.deleteCouponType(1L);

        if (i>0){
            System.out.println("删除成功");

        }else {
            System.out.println("删除失败");
        }

    }

    @Test
    public void couponList() throws Exception {


        List<CouponType> couponTypeList = couponTypeService.couponTypeList(1, 5);

        for (CouponType couponType : couponTypeList) {
            System.out.println(couponType.toString());
        }
    }


    @Test
    public void findByCouponTypeId() {
        Long id=7L;
        CouponType couponType = couponTypeService.findByCouponTypeId(id);
        System.out.println(couponType.toString());
    }

}