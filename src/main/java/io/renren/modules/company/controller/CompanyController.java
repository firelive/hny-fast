package io.renren.modules.company.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.alibaba.excel.EasyExcel;
import io.renren.modules.bzzl.entity.StanddowEntity;
import io.renren.modules.company.entity.CompanydowEntity;
import lombok.SneakyThrows;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.renren.modules.company.entity.CompanyEntity;
import io.renren.modules.company.service.CompanyService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;


/**
 *
 *
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-16 10:01:58
 */
@RestController
@RequestMapping("company/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @SneakyThrows
    @GetMapping("/companyExcel")
    public void downLoad(HttpServletResponse response){

        response.setContentType("application/vnd.ms-excel;charset=gb2312");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition", "attachment;filename=");
        try {
//            从HttpServletResponse中获取OutputStream输出流
            ServletOutputStream outputStream = response.getOutputStream();
            EasyExcel.write(outputStream, CompanydowEntity.class).sheet("国企").doWrite(queryDataList());
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    @PostMapping("/queryDataList")
    public List<CompanydowEntity> queryDataList(){
        List<CompanydowEntity> result= companyService.queryDataList();
        return result;
    }


    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("company:company:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = companyService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{companyId}")
    @RequiresPermissions("company:company:info")
    public R info(@PathVariable("companyId") Integer companyId){
        CompanyEntity company = companyService.getById(companyId);

        return R.ok().put("company", company);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("company:company:save")
    public R save(@RequestBody CompanyEntity company){
        companyService.save(company);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("company:company:update")
    public R update(@RequestBody CompanyEntity company){
        companyService.updateById(company);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("company:company:delete")
    public R delete(@RequestBody Integer[] companyIds){
        companyService.removeByIds(Arrays.asList(companyIds));

        return R.ok();
    }

}
