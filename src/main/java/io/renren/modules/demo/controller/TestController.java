package io.renren.modules.demo.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.util.DateUtils;
import io.renren.modules.demo.entity.WorkerDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class TestController {

    @GetMapping("/excel")
    public void excel(HttpServletResponse response) {
        try {
            response.setContentType("application/vnd.ms-excel");
            response.setCharacterEncoding("utf-8");
            String fileName = URLEncoder.encode(String.format("%s测试.", DateUtils.format(new Date(), "yyyy-MM-dd")), "UTF-8");
            response.setHeader("Content-Disposition", "attachment; filename=" + fileName + ExcelTypeEnum.XLSX);
            response.setHeader("Access-Control-Expose-Headers", "Content-Disposition");
            EasyExcel.write(response.getOutputStream(), WorkerDTO.class).sheet("测试").doWrite(data());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 初始化数据
     */
    private List<WorkerDTO> data() {
        List<WorkerDTO> list = new ArrayList<>();
        list.add(new WorkerDTO().setQualifications(1).setAge(27).setName("test1").setBirthday(new Date()).setOther("other"));
        list.add(new WorkerDTO().setQualifications(2).setAge(27).setName("test2").setOther("other"));
        list.add(new WorkerDTO().setQualifications(2).setAge(27).setName("test3"));
        list.add(new WorkerDTO().setQualifications(3).setAge(27).setName("test4"));
        list.add(new WorkerDTO().setQualifications(null).setAge(27).setName("test5"));
        list.add(new WorkerDTO().setQualifications(4).setAge(27).setName("test6"));
        return list;
    }
}