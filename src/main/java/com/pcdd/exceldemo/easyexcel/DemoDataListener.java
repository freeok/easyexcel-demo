package com.pcdd.exceldemo.easyexcel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import com.pcdd.exceldemo.entity.DemoData;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pcdd
 */
@Slf4j
public class DemoDataListener implements ReadListener<DemoData> {

    List<DemoData> rows = new ArrayList<>();

    /**
     * 每一条数据解析都会来调用
     */
    @Override
    public void invoke(DemoData data, AnalysisContext context) {
        log.info("解析到一条数据: {}", data);
        rows.add(data);
    }

    /**
     * 所有数据解析完成时调用
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        log.info("所有数据解析完成！");
    }

}