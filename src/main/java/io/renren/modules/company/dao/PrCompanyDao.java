package io.renren.modules.company.dao;

import io.renren.modules.bzzl.entity.PatentdowEntity;
import io.renren.modules.company.entity.CompanyEntity;
import io.renren.modules.company.entity.CompanydowEntity;
import io.renren.modules.company.entity.PrCompanyEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.renren.modules.company.entity.PrdowEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 
 * 
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-16 11:34:31
 */
@Mapper
public interface PrCompanyDao extends BaseMapper<PrCompanyEntity> {

      List<PrdowEntity> queryDataList();
}
