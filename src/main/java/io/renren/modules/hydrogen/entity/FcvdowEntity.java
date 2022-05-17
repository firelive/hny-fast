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
 * @date 2022-03-16 16:12:36
 */
@Data
@TableName("fcv_vehicle")
public class FcvdowEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 序号
	 */
	@ExcelProperty(value = "序号",index = 0)
	@TableId
	private Integer fcid;
	/**
	 * 发布时间
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "发布时间",index = 1)
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date fcpublishedDate;
	/**
	 * 主机厂
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "主机厂",index = 2)
	private String companyName;
	/**
	 * 品牌
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "品牌",index = 3)
	private String brandName;
	/**
	 * 编号
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "编号",index = 4)
	private String vehicleCode;
	/**
	 * 车辆类型
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "车辆类型",index = 5)
	private String carType;
	/**
	 * 车辆长
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "车辆长",index = 6)
	private String carLength;
	/**
	 * 车辆宽
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "车辆宽",index = 7)
	private String width;
	/**
	 * 车辆高
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "车辆高",index = 8)
	private String high;
	/**
	 * 总质量
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "总质量",index = 9)
	private String totalWeight;
	/**
	 * 整备质量
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "整备质量",index = 10)
	private String vehicleMass;
	/**
	 * 最高车速
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "最高车速",index = 11)
	private String speed;
	/**
	 * 燃料种类
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "燃料种类",index = 12)
	private String fuelType;
	/**
	 * 续驶里程
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "续驶里程",index = 13)
	private String km;
	/**
	 * 燃料电池系统制造商
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "燃料电池系统制造商",index = 14)
	private String fuelcellProducer;
	/**
	 * 额定功率
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "额定功率",index = 15)
	private String ratedPower;
	/**
	 * 峰值功率
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "峰值功率",index = 16)
	private String peakPower;

}
