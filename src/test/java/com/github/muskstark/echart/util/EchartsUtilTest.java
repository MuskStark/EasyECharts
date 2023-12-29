package com.github.muskstark.echart.util;


import com.github.muskstark.echart.enums.TypeOfBarChart;
import com.github.muskstark.echart.factory.BarChartFactory;
import com.github.muskstark.echart.model.bar.BarChar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EchartsUtilTest {

    @Test
    void toJson() {
        BarChar chart = BarChartFactory.createChart(TypeOfBarChart.BAR_CHART);
        String json = EchartsUtil.toJson(chart);
        System.out.println(json);
    }
}