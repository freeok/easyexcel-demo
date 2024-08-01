package com.pcdd.exceldemo.hutool;

import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import com.pcdd.exceldemo.entity.DemoData;
import com.pcdd.exceldemo.util.MyUtils;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @author pcdd
 * <p>
 * https://doc.hutool.cn/pages/poi/
 */
@Slf4j
public class HutoolPoi {

    public static void read(String path) {
        ExcelReader reader = ExcelUtil.getReader(path);
        List<DemoData> all = reader.readAll(DemoData.class);
        for (DemoData e : all) {
            log.info(e.toString());
        }
    }

    public static void write(String path) {
        ExcelWriter writer = ExcelUtil.getWriter(path);
        // 设置列名
        writer.addHeaderAlias("name", "名称");
        writer.addHeaderAlias("number", "数量");
        writer.addHeaderAlias("price", "价格");
        writer.addHeaderAlias("total", "合计");
        // 一次性写出内容，使用默认样式，强制输出标题
        writer.write(MyUtils.mock());
        // 关闭writer，释放内存
        writer.close();
    }

}
