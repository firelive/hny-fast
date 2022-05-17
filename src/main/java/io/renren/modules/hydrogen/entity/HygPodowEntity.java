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
 * @date 2022-03-16 14:59:47
 */
@Data
@TableName("hyg_policy")
public class HygPodowEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 序号
	 */
	@ExcelProperty(value = "序号",index = 0)
	@TableId
	private Integer hpid;
	/**
	 * 发布时间
	 */
	@ColumnWidth(10)
	@ExcelProperty(value = "布局情况",index = 1)
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date publishedDate;
	/**
	 * 政策名称
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "政策名称",index = 2)
	private String hypolicyName;
	/**
	 * 发布部门
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "发布部门",index = 3)
	private String departmentName;
	/**
	 * 文件号
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "文件号",index = 4)
	private String hypolicyCode;
	/**
	 * 氢能相关内容
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "氢能相关内容",index = 5)
	private String hypInfo;
	/**
	 * 政策链接
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "政策链接",index = 6)
	private String hypolicyLink;
	/**
	 * 其他备注
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "其他备注",index = 7)
	private String otherInfo;
}
