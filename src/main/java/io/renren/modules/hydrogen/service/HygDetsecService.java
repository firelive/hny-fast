package io.renren.modules.hydrogen.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.hydrogen.entity.HygDetdowEntity;
import io.renren.modules.hydrogen.entity.HygDetsecEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-22 20:12:19
 */
public interface HygDetsecService extends IService<HygDetsecEntity> {

    PageUtils queryPage(Map<String, Object> params);
    List<HygDetdowEntity> queryDataList();
}

