package com.pcdd.exceldemo;

import com.pcdd.exceldemo.easyexcel.SimpleExcel;
import com.pcdd.exceldemo.util.MyUtils;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class EasyExcelTest {

    @Test
    void read() {
        SimpleExcel.read("easyexcel.xlsx");
    }

    @Test
    void write() {
        SimpleExcel.write("easyexcel.xlsx", MyUtils.mock());
    }

    @Test
    void fillByObj() {
        SimpleExcel.fillByObj("easyexcel.xlsx", MyUtils.mock().getFirst());
    }

    @Test
    void fillByMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "张三");
        map.put("number", 5.2);
        SimpleExcel.fillByMap("easyexcel.xlsx", map);
    }

}