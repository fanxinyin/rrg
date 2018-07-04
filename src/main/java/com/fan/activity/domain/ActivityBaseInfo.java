package com.fan.activity.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "activity_base_info")
@Data
@Accessors(chain = true, fluent = false)
public class ActivityBaseInfo implements Serializable{


	private static final long serialVersionUID = 6535668942021010728L;

    @Id
    @Column(name = "id")
	private Long id;

    /**
     * 活动名称
     *
     */
    private String activityTitle;

    /**
     * 活动方式 1--报名 2--兑换
     *
     */
    private Short activityForm;

    /**
     * 活动类型 1--小谷帮你赚 2--健康生活 3--小谷帮你淘 4--休闲时光
     *
     */
    private Short activityType;

    /**
     * 活动链接
     *
     */
    private String activityUrl;

    /**
     * 活动图片
     *
     */
    private String activityPicture;

    /**
     * 活动适用范围
     *
     */
    private String activityScope;

    /**
     * 是否显示/是否上架 默认上架 1
     *
     */
    private Boolean isShow;

    /**
     * 活动开始时间
     *
     */
    private Date startTime;

    /**
     * 活动结束时间
     *
     */
    private Date endTime;

    /**
     * 创建人ID
     *
     */
    private Long creatorId;

    /**
     * 创建人姓名
     *
     */
    private String creator;

    /**
     * 活动创建时间
     *
     */
    private Date createTime;

}