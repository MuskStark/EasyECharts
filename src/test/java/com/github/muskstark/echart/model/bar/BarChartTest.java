package com.github.muskstark.echart.model.bar;

import com.github.muskstark.echart.enums.StyleOfBarChart;
import com.github.muskstark.echart.factory.BarChartFactory;
import com.github.muskstark.echart.util.EchartsUtil;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class BarChartTest {

    @Test
    void createNullBarCharTest() {

        BarChart chart = BarChartFactory.createChart(StyleOfBarChart.BAR_CHART);
        System.out.println(EchartsUtil.toJson(chart));
    }

    @Test
    void createBaseBarCharTest() {
        BarChart chart = BarChartFactory.createChart(StyleOfBarChart.BAR_CHART_BASE);
        chart.defineXAxis().id("1")
                .alignTicks(true);
        chart.defineYAxis().id("2");
        chart.defineTitle().show(true);
        System.out.println(EchartsUtil.toJson(chart));
    }

    @Test
    void createAlignBarCharTest() {
        BarChart chart = BarChartFactory.createChart(StyleOfBarChart.BAR_CHART_AXIS_ALIGN_WITH_TICK);
        System.out.println(EchartsUtil.toJson(chart));
    }

    @Test
    void defineChartTest(){
        BarChart chart = BarChartFactory.createChart();
        chart.defineXAxis().id("1")
                .alignTicks(true);
        chart.defineYAxis().id("2");
        chart.defineTitle().show(true);
        chart.defineToolTip().extraCssText("test");
        chart.defineLegend().type("legend");
        List<Long> seriesData = new ArrayList<Long>();
        seriesData.add(1l);
        seriesData.add(2l);
        chart.defineDefaultSeries().data(seriesData);
        System.out.println(EchartsUtil.toJson(chart));
    }

}