package com.github.muskstark.echart.style.asix;


import com.github.muskstark.echart.style.line.LineStyle;
import lombok.Getter;

/**
 * 坐标轴指示器配置项
 */
@Getter
public class AxisPointer {

        private Boolean show;
        private String type;
        private Boolean snap;
        private Number z;
        private AxisPointerLabel label;
        private LineStyle lineStyle;

        public AxisPointer show(boolean show) {
                this.show = show;
                return this;
        }

        public AxisPointer type(String type) {
                this.type = type;
                return this;
        }

        public AxisPointer snap(boolean snap) {
                this.snap = snap;
                return this;
        }

        public AxisPointer z(Number z) {
                this.z = z;
                return this;
        }

        public AxisPointer label(AxisPointerLabel label) {
                this.label = label;
                return this;
        }

        public AxisPointer lineStyle(LineStyle lineStyle) {
                this.lineStyle = lineStyle;
                return this;
        }

    }