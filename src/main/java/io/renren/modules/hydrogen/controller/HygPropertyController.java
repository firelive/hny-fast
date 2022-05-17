package io.renren.modules.hydrogen.controller;

import io.renren.modules.hydrogen.service.HygPropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/hygproperty")
public class HygPropertyController {

    @Autowired
    HygPropertyService hygPropertyService;

    @PostMapping("/queryAreaName")
    public List<Map<String,Object>> queryAreaName(){
        List<Map<String,Object>> result= hygPropertyService.queryAreaName();
        return result;
    }

    @PostMapping("/queryMmethodName")
    public List<Map<String,Object>> queryMmethodName(){
        List<Map<String,Object>> result= hygPropertyService.queryMmethodName();
        return result;
    }

    @PostMapping("/queryTmethodName")
    public List<Map<String,Object>> queryTmethodName(){
        List<Map<String,Object>> result= hygPropertyService.queryTmethodName();
        return result;
    }
    @PostMapping("/queryMtypeName")
    public List<Map<String,Object>> queryMtypeName(){
        List<Map<String,Object>> result= hygPropertyService.queryMtypeName();
        return result;
    }
    @PostMapping("/queryTtypeName")
    public List<Map<String,Object>> queryTtypeName(){
        List<Map<String,Object>> result= hygPropertyService.queryTtypeName();
        return result;
    }

    @PostMapping("/queryComType")
    public List<Map<String,Object>> queryComType(){
        List<Map<String,Object>> result= hygPropertyService.queryComType();
        return result;
    }

    @PostMapping("/querySaStatus")
    public List<Map<String,Object>> querySaStatus(){
        List<Map<String,Object>> result = hygPropertyService.querySaStatus();
        return result;
    }

    @PostMapping("/querySaType")
    public List<Map<String,Object>> querySaType(){
        List<Map<String,Object>> result = hygPropertyService.querySaType();
        return result;
    }
//
//    List<Map<String,Object>> queryMmethodName();
//
//    List<Map<String,Object>> queryTmethodName();
//
//    List<Map<String,Object>> queryMtypeName();
//
//    List<Map<String,Object>> queryTtypeName();
//
//    List<Map<String,Object>> queryComType();
}
