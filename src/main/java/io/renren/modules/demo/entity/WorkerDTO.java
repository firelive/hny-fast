package io.renren.modules.demo.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import io.renren.modules.demo.Converter.QualificationsConverter;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class WorkerDTO {
    @ExcelProperty(value = "姓名", index = 0)
    private String name = "nobody";
    @ExcelProperty(value = "年龄", index = 1)
    private Integer age;
    @ExcelProperty(value = "生日", index = 2)
    @DateTimeFormat(value = "yyyy-MM-dd")
    private Date birthday;
    /**
     * 1-大专，2-本科，3-硕士，4-博士
     */
    @ExcelProperty(value = "学历", index = 3, converter = QualificationsConverter.class)
    private Integer qualifications = 1;
    @ExcelIgnore
    private String other;
}

