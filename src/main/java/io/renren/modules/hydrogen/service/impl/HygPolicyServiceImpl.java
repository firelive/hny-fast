package io.renren.modules.hydrogen.service.impl;

import io.renren.modules.company.entity.PrCompanyEntity;
import io.renren.modules.hydrogen.entity.HygMadowEntity;
import io.renren.modules.hydrogen.entity.HygPodowEntity;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.hydrogen.dao.HygPolicyDao;
import io.renren.modules.hydrogen.entity.HygPolicyEntity;
import io.renren.modules.hydrogen.service.HygPolicyService;


@Service("hygPolicyService")
public class HygPolicyServiceImpl extends ServiceImpl<HygPolicyDao, HygPolicyEntity> implements HygPolicyService {

    @Autowired
    HygPolicyDao hygPolicyDao;
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        //接受关键字的值
        String key = (String)params.get("key");
        IPage<HygPolicyEntity> page = this.page(
            new Query<HygPolicyEntity>().getPage(params),
             new QueryWrapper<HygPolicyEntity>().like(StringUtils.isNotBlank(key),"department_name", key).or().like(
                        "hypolicy_name",key)
                );
        return new PageUtils(page);
    }

    @Override
    public List<HygPodowEntity> queryDataList() {
        return hygPolicyDao.queryDataList();
    }
}