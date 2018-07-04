package com.fan.activity.domain;


import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * 
 * @author LXK
 * 2018/06/22
 * @table activity_intro
 *
 */
@Table(name = "activity_intro")
@Data
@Accessors(chain = true, fluent = false)
public class ActivityIntro implements Serializable{
   
	
	
	
	
	private static final long serialVersionUID = -8349864603715466652L;
    @Id
    @Column(name = "id")
	private Long id;

    /**
     * 所属活动
     *
     */
    private Long activityId;
    
    /**
     * 活动简介
     *
     */
    private String activityIntro;

    /**
     * 商家介绍
     *
     */
    private String businessIntro;

    /**
     * 活动须知
     *
     */
    private String activityNotice;
    

}