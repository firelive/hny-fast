package io.renren.modules.bzzl.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.write.style.column.LongestMatchColumnWidthStyleStrategy;
import io.renren.common.utils.R;
import io.renren.modules.bzzl.entity.PatentdowEntity;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.bzzl.dao.PatentDao;
import io.renren.modules.bzzl.entity.PatentEntity;
import io.renren.modules.bzzl.service.PatentService;
import org.apache.commons.lang.StringUtils;

import javax.servlet.http.HttpServletResponse;


@Service("patentService")
public class PatentServiceImpl extends ServiceImpl<PatentDao, PatentEntity> implements PatentService {

            @Autowired
            PatentDao patentDao;

            @Override
            public PageUtils queryPage(Map<String, Object> params) {
                //接受关键字的值
                String key = (String) params.get("key");
                //添加查询条件
                QueryWrapper<PatentEntity> queryWrapper = new QueryWrapper<>();
                //如果关键字不为空，启动查询条件，搜索品牌ID的值或者模糊搜索名称
                if (StringUtils.isNotEmpty(key)){
                    queryWrapper.like("patent_name",key).or().like("patent_code",key);
                }
                //将queryWrapper封装进page返回
                IPage<PatentEntity> page = this.page(
                        new Query<PatentEntity>().getPage(params),
                        queryWrapper
                );

                return new PageUtils(page);
            }

        @Override
        public List<PatentdowEntity> queryDataList() {
            return patentDao.queryDataList();
        }


}