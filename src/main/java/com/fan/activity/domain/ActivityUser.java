package com.fan.activity.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "activity_user")
@Data
@Accessors(chain = true, fluent = false)
public class ActivityUser implements Serializable{


	private static final long serialVersionUID = -2966841690311882660L;
    @Id
    @Column(name = "id")
	private Long id;

    /**
     * 用户编码
     *
     */
    private String userCode;

    /**
     * 用户等级
     *
     */
    private String userLevel;

    /**
     * 用户ID
     *
     */
    private Long userId;

    /**
     * 活动主键
     *
     */
    private Long activityId;

    /**
     * 活动类型
     *
     */
    private Short activityType;

    /**
     * 活动状态 1未兑换/未秒杀/未参加 2--已参加/未报名 3--已秒杀/未报名 4--已兑换 5--已报名  6--已秒杀 
     *
     */
    private Short activityStatus;

    /**
     * 购买单价
     *
     */
    private Integer unitPrice;

    /**
     * 购买数量
     *
     */
    private Integer attendCount;

    /**
     * 购买总价
     *
     */
    private Integer totalPrice;

    /**
     * 收入/支出
     *
     */
    private Boolean isIn;

    /**
     * 参与活动单号
     *
     */
    private String attendNo;

    /**
     * 参加/兑换活动时间
     *
     */
    private Date attendTime;

    /**
     * 报名时间
     *
     */
    private Date signupTime;

}