/*
 *  
 * Create by 杜宇 2018年5月30日
 * 
 * Copyright (c) 2018 东方银谷投资管理有限公司
 */
package com.fan.activity.mybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;


/**
 * 被继承的Mapper，一般业务Mapper继承它
 * 
 * @author 杜宇 duyu@yingu.com
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
  //TODO
  //FIXME 特别注意，该接口不能被扫描到，否则会出错
}
