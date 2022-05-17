package io.renren.modules.company.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;

/**
 *
 *
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-16 10:01:58
 */
@Data
@TableName("company")
public class CompanydowEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 序号
     */
    @ColumnWidth(10)
    @ExcelProperty(value = "序号",index = 0)
    @TableId
    private Integer companyId;
    /**
     * 企业名称
     */
    @ColumnWidth(30)
    @ExcelProperty(value = "企业名称",index = 1)
    private String compName;
    /**
     * 布局简介
     */
    @ColumnWidth(30)
    @ExcelProperty(value = "布局简介",index = 2)
    private String projectInfo;
    /**
     * 实施主体
     */
    @ColumnWidth(30)
    @ExcelProperty(value = "实施主体",index = 3)
    private String subjectImpl;
    /**
     * 氢能相关项目布局情况
     */
    @ColumnWidth(30)
    @ExcelProperty(value = "氢能相关项目布局情况",index = 4)
    private String hygLayout;
    /**
     * 实施内容
     */
    @ColumnWidth(30)
    @ExcelProperty(value = "实施内容",index = 5)
    private String subjectContent;

}
