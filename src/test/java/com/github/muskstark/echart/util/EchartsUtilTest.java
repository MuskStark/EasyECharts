package com.github.muskstark.echart.util;


import com.github.muskstark.echart.enums.StyleOfBarChart;
import com.github.muskstark.echart.factory.BarChartFactory;
import com.github.muskstark.echart.model.bar.BarChart;
import org.junit.jupiter.api.Test;

class EchartsUtilTest {

    @Test
    void toJson() {
        BarChart chart = BarChartFactory.createChart(StyleOfBarChart.BAR_CHART);
        String json = EchartsUtil.toJson(chart);
        System.out.println(json);
    }
}