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
 * @date 2022-03-24 18:39:11
 */
@Data
@TableName("hyg_trans")
public class HygTransEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 序号
	 */
	@TableId
	private Integer trid;
	/**
	 * 国内外
	 */
	private String area;
	/**
	 * 方式
	 */
	private String method;
	/**
	 * 技术路线
	 */
	private String techType;
	/**
	 * 技术水平
	 */
	private String techLevel;
	/**
	 * 优/劣势
	 */
	private String gorb;
	/**
	 * 成本情况
	 */
	private String amount;
	/**
	 * 产能情况
	 */
	private String productivity;
	/**
	 * 代表企业
	 */
	private String company;
	/**
	 * 产品
	 */
	private String product;
	/**
	 * 相应技术水平
	 */
	private String comLevel;
	/**
	 * 产能
	 */
	private String capacity;
	/**
	 * 布局情况
	 */
	private String statusCheck;
	/**
	 * 逻辑删除
	 */
	@TableLogic
	@TableField(fill = FieldFill.INSERT)
	private  Integer deleted;
}
