/*
 *  
 * Create by 杜宇 2018年5月30日
 * 
 * Copyright (c) 2018 东方银谷投资管理有限公司
 */
package com.fan.activity.mybatis;

import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * {在这里补充类的功能说明}
 * 
 * @author 杜宇 duyu@yingu.com
 */
@Configuration
public class PageHelperConfig {
	private Logger logger = LoggerFactory.getLogger(PageHelperConfig.class);

	/**
	 * 分页插件 * * @param dataSource * @return * @author SHANHY * @create
	 * 2016年2月18日
	 */
	@Bean
	public PageHelper pageHelper() {
		logger.info("注册MyBatis分页插件PageHelper");
		PageHelper pageHelper = new PageHelper();
		Properties properties = new Properties();
		properties.setProperty("offsetAsPageNum", "true");
		properties.setProperty("rowBoundsWithCount", "true");
		properties.setProperty("reasonable", "true");
		pageHelper.setProperties(properties);
		return pageHelper;
	}
}
