package com.github.muskstark.echart.style.area;

import lombok.Data;

import java.awt.*;
import java.io.Serializable;

/**
 * 分隔区域style
 */
@Data
public class AreaStyle implements Serializable {
        private Color color;
        private Number shadowBlur;
        private Color shadowColor;
        private Number shadowOffsetX;
        private Number shadowOffsetY;
        private Number opacity;
    }