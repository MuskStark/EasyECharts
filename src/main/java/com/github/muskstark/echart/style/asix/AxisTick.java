package com.github.muskstark.echart.style.asix;

import icu.topbanker.echarts.style.line.LineStyle;
import lombok.Data;

/**
 * 坐标轴刻度
 */
@Data
public class AxisTick {
        private boolean show;
        private boolean alignWithLabel;
        private String interval;
        private boolean inside;
        private int length;
        private LineStyle lineStyle;
    }