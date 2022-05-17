package io.renren.modules.hydrogen.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.hydrogen.entity.FcvVehicleEntity;
import io.renren.modules.hydrogen.entity.FcvdowEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-16 16:12:36
 */
public interface FcvVehicleService extends IService<FcvVehicleEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<FcvdowEntity> queryDataList();
}

