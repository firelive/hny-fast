package io.renren.modules.bzzl.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.modules.bzzl.entity.Area;

import java.util.List;
import java.util.Map;

public interface AreaService {
//
//    List<Map<String,Object>> queryDataList(Map<String,Object> entity);
//
//    List<Map<String,Object>> queryAreaName();

    List<Map<String,Object>> queryArea(Map<String,Object> entity);

    //
    //    @Override
    //    public List<Map<String,Object>> queryDataList(Map<String, Object> params) {
    //        return areaDao.queryDataList(params);
    //    }
    //    @Override
    //    public List<Map<String, Object>> queryAreaName() {
    //        return areaDao.queryAreaName();
    //    }

}
