package io.renren.modules.company.service;

import io.renren.modules.company.dao.LocationDao;
import io.renren.modules.company.entity.LocationEntity;

import java.util.List;
import java.util.Map;

public interface LocationService {

    List<Map<String,Object>> queryPName();
    List<Map<String,Object>> queryCName(Map<String,Object> params);


}
