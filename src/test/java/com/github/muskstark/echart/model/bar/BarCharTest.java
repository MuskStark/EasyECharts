package com.github.muskstark.echart.model.bar;

import com.github.muskstark.echart.enums.TypeOfChart;
import com.github.muskstark.echart.factory.BarChartFactory;
import com.github.muskstark.echart.util.EchartsUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BarCharTest {

    @Test
    public void createBarCharTest() {
        BarChartFactory factory = new BarChartFactory();
        BarChar chart = factory.createChart(TypeOfChart.BAR_CHART_BASE);
        System.out.println(EchartsUtil.toJson(chart));
    }

    @Test
    public void defineChartTest() {
        BarChartFactory factory = new BarChartFactory();
        BarChar chart = factory.createChart(TypeOfChart.BAR_CHART_BASE);
        chart.defineXAxis().id("1")
                .alignTicks(true);
        chart.defineYAxis().id("2");
        chart.defineTitle().show(true);
        System.out.println(EchartsUtil.toJson(chart));
    }

}