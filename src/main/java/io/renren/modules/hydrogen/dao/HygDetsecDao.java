package io.renren.modules.hydrogen.dao;

import io.renren.modules.hydrogen.entity.HygComdowEntity;
import io.renren.modules.hydrogen.entity.HygDetdowEntity;
import io.renren.modules.hydrogen.entity.HygDetsecEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.renren.modules.hydrogen.entity.HygPolicyEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 
 * 
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-22 20:12:19
 */
@Mapper
public interface HygDetsecDao extends BaseMapper<HygDetsecEntity> {

       List<HygDetsecEntity> queryPage();

    List<HygDetdowEntity> queryDataList();
}
