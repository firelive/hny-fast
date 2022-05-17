package io.renren.modules.company.service.impl;

import io.renren.modules.bzzl.entity.StanddowEntity;
import io.renren.modules.company.entity.CompanyEntity;
import io.renren.modules.company.entity.PrdowEntity;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.company.dao.PrCompanyDao;
import io.renren.modules.company.entity.PrCompanyEntity;
import io.renren.modules.company.service.PrCompanyService;


@Service("prCompanyService")
public class PrCompanyServiceImpl extends ServiceImpl<PrCompanyDao, PrCompanyEntity> implements PrCompanyService {

    @Autowired
    PrCompanyDao prCompanyDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        //接受关键字的值
        String key = (String) params.get("key");
        //添加查询条件
        QueryWrapper<PrCompanyEntity> queryWrapper = new QueryWrapper<>();
        //如果关键字不为空，启动查询条件，搜索品牌ID的值
        if (StringUtils.isNotEmpty(key)){
            queryWrapper.like("prcompany_name",key).or().like("prcompany_location",key);
        }
        //将queryWrapper封装进page返回
        IPage<PrCompanyEntity> page = this.page(
                new Query<PrCompanyEntity>().getPage(params),
                queryWrapper
        );

        return new PageUtils(page);
    }
    @Override
    public List<PrdowEntity> queryDataList() {
        return prCompanyDao.queryDataList();
    }
}