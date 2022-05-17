package io.renren.modules.company.service.impl;

import io.renren.modules.company.dao.LocationDao;
import io.renren.modules.company.entity.LocationEntity;
import io.renren.modules.company.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("LocationService")
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationDao locationDao;

    @Override
    public List<Map<String,Object>> queryPName() {
        return  locationDao.queryPName();

    }
    @Override
    public List<Map<String, Object>> queryCName(Map<String, Object> params) {
        return locationDao.queryCName(params);
    }


}