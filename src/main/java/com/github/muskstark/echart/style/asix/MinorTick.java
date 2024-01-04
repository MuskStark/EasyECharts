package com.github.muskstark.echart.style.asix;


import com.github.muskstark.echart.style.line.LineStyle;
import lombok.Getter;

/**
 * 次刻度线
 */
@Getter
public class MinorTick {

        private Boolean show;
        private Integer splitNumber;
        private Number length;
        private LineStyle lineStyle;

        public MinorTick show(boolean show) {
                this.show = show;
                return this;
        }

        public MinorTick splitNumber(int splitNumber) {
                this.splitNumber = splitNumber;
                return this;
        }

        public MinorTick length(Number length) {
                this.length = length;
                return this;
        }

        public MinorTick lineStyle(LineStyle lineStyle) {
                this.lineStyle = lineStyle;
                return this;
        }

    }