package io.renren.modules.hydrogen.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface HygPropertyDao  {


    List<Map<String,Object>> queryAreaName();

    List<Map<String,Object>> queryMmethodName();

    List<Map<String,Object>> queryTmethodName();

    List<Map<String,Object>> queryMtypeName();

    List<Map<String,Object>> queryTtypeName();

    List<Map<String,Object>> queryComType();

    List<Map<String,Object>> querySaStatus();

    List<Map<String,Object>> querySaType();


}
