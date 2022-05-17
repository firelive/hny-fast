package io.renren.modules.company.dao;

import io.renren.modules.company.entity.LocationEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface LocationDao {

    List<Map<String,Object>> queryPName();

    List<Map<String,Object>> queryCName(Map<String,Object> params);

}
