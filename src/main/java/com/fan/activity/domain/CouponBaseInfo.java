package com.fan.activity.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


@Table(name = "coupon_base_info")
@Data
@Accessors(chain = true, fluent = false)
public class CouponBaseInfo implements Serializable{


	private static final long serialVersionUID = -6514881188367438589L;
    @Id
    @Column(name = "id")
	private Long id;

    /**
     * 所属活动
     *
     */
    private Long activityId;

    /**
     * 卡卷类型id
     */
    private Long couponTypeId;

    /**
     * 卡券类型
     *
     */
    private String couponType;

    /**
     * 卡券名称
     *
     */
    private String couponName;

    /**
     * 卡券链接
     *
     */
    private String couponUrl;

    /**
     * 卡券数量
     *
     */
    private Integer couponCount;

    /**
     * 有效期开始日期
     *
     */
    private Date startDate;

    /**
     * 有效期结束日期
     *
     */
    private Date endDate;

    /**
     * 创建人ID
     *
     */
    private Long creatorId;

    /**
     * 创建人
     *
     */
    private String creator;

    /**
     * 创建时间
     *
     */
    private Date createTime;

    /**
     * 使用须知
     *
     */
    private String usedNotice;

}