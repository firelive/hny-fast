package io.renren.modules.hydrogen.dao;

import io.renren.modules.company.entity.CompanyEntity;
import io.renren.modules.hydrogen.entity.HygMadowEntity;
import io.renren.modules.hydrogen.entity.HygPodowEntity;
import io.renren.modules.hydrogen.entity.HygPolicyEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 
 * 
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-16 14:59:47
 */
@Mapper
public interface HygPolicyDao extends BaseMapper<HygPolicyEntity> {
        List<HygPolicyEntity> queryPage();

        List<HygPodowEntity> queryDataList();
}
