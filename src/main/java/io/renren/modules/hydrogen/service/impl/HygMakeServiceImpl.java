package io.renren.modules.hydrogen.service.impl;

import io.renren.modules.hydrogen.entity.HygDetdowEntity;
import io.renren.modules.hydrogen.entity.HygDetsecEntity;
import io.renren.modules.hydrogen.entity.HygMadowEntity;
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

import io.renren.modules.hydrogen.dao.HygMakeDao;
import io.renren.modules.hydrogen.entity.HygMakeEntity;
import io.renren.modules.hydrogen.service.HygMakeService;


@Service("hygMakeService")
public class HygMakeServiceImpl extends ServiceImpl<HygMakeDao, HygMakeEntity> implements HygMakeService {

    @Autowired
    HygMakeDao hygMakeDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        //接受关键字的值
        String key = (String) params.get("key");
        //添加查询条件
        QueryWrapper<HygMakeEntity> queryWrapper = new QueryWrapper<>();
        //如果关键字不为空，启动查询条件，搜索方式方法/企业名
        if (StringUtils.isNotEmpty(key)){
            queryWrapper.like("mamethod",key).or().like("company",key);
        }
        //将queryWrapper封装进page返回
        IPage<HygMakeEntity> page = this.page(
                new Query<HygMakeEntity>().getPage(params),
                queryWrapper
        );

        return new PageUtils(page);
    }
    @Override
    public List<HygMadowEntity> queryDataList() {
        return hygMakeDao.queryDataList();
    }

}