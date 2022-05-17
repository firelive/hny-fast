package io.renren.modules.bzzl.dao;

import io.renren.common.utils.PageUtils;
import io.renren.modules.bzzl.entity.PatentEntity;
import io.renren.modules.bzzl.entity.StandardEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.renren.modules.bzzl.entity.StanddowEntity;
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
public interface StandardDao extends BaseMapper<StandardEntity> {

//    List<List<Integer>> updateDelete(List<Integer> params);
    boolean updateDelete(StandardEntity standard);

    List<StanddowEntity> queryDataList();
}
