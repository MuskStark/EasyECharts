package com.github.muskstark.echart.factory;


import com.github.muskstark.echart.enums.TypeOfChart;
import com.github.muskstark.echart.model.bar.BarChar;

public class BarChartFactory implements EchartsFactory{
    @Override
    public BarChar createChart(TypeOfChart chartType) {
        BarChar barCharBase = new BarChar();
        barCharBase.initialize(chartType);
        return barCharBase;
    }
}
