package com.github.muskstark.echart.enums;

import lombok.Getter;

/**
 * 支持Chart种类
 */
@Getter
public enum StyleOfPeiChart {
    /**
     * 基础类图表
     */
    PEI_CHART(null);

    private final String styleOfChart;


    StyleOfPeiChart(String styleOfChart) {
        this.styleOfChart = styleOfChart;
    }

}
