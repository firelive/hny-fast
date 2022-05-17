package io.renren.modules.policy.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
 * 
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-14 11:52:06
 */
@Data
@TableName("policy")
public class PolicyEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 序号
	 */
	@TableId
	private Integer pid;
	/**
	 * 政策类型
	 */
	private String policyType;
	/**
	 * 发布时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date policyDate;
	/**
	 * 政策名称
	 */
	private String policyName;
	/**
	 * 发布部门
	 */
	private String departmentName;
	/**
	 * 政策文号
	 */
	private String policyCode;
	/**
	 * 政策链接
	 */
	private String policyLink;
	/**
	 * 主要内容
	 */
	private String infoContent;

	/**
	 * 逻辑删除
	 */
	@TableLogic
	@TableField(fill = FieldFill.INSERT)
	private  Integer deleted;

}
