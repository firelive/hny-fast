package io.renren.modules.bzzl.entity;

import com.alibaba.excel.annotation.ExcelProperty;
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
 * @date 2022-02-24 16:39:25
 */
@Data
@TableName("standard")
public class StanddowEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ExcelProperty(value = "序号",index = 0)
	private Integer id;

	/**
	 * 所属领域
	 */
	@ExcelProperty(value = "所属领域",index = 1)
	private String standArea;
	/**
	 * 标准名称
	 */
	@ExcelProperty(value = "标准名称",index = 2)
	private String standName;
	/**
	 * 标准号
	 */
	@ExcelProperty(value = "标准号",index = 3)
	private String standCode;
	/**
	 * 标准类型
	 */
	@ExcelProperty(value = "标准类型",index = 4)
	private String standType;
	/**
	 * 标准发布时间
	 */
	@ExcelProperty(value = "标准发布时间",index = 5)
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date standDate;
	/**
	 * 主编单位
	 */
	@ExcelProperty(value = "主编单位",index = 6)
	private String standUnit;
	/**
	 * 全文链接
	 */
	@ExcelProperty(value = "全文链接",index = 7)
	private String link;
	/**
	 * 其他
	 */
	@ExcelProperty(value = "其他内容",index = 8)
	private String otherInfo;
}
