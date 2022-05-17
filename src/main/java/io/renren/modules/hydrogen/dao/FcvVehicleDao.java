package io.renren.modules.hydrogen.dao;

import io.renren.modules.hydrogen.entity.FcvVehicleEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.renren.modules.hydrogen.entity.FcvdowEntity;
import io.renren.modules.hydrogen.entity.HygPolicyEntity;
import io.renren.modules.policy.entity.PodowEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 
 * 
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-16 16:12:36
 */
@Mapper
public interface FcvVehicleDao extends BaseMapper<FcvVehicleEntity> {
     List<FcvVehicleEntity> queryPage();

     List<FcvdowEntity> queryDataList();
}
