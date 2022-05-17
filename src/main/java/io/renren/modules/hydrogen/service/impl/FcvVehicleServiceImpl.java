package io.renren.modules.hydrogen.service.impl;

import io.renren.modules.bzzl.entity.StanddowEntity;
import io.renren.modules.hydrogen.entity.FcvdowEntity;
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

import io.renren.modules.hydrogen.dao.FcvVehicleDao;
import io.renren.modules.hydrogen.entity.FcvVehicleEntity;
import io.renren.modules.hydrogen.service.FcvVehicleService;


@Service("fcvVehicleService")
public class FcvVehicleServiceImpl extends ServiceImpl<FcvVehicleDao, FcvVehicleEntity> implements FcvVehicleService {

    @Autowired
    FcvVehicleDao fcvVehicleDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        //接受关键字的值
        String key = (String) params.get("key");
        //添加查询条件
        QueryWrapper<FcvVehicleEntity> queryWrapper = new QueryWrapper<>();
        //如果关键字不为空，启动查询条件，搜索品牌和车辆类型
        if (StringUtils.isNotEmpty(key)){
            queryWrapper.like("brand_name",key).or().like("car_type",key);
        }
        //将queryWrapper封装进page返回
        IPage<FcvVehicleEntity> page = this.page(
                new Query<FcvVehicleEntity>().getPage(params),
                queryWrapper
        );

        return new PageUtils(page);
    }

    @Override
    public List<FcvdowEntity> queryDataList() {
        return fcvVehicleDao.queryDataList();
    }

}