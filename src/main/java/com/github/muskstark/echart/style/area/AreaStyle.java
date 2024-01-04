package com.github.muskstark.echart.style.area;

import lombok.Data;

import java.awt.*;
import java.io.Serializable;

/**
 * 分隔区域style
 */
@Data
public class AreaStyle implements Serializable {
        private String color;
        private Number shadowBlur;
        private String shadowString;
        private Number shadowOffsetX;
        private Number shadowOffsetY;
        private Number opacity;

        public AreaStyle color(String color) {
                this.color = color;
                return this;
        }

        public AreaStyle shadowBlur(Number shadowBlur) {
                this.shadowBlur = shadowBlur;
                return this;
        }

        public AreaStyle shadowString(String shadowString) {
                this.shadowString = shadowString;
                return this;
        }

        public AreaStyle shadowOffsetX(Number shadowOffsetX) {
                this.shadowOffsetX = shadowOffsetX;
                return this;
        }

        public AreaStyle shadowOffsetY(Number shadowOffsetY) {
                this.shadowOffsetY = shadowOffsetY;
                return this;
        }

        public AreaStyle opacity(Number opacity) {
                this.opacity = opacity;
                return this;
        }
    }