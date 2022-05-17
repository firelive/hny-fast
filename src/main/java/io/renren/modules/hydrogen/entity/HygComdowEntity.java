package io.renren.modules.hydrogen.entity;

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
 * @date 2022-03-23 17:11:29
 */
@Data
@TableName("hyg_components")
public class HygComdowEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 序号
	 */
	@ExcelProperty(value = "序号",index = 0)
	@TableId
	private Integer id;
	/**
	 * 省
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "省",index = 1)
	private String coProvince;
	/**
	 * 城市
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "城市",index = 2)
	private String coCity;
	/**
	 * 企业代表
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "企业代表",index = 3)
	private String enterprise;
	/**
	 * 企业类型
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "企业类型",index = 4)
	private String enterpriseType;
	/**
	 * 技术水平
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "技术水平",index = 5)
	private String techLevel;
	/**
	 * 部分项目/产品产能情况
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "部分项目/产品产能情况",index = 6)
	private String projectStatus;
	/**
	 * 功率
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "功率",index = 7)
	private String kw;
	/**
	 * 质量功率密度
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "质量功率密度",index = 8)
	private String mass;
	/**
	 * 体积功率密度
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "体积功率密度",index = 9)
	private String volume;
	/**
	 * 成本售价
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "成本售价",index = 10)
	private String customer;
	/**
	 * 相关客户
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "相关客户",index = 11)
	private String costsSales;
	/**
	 * 冷启动温度
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "冷启动温度",index = 12)
	private String temperature;
	/**
	 * 相关客户
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "相关客户",index = 13)
	private String lifespan;
}
