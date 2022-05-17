package io.renren.modules.demo.service;

import io.renren.common.utils.R;

import java.util.List;
import java.util.Map;

public interface NoobDemoService {
    List<Map<String,Object>> queryDataList(Map<String,Object> entity);

    List<Map<String,Object>> queryCityName();

    List<Map<String,Object>> queryArea(Map<String,Object> params);

    R insertData(Map<String, Object> params);

    int deletedId(Integer id);
}
