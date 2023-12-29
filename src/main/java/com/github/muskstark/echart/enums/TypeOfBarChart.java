package com.github.muskstark.echart.enums;

import lombok.Getter;

/**
 * 支持Chart种类
 */
@Getter
public enum TypeOfBarChart {
    /**
     * 基础类图表
     */
    BAR_CHART(null),
    BAR_CHART_BASE("base"),
    BAR_CHART_AXIS_ALIGN_WITH_TICK("Axis Align with Tick") ;

    private final String kindOfChart;


    TypeOfBarChart(String kindOfChart) {
        this.kindOfChart = kindOfChart;
    }

}
