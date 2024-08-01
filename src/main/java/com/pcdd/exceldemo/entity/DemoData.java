package com.pcdd.exceldemo.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class DemoData {

    @ExcelProperty("名称")
    private String name;

    @ExcelProperty("数量")
    private int number;

    @ExcelProperty("单价")
    private double price;

    @ExcelProperty("合计")
    private double total;

}