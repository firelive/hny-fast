package io.renren.modules.bzzl.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("sp_area")
public class Area implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId
    private Integer spid;

    private String area;


}
