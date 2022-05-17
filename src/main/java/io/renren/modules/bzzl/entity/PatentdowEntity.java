package io.renren.modules.bzzl.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("patent")
@HeadRowHeight(value = 20)
public class PatentdowEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 表格ID
	 */
	@TableId
	@ColumnWidth(10)
	@ExcelProperty(value = "序号",index = 0)
	private Integer id;

	/**
	 * 所属领域
	 */
	@ColumnWidth(20)
	@ExcelProperty(value = "所属领域",index = 1)
	private String patentArea;
	/**
	 * 专利名称
	 */
	@ExcelProperty(value = "专利名称",index = 2)
	private String patentName;
	/**
	 * 专利号
	 */
	@ColumnWidth(20)
	@ExcelProperty(value = "专利号",index = 3)
	private String patentCode;
	/**
	 * 专利类型
	 */
	@ColumnWidth(20)
	@ExcelProperty(value = "专利类型",index = 4)
	private String patentType;
	/**
	 * 专利单位
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "专利单位",index = 5)
	private String patentUnit;
	/**
	 * 其它信息
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "其它信息",index = 6)
	private String otherInfo;

}
