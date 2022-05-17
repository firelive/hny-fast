package io.renren.modules.policy.service.impl;

import io.renren.modules.bzzl.entity.StanddowEntity;
import io.renren.modules.policy.entity.PodowEntity;
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

import io.renren.modules.policy.dao.PolicyDao;
import io.renren.modules.policy.entity.PolicyEntity;
import io.renren.modules.policy.service.PolicyService;


@Service("policyService")
public class PolicyServiceImpl extends ServiceImpl<PolicyDao, PolicyEntity> implements PolicyService {

    @Autowired
    PolicyDao policyDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {

        String key = (String) params.get("key");
        //添加查询条件
        QueryWrapper<PolicyEntity> queryWrapper = new QueryWrapper<>();
        //如果关键字不为空，启动查询条件，搜索政策类型或者政策名
        if (StringUtils.isNotEmpty(key)) {
            queryWrapper.like("policy_type", key).or().like("policy_name", key);
        }

        // 封装进Page返回
        IPage<PolicyEntity> page = this.page(
                new Query<PolicyEntity>().getPage(params),
                queryWrapper
        );

        return new PageUtils(page);
    }

    @Override
    public List<PodowEntity> queryDataList() {
        return policyDao.queryDataList();
    }

}