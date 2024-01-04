package com.github.muskstark.echart.style.asix;


import com.github.muskstark.echart.style.line.LineStyle;
import lombok.Getter;

/**
 * 分隔线
 */
@Getter
public class SplitLine {

        private Boolean show;
        private Object interval;
        private LineStyle lineStyle;

        public SplitLine show(boolean show) {
                this.show = show;
                return this;
        }

        public SplitLine interval(Object interval) {
                this.interval = interval;
                return this;
        }

        public SplitLine lineStyle(LineStyle lineStyle) {
                this.lineStyle = lineStyle;
                return this;
        }

}