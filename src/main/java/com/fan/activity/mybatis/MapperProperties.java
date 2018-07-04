/*
 *  
 * Create by 杜宇 2018年5月30日
 * 
 * Copyright (c) 2018 东方银谷投资管理有限公司
 */
package com.fan.activity.mybatis;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * {在这里补充类的功能说明}
 * 
 * @author 杜宇 duyu@yingu.com
 */
@ConfigurationProperties(prefix = MapperProperties.MAPPER_PREFIX)
public class MapperProperties {
	public static final String MAPPER_PREFIX = "mapper";

	/**
	 * mapper 扫描包
	 */
	private String baseScanBasePackage;

	public String getBaseScanBasePackage() {
		return baseScanBasePackage;
	}

	public void setBaseScanBasePackage(String baseScanBasePackage) {
		this.baseScanBasePackage = baseScanBasePackage;
	}
}
