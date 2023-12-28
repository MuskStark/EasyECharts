package com.github.muskstark.echart.enums;

import lombok.Getter;

/**
 * 支持Chart种类
 */
@Getter
public enum TypeOfChart {
    /**
     * 基础类图表
     */
    BAR_CHART("bar",null),
    BAR_CHART_BASE("bar","base"),
    BAR_CHART_AXIS_ALIGN_WITH_TICK("bar","Axis Align with Tick") ;

    private final String type;

    private final String kindOfChart;


    TypeOfChart(String type, String kindOfChart) {
        this.type = type;
        this.kindOfChart = kindOfChart;
    }

}
