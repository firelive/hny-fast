package io.renren.modules.policy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.bzzl.entity.PatentdowEntity;
import io.renren.modules.policy.entity.PodowEntity;
import io.renren.modules.policy.entity.PolicyEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-14 11:52:06
 */
public interface PolicyService extends IService<PolicyEntity> {

   PageUtils queryPage(Map<String, Object> params);

   List<PodowEntity> queryDataList();
}

