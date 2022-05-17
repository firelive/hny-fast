package io.renren.modules.hydrogen.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.alibaba.excel.EasyExcel;
import io.renren.modules.hydrogen.entity.HygTradowEntity;
import io.renren.modules.hydrogen.entity.HypBudowEntity;
import lombok.SneakyThrows;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.renren.modules.hydrogen.entity.HypButieEntity;
import io.renren.modules.hydrogen.service.HypButieService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;


/**
 * 
 *
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-17 17:53:26
 */
@RestController
@RequestMapping("hydrogen/hypbutie")
public class HypButieController {
    @Autowired
    private HypButieService hypButieService;

    @SneakyThrows
    @GetMapping("/hygbuExcel")
    public void downLoad(HttpServletResponse response){

        response.setContentType("application/vnd.ms-excel;charset=gb2312");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition", "attachment;filename=");
        try {
//            从HttpServletResponse中获取OutputStream输出流
            ServletOutputStream outputStream = response.getOutputStream();
            EasyExcel.write(outputStream, HypBudowEntity.class).sheet("政策补贴").doWrite(queryDataList());
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    @PostMapping("/queryDataList")
    public List<HypBudowEntity> queryDataList(){
        List<HypBudowEntity> result= hypButieService.queryDataList();
        return result;
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("hydrogen:hypbutie:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = hypButieService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{btid}")
    @RequiresPermissions("hydrogen:hypbutie:info")
    public R info(@PathVariable("btid") Integer btid){
		HypButieEntity hypButie = hypButieService.getById(btid);

        return R.ok().put("hypButie", hypButie);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("hydrogen:hypbutie:save")
    public R save(@RequestBody HypButieEntity hypButie){
		hypButieService.save(hypButie);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("hydrogen:hypbutie:update")
    public R update(@RequestBody HypButieEntity hypButie){
		hypButieService.updateById(hypButie);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("hydrogen:hypbutie:delete")
    public R delete(@RequestBody Integer[] btids){
		hypButieService.removeByIds(Arrays.asList(btids));

        return R.ok();
    }

}
