package com.github.muskstark.echart.style.asix;


import com.github.muskstark.echart.style.line.LineStyle;
import lombok.Getter;

/**
 * 次分隔线
 */
@Getter
public class MinorSplitLine {

        private Boolean show;
        private LineStyle lineStyle;

        public MinorSplitLine show(boolean show) {
                this.show = show;
                return this;
        }
        public MinorSplitLine lineStyle(LineStyle lineStyle) {
                this.lineStyle = lineStyle;
                return this;
        }



    }