package com.fan.activity.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "activity_base_info_exp")
@Data
@Accessors(chain = true, fluent = false)
public class ActivityBaseInfoExp implements Serializable{


	private static final long serialVersionUID = -8105902718664676197L;
    @Id
    @Column(name = "id")
	private Long id;

    /**
     * 所需活动
     *
     */
    private Long activityId;

    /**
     * 参与活动所需等级
     *
     */
    private Long userLevelId;

    /**
     * 所需银豆
     *
     */
    private Integer silverBean;

    /**
     * 限定人数/总库存
     *
     */
    private Integer limitNum;

    /**
     * 个人兑换上限
     *
     */
    private Integer everyLimitNum;

    /**
     * 已参与活动数
     *
     */
    private Integer attendedNum;

    /**
     * 剩余库存
     *
     */
    private Integer remainNum;

}