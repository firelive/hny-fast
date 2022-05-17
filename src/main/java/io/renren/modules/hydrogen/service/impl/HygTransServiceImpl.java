package io.renren.modules.hydrogen.service.impl;

import io.renren.modules.hydrogen.entity.HygPolicyEntity;
import io.renren.modules.hydrogen.entity.HygStadowEntity;
import io.renren.modules.hydrogen.entity.HygTradowEntity;
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

import io.renren.modules.hydrogen.dao.HygTransDao;
import io.renren.modules.hydrogen.entity.HygTransEntity;
import io.renren.modules.hydrogen.service.HygTransService;


@Service("hygTransService")
public class HygTransServiceImpl extends ServiceImpl<HygTransDao, HygTransEntity> implements HygTransService {

    @Autowired
    HygTransDao hygTransDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        //接受关键字的值
        String key = (String) params.get("key");
        //添加查询条件
        QueryWrapper<HygTransEntity> queryWrapper = new QueryWrapper<>();
        //如果关键字不为空，启动查询条件，搜索方式或技术路线
        if (StringUtils.isNotEmpty(key)){
            queryWrapper.like("method",key).or().like("tech_type",key);
        }
        //将queryWrapper封装进page返回
        IPage<HygTransEntity> page = this.page(
                new Query<HygTransEntity>().getPage(params),
                queryWrapper
        );

        return new PageUtils(page);
    }

    @Override
    public List<HygTradowEntity> queryDataList() {
        return hygTransDao.queryDataList();
    }
}