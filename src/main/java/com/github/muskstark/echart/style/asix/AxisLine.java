package com.github.muskstark.echart.style.asix;

import icu.topbanker.echarts.style.line.LineStyle;
import lombok.Data;

/**
 * 坐标轴轴线设置
 */
@Data
public class AxisLine {
    private Boolean show;
    private Boolean onZero;
    private Number onZeroAxisIndex;
    private Object symbol;
    private Number[] symbolSize;
    private Number[] symbolOffset;
    private LineStyle lineStyle;
}
