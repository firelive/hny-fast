package io.renren.modules.hydrogen.service.impl;

import io.renren.modules.hydrogen.entity.FcvdowEntity;
import io.renren.modules.hydrogen.entity.HygComdowEntity;
import io.renren.modules.hydrogen.entity.HygDetsecEntity;
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

import io.renren.modules.hydrogen.dao.HygComponentsDao;
import io.renren.modules.hydrogen.entity.HygComponentsEntity;
import io.renren.modules.hydrogen.service.HygComponentsService;


@Service("hygComponentsService")
public class HygComponentsServiceImpl extends ServiceImpl<HygComponentsDao, HygComponentsEntity> implements HygComponentsService {

    @Autowired
    HygComponentsDao hygComponentsDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        //接受关键字的值
        String key = (String) params.get("key");
        //添加查询条件
        QueryWrapper<HygComponentsEntity> queryWrapper = new QueryWrapper<>();
        //如果关键字不为空，启动查询条件，搜索企业类型与城市
        if (StringUtils.isNotEmpty(key)){
            queryWrapper.like("enterprise_type",key).or().like("co_city",key);
        }
        //将queryWrapper封装进page返回
        IPage<HygComponentsEntity> page = this.page(
                new Query<HygComponentsEntity>().getPage(params),
                queryWrapper
        );

        return new PageUtils(page);
    }
    @Override
    public List<HygComdowEntity> queryDataList() {
        return hygComponentsDao.queryDataList();
    }

}