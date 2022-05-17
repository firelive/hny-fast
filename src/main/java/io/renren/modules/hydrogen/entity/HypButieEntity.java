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
 * @date 2022-03-17 17:53:26
 */
@Data
@TableName("hyp_butie")
public class HypButieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer btid;
	/**
	 * 发布机构
	 */
	private String pubulishDepartment;
	/**
	 * 文件名称
	 */
	private String documentName;
	/**
	 * 文件发布时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date publishedDate;
	/**
	 * 文号
	 */
	private String documentCode;
	/**
	 * 链接
	 */
	private String documentLink;
	/**
	 * 补贴内容
	 */
	private String butieContent;
	/**
	 * 文件有效期限
	 */
	private String timeline;
	/**
	 * 其他补充
	 */
	private String otherInfo;
	/**
	 * 逻辑删除
	 */
	@TableLogic
	@TableField(fill = FieldFill.INSERT)
	private  Integer deleted;
}
