package io.renren.modules.policy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.modules.policy.entity.PolicyTypeEntity;

import java.util.List;
import java.util.Map;

public interface PolicyTypeService  {

    List<Map<String,Object>> queryTypeName();
}
