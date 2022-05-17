package io.renren.modules.company.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 *
 *
 * @author Huang
 * @email 779392333@qq.com
 * @date 2022-03-16 10:01:58
 */
@Data
@TableName("company")
public class CompanyEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 序号
     */
    @TableId
    private Integer companyId;
    /**
     * 企业名称
     */
    private String compName;
    /**
     * 布局简介
     */
    private String projectInfo;
    /**
     * 实施主体
     */
    private String subjectImpl;
    /**
     * 氢能相关项目布局情况
     */
    private String hygLayout;
    /**
     * 实施内容
     */
    private String subjectContent;
    /**
     * 逻辑删除
     */
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private  Integer deleted;
}
