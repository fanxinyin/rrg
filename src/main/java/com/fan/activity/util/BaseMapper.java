package com.fan.activity.util;

/**
 * @author <a href="mailto:guo_xp@163.com">guoxinpeng</a>
 * @version 1.0 2016/11/14 10:21
 * @projectname repayment
 * @packname com.yingu.service.repayment.config.mybatis
 */

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/** * 被继承的Mapper，一般业务Mapper继承它 * */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
  //TODO
  //FIXME 特别注意，该接口不能被扫描到，否则会出错
}
