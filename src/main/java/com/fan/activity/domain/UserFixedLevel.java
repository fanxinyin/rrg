package com.fan.activity.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "user_fixed_level")
@Data
@Accessors(chain = true, fluent = false)
public class UserFixedLevel implements Serializable{


	
	private static final long serialVersionUID = 8786236236641565139L;
    @Id
    @Column(name = "id")
	private Long id;

    /**
     * 用户等级
     *
     */
    private String userLevel;

    /**
     * 等级名称
     *
     */
    private String levelName;

    /**
     * 用户等级ID
     *
     */
    private Long userLevelId;

}