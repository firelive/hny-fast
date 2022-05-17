package io.renren.modules.hydrogen.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.alibaba.excel.EasyExcel;
import io.renren.modules.hydrogen.entity.FcvdowEntity;
import io.renren.modules.hydrogen.entity.HygComdowEntity;
import lombok.SneakyThrows;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.renren.modules.hydrogen.entity.HygComponentsEntity;
import io.renren.modules.hydrogen.service.HygComponentsService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;


/**
 * 
 *
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-23 17:11:29
 */
@RestController
@RequestMapping("hydrogen/hygcomponents")
public class HygComponentsController {
    @Autowired
    private HygComponentsService hygComponentsService;

    @SneakyThrows
    @GetMapping("/hygcompExcel")
    public void downLoad(HttpServletResponse response){

        response.setContentType("application/vnd.ms-excel;charset=gb2312");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition", "attachment;filename=");
        try {
//            从HttpServletResponse中获取OutputStream输出流
            ServletOutputStream outputStream = response.getOutputStream();
            EasyExcel.write(outputStream, HygComdowEntity.class).sheet("核心零部件").doWrite(queryDataList());
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    @PostMapping("/queryDataList")
    public List<HygComdowEntity> queryDataList(){
        List<HygComdowEntity> result= hygComponentsService.queryDataList();
        return result;
    }


    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("hydrogen:hygcomponents:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = hygComponentsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("hydrogen:hygcomponents:info")
    public R info(@PathVariable("id") Integer id){
		HygComponentsEntity hygComponents = hygComponentsService.getById(id);

        return R.ok().put("hygComponents", hygComponents);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("hydrogen:hygcomponents:save")
    public R save(@RequestBody HygComponentsEntity hygComponents){
		hygComponentsService.save(hygComponents);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("hydrogen:hygcomponents:update")
    public R update(@RequestBody HygComponentsEntity hygComponents){
		hygComponentsService.updateById(hygComponents);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("hydrogen:hygcomponents:delete")
    public R delete(@RequestBody Integer[] ids){
		hygComponentsService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
