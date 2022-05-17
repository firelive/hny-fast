package io.renren.modules.hydrogen.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.hydrogen.entity.HypBudowEntity;
import io.renren.modules.hydrogen.entity.HypButieEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-17 17:53:26
 */
public interface HypButieService extends IService<HypButieEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<HypBudowEntity> queryDataList();

}

