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
 * @date 2022-03-16 16:12:36
 */
@Data
@TableName("fcv_vehicle")
public class FcvVehicleEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 序号
	 */
	@TableId
	private Integer fcid;
	/**
	 * 发布时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date fcpublishedDate;
	/**
	 * 主机厂
	 */
	private String companyName;
	/**
	 * 品牌
	 */
	private String brandName;
	/**
	 * 编号
	 */
	private String vehicleCode;
	/**
	 * 车辆类型
	 */
	private String carType;
	/**
	 * 车辆长
	 */
	private String carLength;
	/**
	 * 车辆宽
	 */
	private String width;
	/**
	 * 车辆高
	 */
	private String high;
	/**
	 * 总质量
	 */
	private String totalWeight;
	/**
	 * 整备质量
	 */
	private String vehicleMass;
	/**
	 * 最高车速
	 */
	private String speed;
	/**
	 * 燃料种类
	 */
	private String fuelType;
	/**
	 * 续驶里程
	 */
	private String km;
	/**
	 * 燃料电池系统制造商
	 */
	private String fuelcellProducer;
	/**
	 * 额定功率
	 */
	private String ratedPower;
	/**
	 * 峰值功率
	 */
	private String peakPower;
	/**
	 * 逻辑删除
	 */
	@TableLogic
	@TableField(fill = FieldFill.INSERT)
	private  Integer deleted;
}
