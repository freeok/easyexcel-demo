package com.pcdd.exceldemo.easyexcel;

import com.alibaba.excel.EasyExcel;
import com.pcdd.exceldemo.entity.DemoData;

import java.util.Collection;
import java.util.Map;

/**
 * @author pcdd
 * <p>
 * <a href="https://easyexcel.opensource.alibaba.com/">Easy Excel 官网</a>
 */
public class SimpleExcel {

    public static void read(String path) {
        // 在监听器中处理读取到的数据
        EasyExcel.read(path, DemoData.class, new DemoDataListener())
                .sheet()
                .doRead();
    }

    public static void write(String path, Collection<DemoData> data) {
        EasyExcel.write(path, DemoData.class)
                .sheet("模板")
                .doWrite(data);
    }

    public static void fillByObj(String path, DemoData data) {
        // 模板注意 用{}来表示你要用的变量 如果本来就有"{","}" 特殊字符 用"\{","\}"代替
        String templateFileName = ClassLoader.getSystemResource("template.xlsx").getPath();
        EasyExcel.write(path)
                .withTemplate(templateFileName)
                .sheet()
                .doFill(data);
    }

    public static void fillByMap(String path, Map<String, Object> map) {
        String templateFileName = ClassLoader.getSystemResource("template.xlsx").getPath();
        EasyExcel.write(path)
                .withTemplate(templateFileName)
                .sheet()
                .doFill(map);
    }

}