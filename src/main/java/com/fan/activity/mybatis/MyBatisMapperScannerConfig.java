/*
 *  
 * Create by 杜宇 2018年5月30日
 * 
 * Copyright (c) 2018 东方银谷投资管理有限公司
 */
package com.fan.activity.mybatis;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import tk.mybatis.mapper.entity.Config;
import tk.mybatis.mapper.mapperhelper.MapperHelper;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import java.util.Properties;

/**
 * {在这里补充类的功能说明}
 * 
 * @author 杜宇 duyu@yingu.com
 */
@Configuration
@AutoConfigureAfter(MybatisAutoConfiguration.class)
public class MyBatisMapperScannerConfig {
	private Logger logger = LoggerFactory.getLogger(MyBatisMapperScannerConfig.class);

	@Bean
	@Primary
	public MapperScannerConfigurer mapperScannerConfigurer() {
		logger.info("设置Mybatis通用Mapper");
		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
		mapperScannerConfigurer.setBasePackage("com.fan.activity.mapper");
		MapperHelper mapperHelper = new MapperHelper();
		Config config = new Config();
		// config.setStyle(Style.camelhumpAndLowercase);
		Properties properties = new Properties();
		// 这里要特别注意，不要把MyMapper放到 basePackage 中，也就是不能同其他Mapper一样被扫描到。
		properties.setProperty("mappers", BaseMapper.class.getName());
		properties.setProperty("notEmpty", "false");
		properties.setProperty("IDENTITY", "MYSQL");
		config.setProperties(properties);
		mapperHelper.setConfig(config);
		mapperHelper.registerMapper(BaseMapper.class);
		mapperScannerConfigurer.setMapperHelper(mapperHelper);

		// mapperScannerConfigurer.setProperties(properties);
		return mapperScannerConfigurer;
	}
}
