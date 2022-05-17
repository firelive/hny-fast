package io.renren.modules.hydrogen.dao;

import io.renren.modules.hydrogen.entity.HygDetdowEntity;
import io.renren.modules.hydrogen.entity.HygMadowEntity;
import io.renren.modules.hydrogen.entity.HygMakeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.renren.modules.hydrogen.entity.HygPolicyEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 
 * 
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-24 18:38:26
 */
@Mapper
public interface HygMakeDao extends BaseMapper<HygMakeEntity> {
     List<HygMakeEntity> queryPage();

     List<HygMadowEntity> queryDataList();
}
