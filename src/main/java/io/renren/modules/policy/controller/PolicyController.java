package io.renren.modules.policy.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.alibaba.excel.EasyExcel;
import io.renren.common.utils.PageUtils;
import io.renren.modules.company.entity.PrdowEntity;
import io.renren.modules.policy.entity.PodowEntity;
import lombok.SneakyThrows;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.renren.modules.policy.entity.PolicyEntity;
import io.renren.modules.policy.service.PolicyService;
import io.renren.common.utils.R;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;


/**
 * 
 *
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-14 11:52:06
 */
@RestController
@RequestMapping("policy/policy")
public class PolicyController {
    @Autowired
    private PolicyService policyService;

    @SneakyThrows
    @GetMapping("/policyExcel")
    public void downLoad(HttpServletResponse response){

        response.setContentType("application/vnd.ms-excel;charset=gb2312");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition", "attachment;filename=");
        try {
//            从HttpServletResponse中获取OutputStream输出流
            ServletOutputStream outputStream = response.getOutputStream();
            EasyExcel.write(outputStream, PodowEntity.class).sheet("政策").doWrite(queryDataList());
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    @PostMapping("/queryDataList")
    public List<PodowEntity> queryDataList(){
        List<PodowEntity> result= policyService.queryDataList();
        return result;
    }


    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("policy:policy:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = policyService.queryPage(params);
        return R.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{pid}")
    @RequiresPermissions("policy:policy:info")
    public R info(@PathVariable("pid") Integer pid){
		PolicyEntity policy = policyService.getById(pid);

        return R.ok().put("policy", policy);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("policy:policy:save")
    public R save(@RequestBody PolicyEntity policy){
		policyService.save(policy);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("policy:policy:update")
    public R update(@RequestBody PolicyEntity policy){
		policyService.updateById(policy);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("policy:policy:delete")
    public R delete(@RequestBody Integer[] pids){
		policyService.removeByIds(Arrays.asList(pids));

        return R.ok();
    }

}
