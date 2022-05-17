package io.renren.modules.company.entity;

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
 * @date 2022-03-16 11:34:31
 */
@Data
@TableName("pr_company")
public class PrCompanyEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 企业地址
	 */
	private String prcompanyLocation;
	/**
	 * 企业名称
	 */
	private String prcompanyName;
	/**
	 * 主营业务
	 */
	private String business;
	/**
	 * 主要项目
	 */
	private String mainProject;
	/**
	 * 年份
	 */
	@JsonFormat(pattern = "yyyy")
	private Date projectDate;
	/**
	 * 项目地址
	 */
	private String projectSite;
	/**
	 * 实施内容
	 */
	private String projectContent;
	/**
	 * 技术指标情况
	 */
	private String techStatus;
	/**
	 * 逻辑删除
	 */
	@TableLogic
	@TableField(fill = FieldFill.INSERT)
	private  Integer deleted;
}
