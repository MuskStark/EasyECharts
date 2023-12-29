package com.github.muskstark.echart.factory;


import com.github.muskstark.echart.attribute.Title;
import com.github.muskstark.echart.attribute.axis.XAxis;
import com.github.muskstark.echart.attribute.axis.YAxis;
import com.github.muskstark.echart.attribute.series.BarSeries;
import com.github.muskstark.echart.enums.TypeOfBarChart;
import com.github.muskstark.echart.model.bar.BarChar;
import com.github.muskstark.echart.style.asix.AxisPointer;

import java.util.ArrayList;

public abstract class BarChartFactory {

    private static final String TYPE = "bar";

    public static BarChar createChart(TypeOfBarChart chartType) {
        BarChar chart = null;
        String kindOfChart = chartType.getKindOfChart();
        if(kindOfChart == null){
            chart = createBaseBarChart();
            return chart;
        }
        switch (kindOfChart) {
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
        }
        return chart;

    }

    private static BarChar createBaseBarChart(){

        BarChar chart = new BarChar();
        BarSeries series = new BarSeries();
        series.type(TYPE);
        chart.setTitle(new Title());
        chart.setXAxis(new XAxis());
        chart.setYAxis(new YAxis());
        chart.setSeries(new ArrayList<BarSeries>());
        chart.addSeries(series);

        return chart;
    }
}
