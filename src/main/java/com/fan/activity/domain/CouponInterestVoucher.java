package com.fan.activity.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Table(name = "coupon_interest_voucher")
@Data
@Accessors(chain = true, fluent = false)
public class CouponInterestVoucher implements Serializable{


	private static final long serialVersionUID = -8716140693782020831L;
    @Id
    @Column(name = "id")
	private Long id;

    /**
     * 适用平台
     *
     */
    private String platform;

    /**
     * 适用理财产品
     *
     */
    private String product;

    /**
     * 加息率
     *
     */
    private Integer interestRate;

    /**
     * 加息时长
     *
     */
    private Integer interestRateSpan;

    /**
     * 最小适用金额
     *
     */
    private Integer minCredit;

    /**
     * 折扣面额
     *
     */
    private Integer discountAmount;

    /**
     * 卡券ID
     *
     */
    private Long couponId;

}