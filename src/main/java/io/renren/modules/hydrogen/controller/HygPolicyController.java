package io.renren.modules.hydrogen.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.alibaba.excel.EasyExcel;
import io.renren.modules.hydrogen.entity.HygMadowEntity;
import io.renren.modules.hydrogen.entity.HygPodowEntity;
import lombok.SneakyThrows;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.renren.modules.hydrogen.entity.HygPolicyEntity;
import io.renren.modules.hydrogen.service.HygPolicyService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;


/**
 * 
 *
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-16 14:59:47
 */
@RestController
@RequestMapping("hydrogen/hygpolicy")
public class HygPolicyController {
    @Autowired
    private HygPolicyService hygPolicyService;


    @SneakyThrows
    @GetMapping("/hygpoliExcel")
    public void downLoad(HttpServletResponse response){

        response.setContentType("application/vnd.ms-excel;charset=gb2312");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition", "attachment;filename=");
        try {
//            从HttpServletResponse中获取OutputStream输出流
            ServletOutputStream outputStream = response.getOutputStream();
            EasyExcel.write(outputStream, HygPodowEntity.class).sheet("氢能政策").doWrite(queryDataList());
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    @PostMapping("/queryDataList")
    public List<HygPodowEntity> queryDataList(){
        List<HygPodowEntity> result= hygPolicyService.queryDataList();
        return result;
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("hydrogen:hygpolicy:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = hygPolicyService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{hpid}")
    @RequiresPermissions("hydrogen:hygpolicy:info")
    public R info(@PathVariable("hpid") Integer hpid){
		HygPolicyEntity hygPolicy = hygPolicyService.getById(hpid);

        return R.ok().put("hygPolicy", hygPolicy);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("hydrogen:hygpolicy:save")
    public R save(@RequestBody HygPolicyEntity hygPolicy){
		hygPolicyService.save(hygPolicy);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("hydrogen:hygpolicy:update")
    public R update(@RequestBody HygPolicyEntity hygPolicy){
		hygPolicyService.updateById(hygPolicy);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("hydrogen:hygpolicy:delete")
    public R delete(@RequestBody Integer[] hpids){
		hygPolicyService.removeByIds(Arrays.asList(hpids));

        return R.ok();
    }

}
