package io.renren.modules.hydrogen.dao;

import io.renren.modules.hydrogen.entity.HygPodowEntity;
import io.renren.modules.hydrogen.entity.HygStadowEntity;
import io.renren.modules.hydrogen.entity.HygStationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.renren.modules.hydrogen.entity.HygTransEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 
 * 
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-24 18:39:51
 */
@Mapper
public interface HygStationDao extends BaseMapper<HygStationEntity> {
        List<HygStationEntity> queryPage();
        List<HygStadowEntity> queryDataList();
}
