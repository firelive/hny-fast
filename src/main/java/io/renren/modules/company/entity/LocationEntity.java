package io.renren.modules.company.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("china_district")
public class LocationEntity extends CompanyEntity{
    private static final long serialVersionUID = 1L;

    /**
     * 序号
     */
    @TableId
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

}
