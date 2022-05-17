package io.renren.modules.hydrogen.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.alibaba.excel.EasyExcel;
import io.renren.modules.hydrogen.entity.HygComdowEntity;
import io.renren.modules.hydrogen.entity.HygDetdowEntity;
import lombok.SneakyThrows;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.renren.modules.hydrogen.entity.HygDetsecEntity;
import io.renren.modules.hydrogen.service.HygDetsecService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;


/**
 * 
 *
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-22 20:12:19
 */
@RestController
@RequestMapping("hydrogen/hygdetsec")
public class HygDetsecController {
    @Autowired
    private HygDetsecService hygDetsecService;

    @SneakyThrows
    @GetMapping("/hygdetExcel")
    public void downLoad(HttpServletResponse response){

        response.setContentType("application/vnd.ms-excel;charset=gb2312");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition", "attachment;filename=");
        try {
//            从HttpServletResponse中获取OutputStream输出流
            ServletOutputStream outputStream = response.getOutputStream();
            EasyExcel.write(outputStream, HygDetdowEntity.class).sheet("氢气安全与检测").doWrite(queryDataList());
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    @PostMapping("/queryDataList")
    public List<HygDetdowEntity> queryDataList(){
        List<HygDetdowEntity> result= hygDetsecService.queryDataList();
        return result;
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("hydrogen:hygdetsec:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = hygDetsecService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{dsid}")
    @RequiresPermissions("hydrogen:hygdetsec:info")
    public R info(@PathVariable("dsid") Integer dsid){
		HygDetsecEntity hygDetsec = hygDetsecService.getById(dsid);

        return R.ok().put("hygDetsec", hygDetsec);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("hydrogen:hygdetsec:save")
    public R save(@RequestBody HygDetsecEntity hygDetsec){
		hygDetsecService.save(hygDetsec);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("hydrogen:hygdetsec:update")
    public R update(@RequestBody HygDetsecEntity hygDetsec){
		hygDetsecService.updateById(hygDetsec);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("hydrogen:hygdetsec:delete")
    public R delete(@RequestBody Integer[] dsids){
		hygDetsecService.removeByIds(Arrays.asList(dsids));

        return R.ok();
    }

}
