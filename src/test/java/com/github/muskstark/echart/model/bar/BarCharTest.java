package com.github.muskstark.echart.model.bar;

import com.github.muskstark.echart.enums.TypeOfBarChart;
import com.github.muskstark.echart.factory.BarChartFactory;
import com.github.muskstark.echart.util.EchartsUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BarCharTest {

    @Test
    void createNullBarCharTest() {

        BarChar chart = BarChartFactory.createChart(TypeOfBarChart.BAR_CHART);
        System.out.println(EchartsUtil.toJson(chart));
    }

    @Test
    void createBaseBarCharTest() {
        BarChar chart = BarChartFactory.createChart(TypeOfBarChart.BAR_CHART_BASE);
        chart.defineXAxis().id("1")
                .alignTicks(true);
        chart.defineYAxis().id("2");
        chart.defineTitle().show(true);
        System.out.println(EchartsUtil.toJson(chart));
    }

    @Test
    void createAlignBarCharTest() {
        BarChar chart = BarChartFactory.createChart(TypeOfBarChart.BAR_CHART_AXIS_ALIGN_WITH_TICK);
        System.out.println(EchartsUtil.toJson(chart));
    }

    @Test
    void defineChartTest(){
        BarChar chart = BarChartFactory.createChart(TypeOfBarChart.BAR_CHART);
        chart.defineXAxis().id("1")
                .alignTicks(true);
        chart.defineYAxis().id("2");
        chart.defineTitle().show(true);
        System.out.println(EchartsUtil.toJson(chart));
    }

}