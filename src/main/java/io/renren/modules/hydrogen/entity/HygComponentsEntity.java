package io.renren.modules.hydrogen.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-23 17:11:29
 */
@Data
@TableName("hyg_components")
public class HygComponentsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 序号
	 */
	@TableId
	private Integer id;
	/**
	 * 省
	 */
	private String coProvince;
	/**
	 * 城市
	 */
	private String coCity;
	/**
	 * 企业代表
	 */
	private String enterprise;
	/**
	 * 企业类型
	 */
	private String enterpriseType;
	/**
	 * 技术水平
	 */
	private String techLevel;
	/**
	 * 部分项目/产品产能情况
	 */
	private String projectStatus;
	/**
	 * 功率
	 */
	private String kw;
	/**
	 * 质量功率密度
	 */
	private String mass;
	/**
	 * 体积功率密度
	 */
	private String volume;
	/**
	 * 成本售价
	 */
	private String customer;
	/**
	 * 相关客户
	 */
	private String costsSales;
	/**
	 * 冷启动温度
	 */
	private String temperature;
	/**
	 * 相关客户
	 */
	private String lifespan;
	/**
	 * 逻辑删除
	 */
	@TableLogic
	@TableField(fill = FieldFill.INSERT)
	private  Integer deleted;
}
