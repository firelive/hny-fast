package io.renren.modules.bzzl.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.renren.modules.bzzl.entity.Area;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AreaDao {

//    List<Map<String,Object>> queryDataList(Map<String,Object> entity);
//
    List<Map<String,Object>> queryArea(Map<String,Object> entity);
//    Area queryArea();
}
