package io.renren.modules.bzzl.service.impl;

import io.renren.modules.bzzl.entity.PatentEntity;
import io.renren.modules.bzzl.entity.StanddowEntity;
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

import io.renren.modules.bzzl.dao.StandardDao;
import io.renren.modules.bzzl.entity.StandardEntity;
import io.renren.modules.bzzl.service.StandardService;


@Service("standardService")
public class StandardServiceImpl extends ServiceImpl<StandardDao, StandardEntity> implements StandardService {

    @Autowired
    StandardDao standardDao;
    @Autowired
    StandardService standardService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        String key = (String) params.get("key");
        //添加查询条件
        QueryWrapper<StandardEntity> queryWrapper = new QueryWrapper<>();
        //如果关键字不为空，启动查询条件，搜索标准名或者标准领域
        if (StringUtils.isNotEmpty(key)) {
            queryWrapper.like("stand_name", key).or().like("stand_area", key);
        }
        // 封装进Page返回
        IPage<StandardEntity> page = this.page(
                new Query<StandardEntity>().getPage(params),
                queryWrapper
        );

        return new PageUtils(page);
    }

    @Override
    public boolean updateDelete(StandardEntity standard){
        return standardDao.updateDelete(standard);
    }

    @Override
    public List<StanddowEntity> queryDataList() {
        return standardDao.queryDataList();
    }
}