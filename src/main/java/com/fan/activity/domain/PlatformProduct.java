package com.fan.activity.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Table(name = "platform_product")
@Data
@Accessors(chain = true, fluent = false)
public class PlatformProduct implements Serializable{


	private static final long serialVersionUID = 7842159526633517231L;
    @Id
    @Column(name = "id")
	private Long id;

    /**
     * 平台编码
     *
     */
    private String platformCode;

    /**
     * 平台名称
     *
     */
    private String platformName;

    /**
     * 产品名称
     *
     */
    private String productName;

    /**
     * 期限
     *
     */
    private String term;

    /**
     * 编号
     *
     */
    private String code;

    
}