package io.renren.modules.hydrogen.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.alibaba.excel.EasyExcel;
import io.renren.modules.hydrogen.entity.HygStadowEntity;
import io.renren.modules.hydrogen.entity.HygTradowEntity;
import lombok.SneakyThrows;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.renren.modules.hydrogen.entity.HygTransEntity;
import io.renren.modules.hydrogen.service.HygTransService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;


/**
 * 
 *
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-24 18:39:11
 */
@RestController
@RequestMapping("hydrogen/hygtrans")
public class HygTransController {
    @Autowired
    private HygTransService hygTransService;

    @SneakyThrows
    @GetMapping("/hygtransExcel")
    public void downLoad(HttpServletResponse response){

        response.setContentType("application/vnd.ms-excel;charset=gb2312");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition", "attachment;filename=");
        try {
//            从HttpServletResponse中获取OutputStream输出流
            ServletOutputStream outputStream = response.getOutputStream();
            EasyExcel.write(outputStream, HygTradowEntity.class).sheet("运氢").doWrite(queryDataList());
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    @PostMapping("/queryDataList")
    public List<HygTradowEntity> queryDataList(){
        List<HygTradowEntity> result= hygTransService.queryDataList();
        return result;
    }


    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("hydrogen:hygtrans:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = hygTransService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{trid}")
    @RequiresPermissions("hydrogen:hygtrans:info")
    public R info(@PathVariable("trid") Integer trid){
		HygTransEntity hygTrans = hygTransService.getById(trid);

        return R.ok().put("hygTrans", hygTrans);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("hydrogen:hygtrans:save")
    public R save(@RequestBody HygTransEntity hygTrans){
		hygTransService.save(hygTrans);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("hydrogen:hygtrans:update")
    public R update(@RequestBody HygTransEntity hygTrans){
		hygTransService.updateById(hygTrans);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("hydrogen:hygtrans:delete")
    public R delete(@RequestBody Integer[] trids){
		hygTransService.removeByIds(Arrays.asList(trids));

        return R.ok();
    }

}
