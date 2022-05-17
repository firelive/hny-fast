package io.renren.common.district.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.renren.modules.company.entity.CompanyEntity;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("china_district")
public class District implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 序号
     */
    @TableId("china_id")
    private Integer chinaId;
    /**
     * 父类代码
     */
    private String parent;
    /**
     * 邮政码
     */
    private String code;
    /**
     * 地区名称
     */
    private String name;
    /**
     * 企业ID
     */
    @TableId("companyQuery_id")
    private Integer companyId;


    @TableField(exist = false)
    private CompanyEntity companyEntity;

}
