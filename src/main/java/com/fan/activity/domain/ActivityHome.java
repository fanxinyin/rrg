package com.fan.activity.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "activity_home")
@Data
@Accessors(chain = true, fluent = false)
public class ActivityHome implements Serializable{


	private static final long serialVersionUID = -2187436162655618415L;
    @Id
    @Column(name = "id")
	private Long id;

    /**
     * 活动ID
     *
     */
    private Long activityId;

    /**
     * 首页位置
     *
     */
    private Short hgPosition;

    /**
     * 展示开始时间
     *
     */
    private Date startTime;

    /**
     * 展示结束时间
     *
     */
    private Date endTime;

    /**
     * 是否撤销
     *
     */
    private Boolean isDel;

    /**
     * 创建时间
     *
     */
    private Date createTime;

    /**
     * 创建人
     *
     */
    private String creator;

    /**
     * 创建人ID
     *
     */
    private Long creatorId;

}