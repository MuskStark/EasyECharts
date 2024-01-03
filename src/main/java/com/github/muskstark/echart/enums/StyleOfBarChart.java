package com.github.muskstark.echart.enums;

import lombok.Getter;

/**
 * 支持Chart种类
 */
@Getter
public enum StyleOfBarChart {
    /**
     * 基础类图表
     */
    BAR_CHART(null)
    ,BAR_CHART_BASE("base")
    ,BAR_CHART_AXIS_ALIGN_WITH_TICK("Axis Align with Tick")
    ,BAR_CHART_WITH_BACKGROUND("background");

    private final String styleOfChart;


    StyleOfBarChart(String styleOfChart) {
        this.styleOfChart = styleOfChart;
    }

}
