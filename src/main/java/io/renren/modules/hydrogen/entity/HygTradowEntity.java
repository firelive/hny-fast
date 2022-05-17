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
 * @date 2022-03-24 18:39:11
 */
@Data
@TableName("hyg_trans")
public class HygTradowEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 序号
	 */
	@TableId
	@ExcelProperty(value = "序号",index = 0)
	private Integer trid;
	/**
	 * 国内外
	 */
	@ColumnWidth(10)
	@ExcelProperty(value = "国内外",index = 1)
	private String area;
	/**
	 * 方式
	 */
	@ColumnWidth(10)
	@ExcelProperty(value = "方式",index = 2)
	private String method;
	/**
	 * 技术路线
	 */
	@ColumnWidth(20)
	@ExcelProperty(value = "技术路线",index = 3)
	private String techType;
	/**
	 * 技术水平
	 */
	@ColumnWidth(20)
	@ExcelProperty(value = "技术水平",index = 4)
	private String techLevel;
	/**
	 * 优/劣势
	 */
	@ColumnWidth(20)
	@ExcelProperty(value = "优/劣势",index = 5)
	private String gorb;
	/**
	 * 成本情况
	 */
	@ColumnWidth(20)
	@ExcelProperty(value = "成本情况",index = 6)
	private String amount;
	/**
	 * 产能情况
	 */
	@ColumnWidth(20)
	@ExcelProperty(value = "产能情况",index = 7)
	private String productivity;
	/**
	 * 代表企业
	 */
	@ColumnWidth(20)
	@ExcelProperty(value = "代表企业",index = 8)
	private String company;
	/**
	 * 产品
	 */
	@ColumnWidth(20)
	@ExcelProperty(value = "产品",index = 9)
	private String product;
	/**
	 * 相应技术水平
	 */
	@ColumnWidth(20)
	@ExcelProperty(value = "相应技术水平",index = 10)
	private String comLevel;
	/**
	 * 产能
	 */
	@ColumnWidth(20)
	@ExcelProperty(value = "产能",index = 11)
	private String capacity;
	/**
	 * 布局情况
	 */
	@ColumnWidth(20)
	@ExcelProperty(value = "布局情况",index = 12)
	private String statusCheck;
}
