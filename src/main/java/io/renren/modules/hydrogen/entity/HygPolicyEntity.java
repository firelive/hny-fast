package io.renren.modules.hydrogen.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * 
 * 
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-16 14:59:47
 */
@Data
@TableName("hyg_policy")
public class HygPolicyEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 序号
	 */
	@TableId
	private Integer hpid;
	/**
	 * 发布时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date publishedDate;
	/**
	 * 政策名称
	 */
	private String hypolicyName;
	/**
	 * 发布部门
	 */
	private String departmentName;
	/**
	 * 文件号
	 */
	private String hypolicyCode;
	/**
	 * 氢能相关内容
	 */
	private String hypInfo;
	/**
	 * 政策链接
	 */
	private String hypolicyLink;
	/**
	 * 其他备注
	 */
	private String otherInfo;
	/**
	 * 逻辑删除
	 */
	@TableLogic
	@TableField(fill = FieldFill.INSERT)
	private  Integer deleted;
}
