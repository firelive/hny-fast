package io.renren.modules.company.dao;

import io.renren.modules.bzzl.entity.StanddowEntity;
import io.renren.modules.company.entity.CompanyEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.renren.modules.company.entity.CompanydowEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 *
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-16 10:01:58
 */
@Mapper
public interface CompanyDao extends BaseMapper<CompanyEntity> {

        List<CompanyEntity> queryPage();

        List<CompanydowEntity> queryDataList();
}
