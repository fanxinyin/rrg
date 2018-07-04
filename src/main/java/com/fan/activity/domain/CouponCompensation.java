package com.fan.activity.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "coupon_compensation")
@Data
@Accessors(chain = true, fluent = false)
public class CouponCompensation implements Serializable{


	private static final long serialVersionUID = -2268487001415835094L;
    @Id
    @Column(name = "id")
	private Long id;

    /**
     * 用户名ID
     *
     */
    private Long userId;

    /**
     * 用户编码
     *
     */
    private String userCode;

    /**
     * 卡券ID
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
     * 申请时间
     *
     */
    private Date applyTime;

    /**
     * 申请人主键
     *
     */
    private Long applyId;

    /**
     * 申请人
     *
     */
    private String applyName;

    /**
     * 审核状态
     *
     */
    private Short auditState;

    /**
     * 审核人主键
     *
     */
    private Long auditorId;

    /**
     * 审核人
     *
     */
    private String auditor;

    /**
     * 审核时间
     *
     */
    private Date auditTime;

    /**
     * 补偿原因
     *
     */
    private String compensationCause;

}