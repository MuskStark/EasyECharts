package com.github.muskstark.echart.style.asix;


import lombok.Getter;

import java.io.Serializable;

/**
 * 标签
 */
@Getter
public class AxisLabel implements Serializable {

        private Boolean show;
        private Object interval;
        private Boolean inside;
        private Number rotate;
        private Number margin;
        private Object formatter;

        public AxisLabel show(Boolean show) {
                this.show = show;
                return this;
        }

        public AxisLabel interval(Object interval) {
                this.interval = interval;
                return this;
        }

        public AxisLabel inside(Boolean inside) {
                this.inside = inside;
                return this;
        }

        public AxisLabel rotate(Number rotate) {
                this.rotate = rotate;
                return this;
        }

        public AxisLabel margin(Number margin) {
                this.margin = margin;
                return this;
        }

        public AxisLabel formatter(Object formatter) {
                this.formatter = formatter;
                return this;
        }

}