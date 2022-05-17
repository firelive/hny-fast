package io.renren.modules.hydrogen.entity;


import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("hyg_property")
public class HygProperty implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId
    private Integer id;
    /**
     * 国内外
     */
    private String pArea;
    /**
     * 制氢方式
     */
    private String maMethod;
    /**
     * 运输方式
     */
    private String trMethod;
    /**
     * 制氢类型
     */
    private String maType;
    /**
     * 运氢类型
     */
    private String trType;
    /**
     * 企业类型
     */
    private String compType;
    /**
     * 站点状态
     */
    private String saStatus;


    private String saType;
    /**
     * 逻辑删除
     */
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private  Integer deleted;

}
