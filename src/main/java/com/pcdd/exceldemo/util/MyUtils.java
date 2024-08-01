package com.pcdd.exceldemo.util;

import cn.hutool.core.util.RandomUtil;
import com.pcdd.exceldemo.entity.DemoData;
import lombok.experimental.UtilityClass;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class MyUtils {

    public List<DemoData> mock() {
        List<DemoData> rows = new ArrayList<>();
        for (int i = 0; i < 1_000; i++) {
            DemoData fillData = new DemoData();
            fillData.setName(RandomUtil.randomString(RandomUtil.randomChinese() + "", RandomUtil.randomInt(6)));
            int number = RandomUtil.randomInt(100);
            double price = RandomUtil.randomDouble(100, 2, RoundingMode.UP);
            double total = number * price;
            fillData.setNumber(number);
            fillData.setPrice(price);
            fillData.setTotal(total);
            rows.add(fillData);
        }
        return rows;
    }

}
