package io.renren.modules.hydrogen.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.alibaba.excel.EasyExcel;
import io.renren.modules.hydrogen.entity.FcvdowEntity;
import io.renren.modules.policy.entity.PodowEntity;
import lombok.SneakyThrows;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.renren.modules.hydrogen.entity.FcvVehicleEntity;
import io.renren.modules.hydrogen.service.FcvVehicleService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;


/**
 * 
 *
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-16 16:12:36
 */
@RestController
@RequestMapping("hydrogen/fcvvehicle")
public class FcvVehicleController {
    @Autowired
    private FcvVehicleService fcvVehicleService;

    @SneakyThrows
    @GetMapping("/fcvExcel")
    public void downLoad(HttpServletResponse response){

        response.setContentType("application/vnd.ms-excel;charset=gb2312");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition", "attachment;filename=");
        try {
//            从HttpServletResponse中获取OutputStream输出流
            ServletOutputStream outputStream = response.getOutputStream();
            EasyExcel.write(outputStream, FcvdowEntity.class).sheet("FCV车辆").doWrite(queryDataList());
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    @PostMapping("/queryDataList")
    public List<FcvdowEntity> queryDataList(){
        List<FcvdowEntity> result= fcvVehicleService.queryDataList();
        return result;
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("hydrogen:fcvvehicle:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = fcvVehicleService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{fcid}")
    @RequiresPermissions("hydrogen:fcvvehicle:info")
    public R info(@PathVariable("fcid") Integer fcid){
		FcvVehicleEntity fcvVehicle = fcvVehicleService.getById(fcid);

        return R.ok().put("fcvVehicle", fcvVehicle);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("hydrogen:fcvvehicle:save")
    public R save(@RequestBody FcvVehicleEntity fcvVehicle){
		fcvVehicleService.save(fcvVehicle);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("hydrogen:fcvvehicle:update")
    public R update(@RequestBody FcvVehicleEntity fcvVehicle){
		fcvVehicleService.updateById(fcvVehicle);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("hydrogen:fcvvehicle:delete")
    public R delete(@RequestBody Integer[] fcids){
		fcvVehicleService.removeByIds(Arrays.asList(fcids));

        return R.ok();
    }

}
