package io.renren.modules.demo.Converter;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

public class QualificationsConverter implements Converter<Integer> {
    @Override
    public Class supportJavaTypeKey() {
        return Integer.class;
    }

    @Override
    public CellDataTypeEnum supportExcelTypeKey() {
        return CellDataTypeEnum.STRING;
    }

    @Override
    public Integer convertToJavaData(CellData cellData, ExcelContentProperty contentProperty, GlobalConfiguration globalConfiguration) throws Exception {
        int value = -1;
        switch (cellData.getStringValue()) {
            case "大专":
                value = 1;
                break;
            case "本科":
                value = 2;
                break;
            case "硕士":
                value = 3;
                break;
            case "博士":
                value = 4;
                break;
            default:
        }
        return value;
    }

    /**
     * 文件下载主要需要实现该方法
     */
    @Override
    public CellData convertToExcelData(Integer value, ExcelContentProperty contentProperty, GlobalConfiguration globalConfiguration) throws Exception {
        String s = "";
        switch (value) {
            case 1:
                s = "大专";
                break;
            case 2:
                s = "本科";
                break;
            case 3:
                s = "硕士";
                break;
            case 4:
                s = "博士";
                break;
            default:
        }
        return new CellData(s);
    }
}
