package io.renren.modules.bzzl.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.alibaba.excel.EasyExcel;
import io.renren.modules.bzzl.dao.StandardDao;
import io.renren.modules.bzzl.entity.PatentEntity;
import io.renren.modules.bzzl.entity.StanddowEntity;
import lombok.SneakyThrows;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.renren.modules.bzzl.entity.StandardEntity;
import io.renren.modules.bzzl.service.StandardService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;


/**
 * 
 *
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-02-24 16:39:25
 */
@RestController
@RequestMapping("patent/standard")
public class StandardController {
    @Autowired
    private StandardService standardService;

    @Autowired
    private StandardDao standardDao;


    @SneakyThrows
    @GetMapping("/standExcel")
    public void downLoad(HttpServletResponse response){

        response.setContentType("application/vnd.ms-excel;charset=gb2312");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition", "attachment;filename=");
        try {
//            从HttpServletResponse中获取OutputStream输出流
            ServletOutputStream outputStream = response.getOutputStream();
            EasyExcel.write(outputStream, StanddowEntity.class).sheet("标准").doWrite(queryDataList());
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    @PostMapping("/queryDataList")
    public List<StanddowEntity> queryDataList(){
        List<StanddowEntity> result= standardService.queryDataList();
        return result;
    }
    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("patent:standard:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = standardService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("patent:standard:info")
    public R info(@PathVariable("id") Integer id){
		StandardEntity standard = standardService.getById(id);

        return R.ok().put("standard", standard);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("patent:standard:save")
    public R insert(@RequestBody StandardEntity standard){
		standardService.save(standard);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("patent:standard:update")
    public R update(@RequestBody StandardEntity standard){
		standardService.updateById(standard);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("patent:standard:delete")
    public R delete(@RequestBody Integer[] ids){
		standardService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }
    /**
     * 还原删除数据
     */
    @PostMapping("/updateDelete")
    public R updateDelete(@RequestBody StandardEntity standard){
        standardService.updateDelete(standard);
        return R.ok();
    }

}
