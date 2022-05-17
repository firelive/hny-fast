package io.renren.modules.bzzl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.modules.bzzl.dao.AreaDao;
import io.renren.modules.bzzl.entity.Area;
import io.renren.modules.bzzl.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("AreaService")
public class AreaServiceImpl implements AreaService {
    @Autowired
    AreaDao areaDao;

    //
//    @Override
//    public List<Map<String,Object>> queryDataList(Map<String, Object> params) {
//        return areaDao.queryDataList(params);
//    }
//    @Override
//    public List<Map<String, Object>> queryAreaName() {
//        return areaDao.queryAreaName();
//    }
    @Override
    public List<Map<String,Object>> queryArea(Map<String, Object> entity) {
        return areaDao.queryArea(entity);
    }

}
