package com.pcdd.exceldemo;

import com.pcdd.exceldemo.hutool.HutoolPoi;
import org.junit.jupiter.api.Test;

import java.io.File;

class HutoolPoiTest {

    public static final String PREFIX = System.getProperty("user.dir") + File.separator;

    @Test
    void read() {
        HutoolPoi.read(PREFIX + "hutool-poi.xlsx");
    }

    @Test
    void write() {
        HutoolPoi.write(PREFIX + "hutool-poi.xlsx");
    }

}
