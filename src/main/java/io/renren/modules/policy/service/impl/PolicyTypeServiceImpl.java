package io.renren.modules.policy.service.impl;


import io.renren.modules.policy.dao.PolicyTypeDao;
import io.renren.modules.policy.service.PolicyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("PolicyTypeService")
public class PolicyTypeServiceImpl implements PolicyTypeService {

    @Autowired
    PolicyTypeDao policyTypeDao;

    @Override
    public List<Map<String,Object>> queryTypeName(){
        return policyTypeDao.queryTypeName();

    }
}
