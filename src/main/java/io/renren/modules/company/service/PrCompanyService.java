package io.renren.modules.company.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.company.entity.PrCompanyEntity;
import io.renren.modules.company.entity.PrdowEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-16 11:34:31
 */
public interface PrCompanyService extends IService<PrCompanyEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<PrdowEntity> queryDataList();
}

