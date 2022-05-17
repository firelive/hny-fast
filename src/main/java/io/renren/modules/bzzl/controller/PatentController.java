package io.renren.modules.bzzl.controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import cn.hutool.poi.excel.ExcelUtil;
import com.alibaba.excel.EasyExcel;
import io.renren.modules.bzzl.entity.PatentdowEntity;
import io.swagger.annotations.ApiOperation;
import lombok.SneakyThrows;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.renren.modules.bzzl.entity.PatentEntity;
import io.renren.modules.bzzl.service.PatentService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import io.renren.common.utils.ExcelUtils;

/**
 * 
 *
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-02-24 16:39:25
 */
@RestController
@RequestMapping("/patent/patent")
public class PatentController {
    @Autowired
    private PatentService patentService;

    /**
     * 浏览器下载--excel
     */

    @SneakyThrows
    @GetMapping("/downloadExcel")
    public void downLoad(HttpServletResponse response){

        response.setContentType("application/vnd.ms-excel;charset=gb2312");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition", "attachment;filename=");
        try {
//            从HttpServletResponse中获取OutputStream输出流
            ServletOutputStream outputStream = response.getOutputStream();
            EasyExcel.write(outputStream, PatentdowEntity.class).sheet("专利").doWrite(queryDataList());
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("patent:patent:list")
    public R list(@RequestParam Map<String, Object> entity){
        PageUtils page = patentService.queryPage(entity);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("patent:patent:info")
    public R info(@PathVariable("id") Integer id){
		PatentEntity patent = patentService.getById(id);

        return R.ok().put("patent", patent);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("patent:patent:save")
    public R insert(@RequestBody PatentEntity patent){
		patentService.save(patent);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("patent:patent:update")
    public R update(@RequestBody PatentEntity patent){
		patentService.updateById(patent);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("patent:patent:delete")
    public R delete(@RequestBody Integer[] ids){
		patentService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

    @PostMapping("/queryDataList")
    public List<PatentdowEntity> queryDataList(){
        List<PatentdowEntity> result= patentService.queryDataList();
        return result;
    }

}
