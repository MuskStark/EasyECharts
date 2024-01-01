package com.github.muskstark.echart.style.line;


import lombok.Getter;

import java.awt.*;

/**
 * 线条样式
 *
 */
@Getter
public class LineStyle {
    private String color;
    private Number width;
    private String type;
    private Number dashOffset;
    private String cap;
    private String join;
    private Number miterLimit;
    private Number shadowBlur;
    private String shadowString;
    private Number shadowOffsetX;
    private Number shadowOffsetY;
    private Number opacity;

    public LineStyle color(String color){
        this.color = color;
        return this;
    }

    public LineStyle width(Number width){
        this.width = width;
        return this;
    }

    public LineStyle type(String type){
        this.type = type;
        return this;
    }

    public LineStyle dashOffset(Number dashOffset){
        this.dashOffset = dashOffset;
        return this;
    }

    public LineStyle cap(String cap){
        this.cap = cap;
        return this;
    }

    public LineStyle join(String join){
        this.join = join;
        return this;
    }

    public LineStyle miterLimit(Number miterLimit){
        this.miterLimit = miterLimit;
        return this;
    }

    public LineStyle shadowBlur(Number shadowBlur){
        this.shadowBlur = shadowBlur;
        return this;
    }

    public LineStyle shadowString(String shadowString){
        this.shadowString = shadowString;
        return this;
    }

    public LineStyle shadowOffsetX(Number shadowOffsetX){
        this.shadowOffsetX = shadowOffsetX;
        return this;
    }

    public LineStyle shadowOffsetY(Number shadowOffsetY){
        this.shadowOffsetY = shadowOffsetY;
        return this;
    }

    public LineStyle opacity(Number opacity){
        this.opacity = opacity;
        return this;
    }

}
