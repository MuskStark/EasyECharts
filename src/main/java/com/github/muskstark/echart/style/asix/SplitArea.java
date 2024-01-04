package com.github.muskstark.echart.style.asix;


import com.github.muskstark.echart.style.area.AreaStyle;
import lombok.Getter;

/**
 * 分隔区域
 */
@Getter
public class SplitArea {

        private Object interval;
        private Boolean show;
        private AreaStyle areaStyle;

        public SplitArea interval(Object interval) {
                this.interval = interval;
                return this;
        }

        public SplitArea show(boolean show) {
                this.show = show;
                return this;
        }

        public SplitArea areaStyle(AreaStyle areaStyle) {
                this.areaStyle = areaStyle;
                return this;
        }

    }