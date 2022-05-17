package io.renren.modules.company.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.modules.bzzl.entity.StanddowEntity;
import io.renren.modules.company.dao.CompanyDao;
import io.renren.modules.company.entity.CompanyEntity;
import io.renren.modules.company.entity.CompanydowEntity;
import io.renren.modules.company.service.CompanyService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("companyService")
public class CompanyServiceImpl extends ServiceImpl<CompanyDao, CompanyEntity> implements CompanyService {

    @Autowired
    CompanyDao companyDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        //接受关键字的值
        String key = (String) params.get("key");
        //添加查询条件
        QueryWrapper<CompanyEntity> queryWrapper = new QueryWrapper<>();
        //如果关键字不为空，启动查询条件，搜索企业名称或实施主体
        if (StringUtils.isNotEmpty(key)){
            queryWrapper.like("comp_name",key).or().like("subject_impl",key);
        }
        //将queryWrapper封装进page返回
        IPage<CompanyEntity> page = this.page(
                new Query<CompanyEntity>().getPage(params),
                queryWrapper
        );

        return new PageUtils(page);
    }

    @Override
    public List<CompanydowEntity> queryDataList() {
        return companyDao.queryDataList();
    }
}
