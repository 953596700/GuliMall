package com.learn.gulimall.order.dao;

import com.learn.gulimall.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author laoyu
 * @email 953596700@qq.com
 * @date 2021-05-18 13:30:11
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}
