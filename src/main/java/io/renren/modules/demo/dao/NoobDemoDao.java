package io.renren.modules.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface NoobDemoDao {
    List<Map<String,Object>> queryDataList(Map<String,Object> entity);

    List<Map<String,Object>> queryCityName();

    List<Map<String,Object>> queryArea(Map<String,Object> params);

    void insertData(Map<String, Object> params);

    int deleteId(Integer id);
}
