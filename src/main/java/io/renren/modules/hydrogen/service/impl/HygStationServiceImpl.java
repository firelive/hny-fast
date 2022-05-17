package io.renren.modules.hydrogen.service.impl;

import io.renren.modules.hydrogen.entity.HygPodowEntity;
import io.renren.modules.hydrogen.entity.HygStadowEntity;
import io.renren.modules.hydrogen.entity.HygTransEntity;
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

import io.renren.modules.hydrogen.dao.HygStationDao;
import io.renren.modules.hydrogen.entity.HygStationEntity;
import io.renren.modules.hydrogen.service.HygStationService;


@Service("hygStationService")
public class HygStationServiceImpl extends ServiceImpl<HygStationDao, HygStationEntity> implements HygStationService {

    @Autowired
    HygStationDao hygStationDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        //接受关键字的值
        String key = (String) params.get("key");
        //添加查询条件

        QueryWrapper<HygStationEntity> queryWrapper = new QueryWrapper<>();
        //如果关键字不为空，启动查询条件，搜索站点名和省名
        if (StringUtils.isNotEmpty(key)){

             queryWrapper.like("station_name",key).or().like("co_province",key);
//                queryWrapper.like(false, "station_name", "key");
        }
        //将queryWrapper封装进page返回
        IPage<HygStationEntity> page = this.page(
                new Query<HygStationEntity>().getPage(params),
                queryWrapper
        );

        return new PageUtils(page);
    }

    @Override
    public List<HygStadowEntity> queryDataList() {
        return hygStationDao.queryDataList();
    }

}