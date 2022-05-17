package io.renren.modules.hydrogen.service.impl;

import io.renren.modules.hydrogen.entity.HygComdowEntity;
import io.renren.modules.hydrogen.entity.HygDetdowEntity;
import io.renren.modules.hydrogen.entity.HygPolicyEntity;
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

import io.renren.modules.hydrogen.dao.HygDetsecDao;
import io.renren.modules.hydrogen.entity.HygDetsecEntity;
import io.renren.modules.hydrogen.service.HygDetsecService;


@Service("hygDetsecService")
public class HygDetsecServiceImpl extends ServiceImpl<HygDetsecDao, HygDetsecEntity> implements HygDetsecService {

    @Autowired
    HygDetsecDao hygDetsecDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        //接受关键字的值
        String key = (String) params.get("key");
        //添加查询条件
        QueryWrapper<HygDetsecEntity> queryWrapper = new QueryWrapper<>();
        //如果关键字不为空，启动查询条件，搜索平台与地区
        if (StringUtils.isNotEmpty(key)){
            queryWrapper.like("project_platform",key).or().like("area",key);
        }
        //将queryWrapper封装进page返回
        IPage<HygDetsecEntity> page = this.page(
                new Query<HygDetsecEntity>().getPage(params),
                queryWrapper
        );

        return new PageUtils(page);
    }
    @Override
    public List<HygDetdowEntity> queryDataList() {
        return hygDetsecDao.queryDataList();
    }

}