package com.github.muskstark.echart.style.asix;

import lombok.Data;

import java.io.Serializable;

/**
 * 标签
 */
@Data
public class AxisLabel implements Serializable {

        private Boolean show;
        private Object interval;
        private Boolean inside;
        private Number rotate;
        private Number margin;
        private Object formatter;

}