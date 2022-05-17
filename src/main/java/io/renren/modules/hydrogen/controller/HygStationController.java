package io.renren.modules.hydrogen.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.alibaba.excel.EasyExcel;
import io.renren.modules.hydrogen.entity.HygPodowEntity;
import io.renren.modules.hydrogen.entity.HygStadowEntity;
import lombok.SneakyThrows;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.renren.modules.hydrogen.entity.HygStationEntity;
import io.renren.modules.hydrogen.service.HygStationService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;


/**
 * 
 *
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-24 18:39:51
 */
@RestController
@RequestMapping("hydrogen/hygstation")
public class HygStationController {
    @Autowired
    private HygStationService hygStationService;

    @SneakyThrows
    @GetMapping("/hygstaExcel")
    public void downLoad(HttpServletResponse response){

        response.setContentType("application/vnd.ms-excel;charset=gb2312");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition", "attachment;filename=");
        try {
//            从HttpServletResponse中获取OutputStream输出流
            ServletOutputStream outputStream = response.getOutputStream();
            EasyExcel.write(outputStream, HygStadowEntity.class).sheet("加氢站").doWrite(queryDataList());
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    @PostMapping("/queryDataList")
    public List<HygStadowEntity> queryDataList(){
        List<HygStadowEntity> result= hygStationService.queryDataList();
        return result;
    }


    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("hydrogen:hygstation:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = hygStationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("hydrogen:hygstation:info")
    public R info(@PathVariable("id") Integer id){
		HygStationEntity hygStation = hygStationService.getById(id);

        return R.ok().put("hygStation", hygStation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("hydrogen:hygstation:save")
    public R save(@RequestBody HygStationEntity hygStation){
		hygStationService.save(hygStation);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("hydrogen:hygstation:update")
    public R update(@RequestBody HygStationEntity hygStation){
		hygStationService.updateById(hygStation);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("hydrogen:hygstation:delete")
    public R delete(@RequestBody Integer[] ids){
		hygStationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
