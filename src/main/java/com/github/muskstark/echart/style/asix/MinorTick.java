package com.github.muskstark.echart.style.asix;

import icu.topbanker.echarts.style.line.LineStyle;
import lombok.Data;

/**
 * 次刻度线
 */
@Data
public class MinorTick {

        private Boolean show;
        private Integer splitNumber;
        private Number length;
        private LineStyle lineStyle;

    }