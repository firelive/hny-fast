package io.renren.modules.hydrogen.dao;

import io.renren.modules.hydrogen.entity.FcvdowEntity;
import io.renren.modules.hydrogen.entity.HygComdowEntity;
import io.renren.modules.hydrogen.entity.HygComponentsEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.renren.modules.hydrogen.entity.HygDetsecEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 
 * 
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-23 17:11:29
 */
@Mapper
public interface HygComponentsDao extends BaseMapper<HygComponentsEntity> {

    List<HygComponentsEntity> queryPage();

    List<HygComdowEntity> queryDataList();
}
