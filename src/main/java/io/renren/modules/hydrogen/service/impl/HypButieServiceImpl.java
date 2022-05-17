package io.renren.modules.hydrogen.service.impl;

import io.renren.modules.hydrogen.entity.FcvVehicleEntity;
import io.renren.modules.hydrogen.entity.HygTradowEntity;
import io.renren.modules.hydrogen.entity.HypBudowEntity;
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

import io.renren.modules.hydrogen.dao.HypButieDao;
import io.renren.modules.hydrogen.entity.HypButieEntity;
import io.renren.modules.hydrogen.service.HypButieService;


@Service("hypButieService")
public class HypButieServiceImpl extends ServiceImpl<HypButieDao, HypButieEntity> implements HypButieService {

    @Autowired
    HypButieDao hypButieDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        //接受关键字的值
        String key = (String) params.get("key");
        //添加查询条件
        QueryWrapper<HypButieEntity> queryWrapper = new QueryWrapper<>();
        //如果关键字不为空，启动查询条件，搜索文件号或发布部门
        if (StringUtils.isNotEmpty(key)){
            queryWrapper.like("document_code",key).or().like("pubulish_department",key).or().like("document_name",key);
        }
        //将queryWrapper封装进page返回
        IPage<HypButieEntity> page = this.page(
                new Query<HypButieEntity>().getPage(params),
                queryWrapper
        );

        return new PageUtils(page);
    }

    @Override
    public List<HypBudowEntity> queryDataList() {
        return hypButieDao.queryDataList();
    }
}