package com.fan.activity.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "coupon_type")
@Data
@Accessors(chain = true, fluent = false)
public class CouponType implements Serializable{


	private static final long serialVersionUID = 4808121441640337555L;

    @Id
    @Column(name = "id")
	private Long id;

    /**
     * 卡券类型名称
     *
     */
    @Column(name = "type_name")
    private String typeName;

    /**
     * 创建人ID
     *
     */
    @Column(name = "creator_id")
    private Long creatorId;

    /**
     * 创建人
     *
     */
    @Column(name = "creator")
    private String creator;

    /**
     * 创建时间
     *
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 卡券类型描述
     *
     */
    @Column(name = "type_desc")
    private String typeDesc;



}