package io.renren.modules.hydrogen.entity;

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
 * @date 2022-03-22 20:12:19
 */
@Data
@TableName("hyg_detsec")
public class HygDetdowEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 序号
	 */
	@ExcelProperty(value = "序号",index = 0)
	@TableId
	private Integer dsid;
	/**
	 * 所属地区
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "所属地区",index = 1)
	private String location;
	/**
	 * 国内外
	 */
	@ExcelProperty(value = "国内外",index = 2)
	private String area;
	/**
	 * 项目平台
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "项目平台",index = 3)
	private String projectPlatform;
	/**
	 * 投资主体
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "投资主体",index = 4)
	private String investmentSub;
	/**
	 * 启动时间
	 */
	@ColumnWidth(20)
	@ExcelProperty(value = "启动时间",index = 5)
	@JsonFormat(pattern = "yyyy")
	private Date startDate;
	/**
	 * 检测内容
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "检测内容",index = 6)
	private String testContent;
	/**
	 * 资质情况
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "资质情况",index = 7)
	private String quality;
	/**
	 * 相关客户
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "相关客户",index = 8)
	private String customer;
}
