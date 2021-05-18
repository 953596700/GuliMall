package com.learn.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learn.common.utils.PageUtils;
import com.learn.gulimall.order.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author laoyu
 * @email 953596700@qq.com
 * @date 2021-05-18 13:30:11
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

