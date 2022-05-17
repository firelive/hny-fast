package io.renren.modules.bzzl.controller;


import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;
import io.renren.modules.bzzl.entity.Area;
import io.renren.modules.bzzl.entity.PatentEntity;
import io.renren.modules.bzzl.service.AreaService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/area")
public class AreaController {
    @Autowired
    AreaService areaService;

    //
//    @PostMapping("/queryDataList")
//    public List<Map<String,Object>> queryDataList(Map<String, Object> params){
//        List<Map<String,Object>> result= areaService.queryDataList(params);
//        return result;
//    }
    @PostMapping("/queryArea")
    public List<Map<String,Object>> queryArea(Map<String, Object> params){
        List<Map<String,Object>> result= areaService.queryArea(params);
        return result;
    }

}
