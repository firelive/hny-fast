package io.renren.service;


import io.renren.modules.bzzl.dao.StandardDao;
import io.renren.modules.bzzl.entity.StandardEntity;
import io.renren.modules.bzzl.service.StandardService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class logictest {
    @Autowired
    StandardDao standardDao;

    @Autowired
    StandardService standardService;

    @Test
    @RequestMapping("/delete")
    public void delete(){
        standardDao.deleteById(2);
        System.out.println("测试功能");

    }
//    @Test
//    @RequestMapping("/updateDelete")
//    public void updateDelete(@RequestBody List<Integer> id){
//        StandardEntity standardEntity = new StandardEntity();
//        standardEntity.setId(2);
//        standardEntity.
//    }

//    @Test
//    @RequestMapping("/list")
//    public void list(){
//        standardService.queryPage(param);
//
//    }
}
