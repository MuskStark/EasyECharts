package com.github.muskstark.echart.factory;


import com.github.muskstark.echart.attribute.Legend;
import com.github.muskstark.echart.attribute.Title;
import com.github.muskstark.echart.attribute.axis.XAxis;
import com.github.muskstark.echart.attribute.axis.YAxis;
import com.github.muskstark.echart.attribute.series.BarSeries;
import com.github.muskstark.echart.enums.StyleOfBarChart;
import com.github.muskstark.echart.model.bar.BarChart;
import com.github.muskstark.echart.style.asix.AxisPointer;
import com.github.muskstark.echart.style.background.BackgroundStyle;

import java.util.ArrayList;

public abstract class BarChartFactory {

    private static final String TYPE = "bar";

    public static BarChart createChart(){
        return createBaseBarChart();
    }

    public static BarChart createChart(StyleOfBarChart chartStyle) {
        BarChart chart = null;
        String styleOfChart = chartStyle.getStyleOfChart();
        if(styleOfChart == null){
            chart = createBaseBarChart();
            return chart;
        }
        switch (styleOfChart) {
            case "base" -> {
                chart = createBaseBarChart();
                chart.defineTitle().show(false);
                chart.defineXAxis().type("category");
                chart.defineYAxis().type("value");

            }
            case "Axis Align with Tick" -> {
                chart = createBaseBarChart();
                chart.defineToolTip()
                        .trigger("axis")
                        .axisPointer(
                                new AxisPointer()
                                        .type("shadow")
                        );
                chart.defineXAxis()
                        .type("category");
                chart.defineYAxis()
                        .type("value");

            }
            case "background" -> {
                chart = createBaseBarChart();
                chart.defineTitle().show(false);
                chart.defineXAxis().type("category");
                chart.defineYAxis().type("value");
                chart.defineDefaultSeries()
                        .showBackground(true)
                        .backgroundStyle(
                                new BackgroundStyle()
                                        .defineColor("rgba(180, 180, 180, 0.2)"));
            }
        }
        return chart;

    }

    private static BarChart createBaseBarChart(){

        BarChart chart = new BarChart();
        BarSeries series = new BarSeries();
        series.type(TYPE);
        chart.setTitle(new Title());
        chart.setXAxis(new XAxis());
        chart.setYAxis(new YAxis());
        chart.setLegend(new Legend().show(false));
        chart.setSeries(new ArrayList<BarSeries>());
        chart.addSeries(series);

        return chart;
    }
}
