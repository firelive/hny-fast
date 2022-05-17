package io.renren.modules.company.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.company.entity.CompanyEntity;
import io.renren.modules.company.entity.CompanydowEntity;

import java.util.List;
import java.util.Map;

/**
 *
 *
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-16 10:01:58
 */
public interface CompanyService extends IService<CompanyEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CompanydowEntity> queryDataList();
}
