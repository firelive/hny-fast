package io.renren.modules.demo.controller;

import io.renren.common.utils.R;
import io.renren.modules.demo.entity.NoobDemoEntity;
import io.renren.modules.demo.service.NoobDemoService;
import org.apache.commons.collections.ListUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/demo")
public class NoobDemoController {

    @Autowired
    NoobDemoService noobDemoService;

    @PostMapping("/queryDataList")
    public List<Map<String,Object>> queryDataList(@RequestBody Map<String, Object> params){
        List<Map<String,Object>> result= noobDemoService.queryDataList(params);
        return result;
    }

    @PostMapping("/queryCityName")
    public List<Map<String,Object>> queryCityName(){
        List<Map<String,Object>> result= noobDemoService.queryCityName();
        return result;
    }

    @PostMapping("/queryArea")
    public List<Map<String,Object>> queryArea(@RequestBody Map<String, Object> params){
        List<Map<String,Object>> result= noobDemoService.queryArea(params);
        return result;
    }

    @PostMapping("/insertData")
    public R insertData(@RequestBody Map<String, Object> params){
        return noobDemoService.insertData(params);
    }

    @PostMapping("/deletedId")
    public int deletedId(Integer id){
       return noobDemoService.deletedId(id);
    }


}
