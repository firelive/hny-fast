package io.renren.modules.demo.service.impl;

import io.renren.common.utils.R;
import io.renren.modules.demo.dao.NoobDemoDao;
import io.renren.modules.demo.service.NoobDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("NoobDemoService")
public class NoobDemoServiceImpl implements NoobDemoService {
    @Autowired
    NoobDemoDao noobDemoDao;

    @Override
    public List<Map<String,Object>> queryDataList(Map<String, Object> entity) {
        return noobDemoDao.queryDataList(entity);
    }

    @Override
    public List<Map<String, Object>> queryCityName() {
        return noobDemoDao.queryCityName();
    }

    @Override
    public List<Map<String, Object>> queryArea(Map<String, Object> params) {
        return noobDemoDao.queryArea(params);
    }

    @Override
    public R insertData(Map<String, Object> params) {
        R r=R.error("插入失败");
        try {
            noobDemoDao.insertData(params);
            r=R.ok("插入成功");
        }catch (Exception e){
            e.printStackTrace();
        }
        return r;
    }
    @Override
    public int deletedId(Integer id){
        return  noobDemoDao.deleteId(id);
    }
}
