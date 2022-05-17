package io.renren.modules.hydrogen.dao;

import io.renren.modules.hydrogen.entity.HygStadowEntity;
import io.renren.modules.hydrogen.entity.HygTradowEntity;
import io.renren.modules.hydrogen.entity.HygTransEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 
 * 
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-24 18:39:11
 */
@Mapper
public interface HygTransDao extends BaseMapper<HygTransEntity> {
        
      List<HygTransEntity> queryPage();

      List<HygTradowEntity> queryDataList();
}
