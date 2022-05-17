package io.renren.modules.hydrogen.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.alibaba.excel.EasyExcel;
import io.renren.modules.hydrogen.entity.HygDetdowEntity;
import io.renren.modules.hydrogen.entity.HygMadowEntity;
import lombok.SneakyThrows;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.renren.modules.hydrogen.entity.HygMakeEntity;
import io.renren.modules.hydrogen.service.HygMakeService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;


/**
 * 
 *
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-24 18:38:26
 */
@RestController
@RequestMapping("hydrogen/hygmake")
public class HygMakeController {
    @Autowired
    private HygMakeService hygMakeService;

    @SneakyThrows
    @GetMapping("/hygmakeExcel")
    public void downLoad(HttpServletResponse response){

        response.setContentType("application/vnd.ms-excel;charset=gb2312");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition", "attachment;filename=");
        try {
//            从HttpServletResponse中获取OutputStream输出流
            ServletOutputStream outputStream = response.getOutputStream();
            EasyExcel.write(outputStream, HygMadowEntity.class).sheet("制氢").doWrite(queryDataList());
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    @PostMapping("/queryDataList")
    public List<HygMadowEntity> queryDataList(){
        List<HygMadowEntity> result= hygMakeService.queryDataList();
        return result;
    }



    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("hydrogen:hygmake:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = hygMakeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{mid}")
    @RequiresPermissions("hydrogen:hygmake:info")
    public R info(@PathVariable("mid") Integer mid){
		HygMakeEntity hygMake = hygMakeService.getById(mid);

        return R.ok().put("hygMake", hygMake);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("hydrogen:hygmake:save")
    public R save(@RequestBody HygMakeEntity hygMake){
		hygMakeService.save(hygMake);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("hydrogen:hygmake:update")
    public R update(@RequestBody HygMakeEntity hygMake){
		hygMakeService.updateById(hygMake);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("hydrogen:hygmake:delete")
    public R delete(@RequestBody Integer[] mids){
		hygMakeService.removeByIds(Arrays.asList(mids));

        return R.ok();
    }

}
