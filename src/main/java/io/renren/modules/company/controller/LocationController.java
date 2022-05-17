package io.renren.modules.company.controller;


import io.renren.modules.company.dao.LocationDao;
import io.renren.modules.company.entity.LocationEntity;
import io.renren.modules.company.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    LocationService locationService;

    @PostMapping("/queryPName")
    public List<Map<String,Object>> queryPName(){
        List<Map<String,Object>> result= locationService.queryPName();
        return result;
    }
    @PostMapping("/queryCName")
    public List<Map<String,Object>> queryCName(Map<String, Object> params){
        List<Map<String,Object>> result= locationService.queryCName(params);
        return result;
    }
}
