package io.renren.modules.company.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-16 11:34:31
 */
@Data
@TableName("pr_company")
public class PrdowEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@ColumnWidth(10)
	@ExcelProperty(value = "id",index = 0)
	@TableId
	private Integer id;
	/**
	 * 企业地址
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "企业地址",index = 1)
	private String prcompanyLocation;
	/**
	 * 企业名称
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "企业名称",index = 2)
	private String prcompanyName;
	/**
	 * 主营业务
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "主营业务",index = 3)
	private String business;
	/**
	 * 主要项目
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "主要项目",index = 4)
	private String mainProject;
	/**
	 * 年份
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "年份",index = 5)
	@JsonFormat(pattern = "yyyy")
	private Date projectDate;
	/**
	 * 项目地址
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "项目地址",index = 6)
	private String projectSite;
	/**
	 * 实施内容
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "实施内容",index = 7)
	private String projectContent;
	/**
	 * 技术指标情况
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "技术指标情况",index = 8)
	private String techStatus;
}
