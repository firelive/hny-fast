package io.renren.modules.bzzl.service;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.style.WriteCellStyle;
import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.bzzl.entity.Area;
import io.renren.modules.bzzl.entity.PatentEntity;
import io.renren.modules.bzzl.entity.PatentdowEntity;
import lombok.SneakyThrows;
import org.apache.poi.ss.usermodel.HorizontalAlignment;

import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Result;
import java.io.IOException;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-02-24 16:39:25
 */
public interface PatentService extends IService<PatentEntity> {

    PageUtils queryPage(Map<String, Object> params);
    List<PatentdowEntity> queryDataList();


}

