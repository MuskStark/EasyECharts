package com.github.muskstark.echart.style.line;

import lombok.Data;

import java.awt.*;

/**
 * 线条样式
 *
 */
@Data
public class LineStyle {
    private Color color;
    private Number width;
    private String type;
    private Number dashOffset;
    private String cap;
    private String join;
    private Number miterLimit;
    private Number shadowBlur;
    private Color shadowColor;
    private Number shadowOffsetX;
    private Number shadowOffsetY;
    private Number opacity;
}
