package io.renren.modules.hydrogen.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.hydrogen.entity.HygComdowEntity;
import io.renren.modules.hydrogen.entity.HygComponentsEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-23 17:11:29
 */
public interface HygComponentsService extends IService<HygComponentsEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<HygComdowEntity> queryDataList();
}

