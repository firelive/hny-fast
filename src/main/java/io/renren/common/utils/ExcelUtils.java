package io.renren.common.utils;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.support.ExcelTypeEnum;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * excel导出
 * @param response http响应对象
 * @param list 导出的list内容数据
 * @param clazz 导出的类型
 * @param fileNamePre 文件名（不含后缀）
 * @param sheetName sheet名
 * @throws IOException IO异常
 */



public class ExcelUtils {
    public static void exportExcel(HttpServletResponse response, List list, Class clazz, String fileNamePre, String sheetName) throws IOException, IOException {
        // 导出时候会出现中文无法识别问题，需要转码
        String fileName = new String(fileNamePre.getBytes("gb2312"), "ISO8859-1");
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-Disposition", "attachment;filename=" + fileName + ExcelTypeEnum.XLSX.getValue());
        // 调用工具类
        EasyExcel.write(response.getOutputStream(), clazz)
                .sheet(sheetName)
                .doWrite(list);
    }
}