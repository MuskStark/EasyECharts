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
    BAR_CHART("bar");

    private String type;

    TypeOfChart(String type) {
        this.type = type;
    }

}
