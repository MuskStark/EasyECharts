package com.github.muskstark.echart.style.asix;

import icu.topbanker.echarts.style.line.LineStyle;
import lombok.Data;

/**
 * 坐标轴指示器配置项
 */
@Data
public class AxisPointer {

        private Boolean show;
        private String type;
        private Boolean snap;
        private Number z;
        private AxisPointerLabel label;
        private LineStyle lineStyle;
    }