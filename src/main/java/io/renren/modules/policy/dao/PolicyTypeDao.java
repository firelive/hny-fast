package io.renren.modules.policy.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PolicyTypeDao {

    List<Map<String,Object>> queryTypeName();
}
