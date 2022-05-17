package io.renren.service;


import io.renren.modules.bzzl.dao.StandardDao;
import io.renren.modules.bzzl.service.StandardService;
import io.renren.modules.demo.dao.NoobDemoDao;
import io.renren.modules.demo.entity.NoobDemoEntity;
import io.renren.modules.demo.service.NoobDemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootTest
@RunWith(SpringRunner.class)
public class noobtest {
    @Autowired
    NoobDemoDao noobDemoDao;

    @Autowired
    NoobDemoService noobDemoService;

//    @Test
//    @RequestMapping("/deletedId")
//    public void delete(){
//        NoobDemoEntity noobDemoEntity = new NoobDemoEntity();
//        noobDemoEntity (1);
//        noobDemoDao.deleteId(2);
//        System.out.println("测试功能");
//
//    }
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
