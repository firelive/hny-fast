package io.renren.modules.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;


@Data
@TableName("runoob_tbl")
public class NoobDemoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId
    private Integer runoobId;

    private String runoobTitle;

    private String runoobAuthor;

    private String cityName;

    private String cityCode;

    private String Area;

    private String companyName;

    private String testName;

    private Integer Deleted;

}
