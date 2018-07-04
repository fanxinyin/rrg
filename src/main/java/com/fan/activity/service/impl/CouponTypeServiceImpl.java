package com.fan.activity.service.impl;

import com.fan.activity.domain.CouponType;
import com.fan.activity.mapper.CouponTypeMapper;
import com.fan.activity.service.CouponTypeService;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author fanxinyin
 * @date 2018/7/3
 * @Description
 */
@Service
public class CouponTypeServiceImpl implements CouponTypeService {


    @Autowired
    private CouponTypeMapper couponTypeMapper;

    /**
     * 添加卡片类型
     * @param couponType
     * @return
     */
    @Override
    @Transactional
    public int addCouponType(CouponType couponType) {
        int result =0;
        if (couponType != null) {
            couponType.setCreateTime(new Date());
            //TODO 如何获取
            //couponType.setCreatorId();
            //couponType.setCreator();
            result = couponTypeMapper.insert(couponType);
        }
        return result;
    }

    /**
     * 根据卡片类型id删除卡片类型
     * @param id
     * @return
     */
    @Override
    @Transactional
    public int deleteCouponType(Long id) {

        int byActivityIsShow = couponTypeMapper.findByActivityIsShow();
        int result=0;
        if (byActivityIsShow == 0){
             result = couponTypeMapper.deleteByPrimaryKey(id);
        }else {
            //TODO 返回方式
        }

        return result;
    }

    /**
     *  分页查询全部卡片类型
     * @param page
     * @param pageSize
     * @return
     */
    @Override
    public List<CouponType> couponTypeList(Integer page, Integer pageSize) {

        String orderBy = "create_time desc";
        PageHelper.startPage(page,pageSize,orderBy);
        List<CouponType> couponTypes = couponTypeMapper.selectAll();
        return couponTypes;
    }

    /**
     * 根据卡片类型id查询
     * @param id
     * @return
     */
    @Override
    public CouponType findByCouponTypeId(Long id) {

        CouponType couponType = couponTypeMapper.selectByPrimaryKey(id);

        return couponType;
    }

}
