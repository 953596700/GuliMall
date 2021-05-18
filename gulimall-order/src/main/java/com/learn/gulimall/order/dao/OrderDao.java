package com.learn.gulimall.order.dao;

import com.learn.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author laoyu
 * @email 953596700@qq.com
 * @date 2021-05-18 13:30:11
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
