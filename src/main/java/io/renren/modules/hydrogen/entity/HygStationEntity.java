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
 * @date 2022-03-24 18:39:51
 */
@Data
@TableName("hyg_station")
public class HygStationEntity implements Serializable {
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
	 * 省
	 */
	private  String coCity;
	/**
	 * 加氢站名称
	 */
	private String stationName;
	/**
	 * 建成时间
	 */
	@JsonFormat(pattern = "yyyy")
	private Date buildTime;
	/**
	 * 拆除时间
	 */
	@JsonFormat(pattern = "yyyy")
	private Date removeTime;
	/**
	 * 现状
	 */
	private String stationStatus;
	/**
	 * 供给能力
	 */
	private String supply;
	/**
	 * 加氢机
	 */
	private String dispenser;
	/**
	 * 压缩机
	 */
	private String compressor;
	/**
	 * 储罐厂家
	 */
	private String supplyer;
	/**
	 * 项目中标金额
	 */
	private String amount;
	/**
	 * 运营
	 */
	private String operation;
	/**
	 * 气体供应商
	 */
	private String gasSupply;
	/**
	 * 加氢站等级
	 */
	private String stationLevel;
	/**
	 * 加氢站类别
	 */
	private String stationType;
	/**
	 * 投资额（万元）
	 */
	private String invested;
	/**
	 * 占地面积（m2）
	 */
	private String square;
	/**
	 * 储氢量
	 */
	private String storageCapacity;
	/**
	 * 固定：储氢罐
	 */
	private String stay;
	/**
	 * 移动：长管拖车
	 */
	private String move;
	/**
	 * 储氢量
	 */
	private String totalStorage;
	/**
	 * 承建
	 */
	private String build;
	/**
	 * 逻辑删除
	 */
	@TableLogic
	@TableField(fill = FieldFill.INSERT)
	private  Integer deleted;
}
