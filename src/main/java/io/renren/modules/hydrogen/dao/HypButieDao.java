package io.renren.modules.hydrogen.dao;

import io.renren.modules.hydrogen.entity.HygPolicyEntity;
import io.renren.modules.hydrogen.entity.HygTradowEntity;
import io.renren.modules.hydrogen.entity.HypBudowEntity;
import io.renren.modules.hydrogen.entity.HypButieEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 
 * 
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-17 17:53:26
 */
@Mapper
public interface HypButieDao extends BaseMapper<HypButieEntity> {
    List<HypButieEntity> queryPage();
    List<HypBudowEntity> queryDataList();
}
