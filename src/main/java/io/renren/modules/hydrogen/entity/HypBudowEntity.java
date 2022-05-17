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
 * @date 2022-03-17 17:53:26
 */
@Data
@TableName("hyp_butie")
public class HypBudowEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ExcelProperty(value = "序号",index = 0)
	private Integer btid;
	/**
	 * 发布机构
	 */
	@ColumnWidth(20)
	@ExcelProperty(value = "发布机构",index = 1)
	private String pubulishDepartment;
	/**
	 * 文件名称
	 */
	@ColumnWidth(20)
	@ExcelProperty(value = "文件名称",index = 2)
	private String documentName;
	/**
	 * 文件发布时间
	 */
	@ColumnWidth(20)
	@ExcelProperty(value = "文件发布时间",index = 3)
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date publishedDate;
	/**
	 * 文号
	 */
	@ColumnWidth(20)
	@ExcelProperty(value = "文号",index = 4)
	private String documentCode;
	/**
	 * 链接
	 */
	@ColumnWidth(20)
	@ExcelProperty(value = "链接",index = 5)
	private String documentLink;
	/**
	 * 补贴内容
	 */
	@ColumnWidth(20)
	@ExcelProperty(value = "补贴内容",index = 6)
	private String butieContent;
	/**
	 * 文件有效期限
	 */
	@ColumnWidth(20)
	@ExcelProperty(value = "文件有效期限",index = 7)
	private String timeline;
	/**
	 * 其他补充
	 */
	@ColumnWidth(10)
	@ExcelProperty(value = "其他补充",index = 8)
	private String otherInfo;
}
