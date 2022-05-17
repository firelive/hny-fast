/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 */

package io.renren.service;

import io.renren.modules.company.dao.CompanyDao;
import io.renren.modules.company.entity.CompanyEntity;
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
public class CompanyTest {
    @Autowired
    private CompanyDao companyDao;

    @Test
    public void queryPage(){
      List<CompanyEntity> list = companyDao.queryPage();
      for (CompanyEntity d: list) {
          System.out.println(d);
      }
    }


}