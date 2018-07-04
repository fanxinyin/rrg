package com.fan.activity.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "coupon_exchange_flow")
@Data
@Accessors(chain = true, fluent = false)
public class CouponExchangeFlow implements Serializable{

	
	
	
	private static final long serialVersionUID = -6200940724251505240L;
    @Id
    @Column(name = "id")
	private Long id;

    /**
     * 用户ID
     *
     */
    private Long userId;

    /**
     * 用户编号
     *
     */
    private String userCode;

    /**
     * 卡券主键
     *
     */
    private Long couponId;

    /**
     * 卡号
     *
     */
    private String couponCode;

    /**
     * 卡券密码
     *
     */
    private String couponPassword;

    /**
     * 卡券来源 1--兑换 2--补偿
     *
     */
    private Short couponRes;

    /**
     * 兑换状态
     *
     */
    private Short exchangeStatus;

    /**
     * 卡券使用情况  1--未使用 2--已使用 3--已过期
     *
     */
    private Short usedStatus;

    /**
     * 使用时间
     *
     */
    private Date usedTime;


}

