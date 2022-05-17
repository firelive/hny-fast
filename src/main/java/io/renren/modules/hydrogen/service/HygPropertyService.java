package io.renren.modules.hydrogen.service;

import java.util.List;
import java.util.Map;

public interface HygPropertyService {


    List<Map<String,Object>> queryAreaName();

    List<Map<String,Object>> queryMmethodName();

    List<Map<String,Object>> queryTmethodName();

    List<Map<String,Object>> queryMtypeName();

    List<Map<String,Object>> queryTtypeName();

    List<Map<String,Object>> queryComType();

    List<Map<String,Object>> querySaStatus();

    List<Map<String,Object>> querySaType();
}
