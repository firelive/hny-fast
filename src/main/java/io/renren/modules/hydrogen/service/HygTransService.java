package io.renren.modules.hydrogen.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.hydrogen.entity.HygStadowEntity;
import io.renren.modules.hydrogen.entity.HygTradowEntity;
import io.renren.modules.hydrogen.entity.HygTransEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-24 18:39:11
 */
public interface HygTransService extends IService<HygTransEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<HygTradowEntity> queryDataList();
}

