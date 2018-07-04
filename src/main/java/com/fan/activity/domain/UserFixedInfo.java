package com.fan.activity.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "user_fixed_info")
@Data
@Accessors(chain = true, fluent = false)
public class UserFixedInfo implements Serializable{


	private static final long serialVersionUID = 3322152127498526203L;
    @Id
    @Column(name = "id")
	private Long id;

    /**
     * 姓名
     *
     */
    private String userName;

    /**
     * 证件号码
     *
     */
    private String idNumber;

    /**
     * 用户ID
     *
     */
    private Long userId;

    /**
     * 用户编号
     *
     */
    private String userCode;

    /**
     * 手机号
     *
     */
    private String mobile;

    /**
     * 年龄
     *
     */
    private Integer age;

    /**
     * 性别
     *
     */
    private Boolean sex;

    /**
     * 居住城市
     *
     */
    private String residenceCity;




}