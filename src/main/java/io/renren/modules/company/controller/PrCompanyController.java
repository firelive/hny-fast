package io.renren.modules.company.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.alibaba.excel.EasyExcel;
import io.renren.modules.company.entity.CompanydowEntity;
import io.renren.modules.company.entity.PrdowEntity;
import lombok.SneakyThrows;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.renren.modules.company.entity.PrCompanyEntity;
import io.renren.modules.company.service.PrCompanyService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;


/**
 * 
 *
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-16 11:34:31
 */
@RestController
@RequestMapping("company/prcompany")
public class PrCompanyController {
    @Autowired
    private PrCompanyService prCompanyService;

    @SneakyThrows
    @GetMapping("/prcompExcel")
    public void downLoad(HttpServletResponse response){

        response.setContentType("application/vnd.ms-excel;charset=gb2312");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition", "attachment;filename=");
        try {
//            从HttpServletResponse中获取OutputStream输出流
            ServletOutputStream outputStream = response.getOutputStream();
            EasyExcel.write(outputStream, PrdowEntity.class).sheet("私企").doWrite(queryDataList());
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    @PostMapping("/queryDataList")
    public List<PrdowEntity> queryDataList(){
        List<PrdowEntity> result= prCompanyService.queryDataList();
        return result;
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("company:prcompany:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = prCompanyService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("company:prcompany:info")
    public R info(@PathVariable("id") Integer id){
		PrCompanyEntity prCompany = prCompanyService.getById(id);

        return R.ok().put("prCompany", prCompany);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("company:prcompany:save")
    public R save(@RequestBody PrCompanyEntity prCompany){
		prCompanyService.save(prCompany);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("company:prcompany:update")
    public R update(@RequestBody PrCompanyEntity prCompany){
		prCompanyService.updateById(prCompany);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("company:prcompany:delete")
    public R delete(@RequestBody Integer[] ids){
		prCompanyService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
