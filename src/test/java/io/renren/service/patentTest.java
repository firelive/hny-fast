/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 */

package io.renren.service;

import io.renren.modules.bzzl.dao.PatentDao;
import io.renren.modules.bzzl.entity.PatentEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * 测试多数据源
 *
 * @author
 */
@Service
@SpringBootTest
//@DataSource("slave1")
@RunWith(SpringRunner.class)
public class patentTest {
    @Autowired
    private PatentDao patentDao;

//    @Test
//    public void queryAll(){
//      List<PatentEntity> list = patentDao.queryDataList();
//      for (PatentEntity d: list) {
//          System.out.println(d);
//      }
//    }


}