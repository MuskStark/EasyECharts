package com.github.muskstark.echart.util;

import com.github.muskstark.echart.enums.TypeOfChart;
import com.github.muskstark.echart.factory.BarChartFactory;
import com.github.muskstark.echart.model.bar.BarChar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EchartsUtilTest {

    @Test
    void toJson() {
        BarChartFactory factory = new BarChartFactory();
        BarChar chart = factory.createChart(TypeOfChart.BAR_CHART);
        String json = EchartsUtil.toJson(chart);
        System.out.println(json);
    }
}