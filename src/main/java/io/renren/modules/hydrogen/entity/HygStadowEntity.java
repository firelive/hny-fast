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
 * @date 2022-03-24 18:39:51
 */
@Data
@TableName("hyg_station")
public class HygStadowEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 序号
	 */
	@TableId
	private Integer id;
	/**
	 * 省
	 */
	@ColumnWidth(10)
	@ExcelProperty(value = "省",index = 0)
	private String coProvince;
	/**
	 * 市
	 */
	@ColumnWidth(10)
	@ExcelProperty(value = "其他备注",index = 1)
	private  String coCity;
	/**
	 * 加氢站名称
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "加氢站名称",index = 2)
	private String stationName;
	/**
	 * 建成时间
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "建成时间",index = 3)
	@JsonFormat(pattern = "yyyy")
	private Date buildTime;
	/**
	 * 拆除时间
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "拆除时间",index = 4)
	@JsonFormat(pattern = "yyyy")
	private Date removeTime;
	/**
	 * 现状
	 */
	@ColumnWidth(20)
	@ExcelProperty(value = "现状",index = 5)
	private String stationStatus;
	/**
	 * 供给能力
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "供给能力",index =6)
	private String supply;
	/**
	 * 加氢机
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "加氢机",index = 7)
	private String dispenser;
	/**
	 * 压缩机
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "压缩机",index = 8)
	private String compressor;
	/**
	 * 储罐厂家
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "储罐厂家",index = 9)
	private String supplyer;
	/**
	 * 项目中标金额
	 */
	@ColumnWidth(10)
	@ExcelProperty(value = "项目中标金额",index = 10)
	private String amount;
	/**
	 * 运营
	 */
	@ColumnWidth(30)
	@ExcelProperty(value = "运营",index = 11)
	private String operation;
	/**
	 * 气体供应商
	 */
	@ColumnWidth(10)
	@ExcelProperty(value = "气体供应商",index = 12)
	private String gasSupply;
	/**
	 * 加氢站等级
	 */
	@ColumnWidth(10)
	@ExcelProperty(value = "加氢站等级",index = 13)
	private String stationLevel;
	/**
	 * 加氢站类别
	 */
	@ColumnWidth(10)
	@ExcelProperty(value = "加氢站类别",index = 14)
	private String stationType;
	/**
	 * 投资额（万元）
	 */
	@ColumnWidth(10)
	@ExcelProperty(value = "投资额（万元）",index = 15)
	private String invested;
	/**
	 * 占地面积（m2）
	 */
	@ColumnWidth(10)
	@ExcelProperty(value = "占地面积（m2）",index = 16)
	private String square;
	/**
	 * 储氢量
	 */
	@ColumnWidth(10)
	@ExcelProperty(value = "储氢量",index = 17)
	private String storageCapacity;
	/**
	 * 固定：储氢罐
	 */
	@ColumnWidth(10)
	@ExcelProperty(value = "固定：储氢罐",index = 18)
	private String stay;
	/**
	 * 移动：长管拖车
	 */
	@ColumnWidth(10)
	@ExcelProperty(value = "移动：长管拖车",index = 19)
	private String move;
	/**
	 * 储氢量
	 */
	@ColumnWidth(10)
	@ExcelProperty(value = "储氢量",index = 20)
	private String totalStorage;
	/**
	 * 承建
	 */
	@ColumnWidth(10)
	@ExcelProperty(value = "承建",index = 21)
	private String build;
}
