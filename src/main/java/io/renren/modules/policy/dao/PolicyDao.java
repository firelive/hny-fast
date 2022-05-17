package io.renren.modules.policy.dao;

import io.renren.modules.bzzl.entity.PatentdowEntity;
import io.renren.modules.policy.entity.PodowEntity;
import io.renren.modules.policy.entity.PolicyEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-14 11:52:06
 */
@Mapper
public interface PolicyDao extends BaseMapper<PolicyEntity> {
//    List<Map<String,Object>> queryDataList(Map<String,Object> entity);

//    List<Map<String,Object>> queryPage(Map<String,Object> entity);
//    @Select("")
    List<PolicyEntity> queryPage();

    List<PodowEntity> queryDataList();
}
