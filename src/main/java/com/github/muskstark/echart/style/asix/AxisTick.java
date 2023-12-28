package com.github.muskstark.echart.style.asix;


import com.github.muskstark.echart.style.line.LineStyle;
import lombok.Getter;

/**
 * 坐标轴刻度
 */
@Getter
public class AxisTick {
        private boolean show;
        private boolean alignWithLabel;
        private String interval;
        private boolean inside;
        private int length;
        private LineStyle lineStyle;

        public AxisTick show(boolean show) {
                this.show = show;
                return this;
        }
        public AxisTick alignWithLabel(boolean alignWithLabel) {
                this.alignWithLabel = alignWithLabel;
                return this;
        }
        public AxisTick interval(String interval) {
                this.interval = interval;
                return this;
        }
        public AxisTick inside(boolean inside) {
                this.inside = inside;
                return this;
        }
        public AxisTick length(int length) {
                this.length = length;
                return this;
        }
        public AxisTick lineStyle(LineStyle lineStyle) {
                this.lineStyle = lineStyle;
                return this;
        }

    }