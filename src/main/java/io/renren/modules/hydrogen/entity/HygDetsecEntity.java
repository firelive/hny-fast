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
 * @date 2022-03-22 20:12:19
 */
@Data
@TableName("hyg_detsec")
public class HygDetsecEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 序号
	 */
	@TableId
	private Integer dsid;
	/**
	 * 所属地区
	 */
	private String location;
	/**
	 * 国内外
	 */
	private String area;
	/**
	 * 项目平台
	 */
	private String projectPlatform;
	/**
	 * 投资主体
	 */
	private String investmentSub;
	/**
	 * 启动时间
	 */
	@JsonFormat(pattern = "yyyy")
	private Date startDate;
	/**
	 * 检测内容
	 */
	private String testContent;
	/**
	 * 资质情况
	 */
	private String quality;
	/**
	 * 相关客户
	 */
	private String customer;
	/**
	 * 逻辑删除
	 */
	@TableLogic
	@TableField(fill = FieldFill.INSERT)
	private  Integer deleted;
}
