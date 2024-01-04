package com.github.muskstark.echart.factory;

import com.github.muskstark.echart.attribute.Legend;
import com.github.muskstark.echart.attribute.Title;
import com.github.muskstark.echart.attribute.ToolTip;
import com.github.muskstark.echart.attribute.series.PieSeries;
import com.github.muskstark.echart.enums.StyleOfPeiChart;
import com.github.muskstark.echart.model.pei.PeiChart;

public abstract class PieChartFactory {

    public static PeiChart createChart(){
        return createBasePieChart();
    }

    public static  PeiChart createChart(StyleOfPeiChart styleOfChart){
        String style = styleOfChart.getStyleOfChart();
        PeiChart chart = null;
        if(style == null){
            chart = createBasePieChart();
        }
        switch (style) {
            case "base" -> {
                chart = createBasePieChart();
            }
        }

        return chart;
    }

    private static PeiChart createBasePieChart(){
        PeiChart chart = new PeiChart();
        chart.setTitle(new Title());
        chart.setLegend(new Legend());
        chart.setToolTip(new ToolTip());
        chart.addPieSeries(new PieSeries());
        return chart;
    }
}
