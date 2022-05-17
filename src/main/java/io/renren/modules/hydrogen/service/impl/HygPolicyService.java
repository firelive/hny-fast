package io.renren.modules.hydrogen.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.hydrogen.entity.HygPolicyEntity;

import java.util.Map;

/**
 * 
 *
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-16 14:59:47
 */
public interface HygPolicyService extends IService<HygPolicyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

