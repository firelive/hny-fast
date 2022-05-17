package io.renren.modules.policy.entity;

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
 * @date 2022-03-14 11:52:06
 */
@Data
@TableName("policy")
public class PodowEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 序号
	 */
	@TableId
	@ExcelProperty(value = "序号",index = 0)
	private Integer pid;
	/**
	 * 政策类型
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "政策类型",index = 1)
	private String policyType;
	/**
	 * 发布时间
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "发布时间",index = 2)
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date policyDate;
	/**
	 * 政策名称
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "政策名称",index = 3)
	private String policyName;
	/**
	 * 发布部门
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "发布部门",index = 4)
	private String departmentName;
	/**
	 * 政策文号
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "政策文号",index = 5)
	private String policyCode;
	/**
	 * 政策链接
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "政策链接",index = 6)
	private String policyLink;
	/**
	 * 主要内容
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "主要内容",index = 7)
	private String infoContent;

}
