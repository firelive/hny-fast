package io.renren.modules.bzzl.dao;

import io.renren.modules.bzzl.entity.PatentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.renren.modules.bzzl.entity.PatentdowEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-02-24 16:39:25
 */
@Mapper
public interface PatentDao extends BaseMapper<PatentEntity> {


    List<PatentdowEntity> queryDataList();

}
