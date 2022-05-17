package io.renren.modules.hydrogen.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.modules.hydrogen.dao.HygPropertyDao;
import io.renren.modules.hydrogen.entity.HygProperty;
import io.renren.modules.hydrogen.service.HygPropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("HygPropertyService")
public class HygPropertyServiceImpl  implements HygPropertyService {

   @Autowired
   HygPropertyDao hygpropertyDao;

    @Override
    public List<Map<String, Object>> queryAreaName() {
        return hygpropertyDao.queryAreaName();
    }

    @Override
    public List<Map<String, Object>> queryMmethodName() {
        return hygpropertyDao.queryMmethodName();
    }

    @Override
    public List<Map<String, Object>> queryTmethodName() {
        return hygpropertyDao.queryTmethodName();
    }

    @Override
    public List<Map<String, Object>> queryMtypeName() {
        return hygpropertyDao.queryMtypeName();
    }
    @Override
    public List<Map<String, Object>> queryTtypeName() {
        return hygpropertyDao.queryTtypeName();
    }

    @Override
    public List<Map<String, Object>> queryComType() {
        return hygpropertyDao.queryComType();
    }

    @Override
    public List<Map<String,Object>> querySaStatus(){
        return hygpropertyDao.querySaStatus();}

    @Override
    public   List<Map<String,Object>> querySaType(){
        return hygpropertyDao.querySaType();
    }
}
