package io.renren.modules.hydrogen.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.hydrogen.entity.HygMadowEntity;
import io.renren.modules.hydrogen.entity.HygMakeEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-24 18:38:26
 */
public interface HygMakeService extends IService<HygMakeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    List<HygMadowEntity> queryDataList();
}

