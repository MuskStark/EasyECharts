package com.github.muskstark.echart.style.background;

import lombok.Getter;

import java.awt.*;

/**
 * 背景样式
 */
@Getter
public class BackgroundStyle {

    private String color;
    private String borderColor;
    private String borderWidth;
    private String  borderType;
    private Integer[] borderRadius;
    private Integer shadowBlur;
    private Color shadowColor;
    private Integer shadowOffsetX;
    private Integer shadowOffsetY;
    private Integer opacity;

    public BackgroundStyle defineColor(String color) {
        this.color = color;
        return this;
    }

    public BackgroundStyle defineBorderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public BackgroundStyle defineBorderWidth(String borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public BackgroundStyle defineBorderType(String borderType) {
        this.borderType = borderType;
        return this;
    }

    public BackgroundStyle defineBorderRadius(Integer leftUp, Integer rightUp, Integer rightDown, Integer leftDown) {
        this.borderRadius = new Integer[]{leftUp, rightUp, rightDown, leftDown};
        return this;
    }
    public BackgroundStyle defineBorderRadius(Integer allRadius) {
        this.borderRadius = new Integer[]{allRadius, allRadius, allRadius, allRadius};
        return this;
    }

    public BackgroundStyle defineShadowBlur(Integer shadowBlur) {
        this.shadowBlur = shadowBlur;
        return this;
    }

    public BackgroundStyle defineShadowColor(Color shadowColor) {
        this.shadowColor = shadowColor;
        return this;
    }

    public BackgroundStyle defineShadowOffsetX(Integer shadowOffsetX) {
        this.shadowOffsetX = shadowOffsetX;
        return this;
    }

    public BackgroundStyle defineShadowOffsetY(Integer shadowOffsetY) {
        this.shadowOffsetY = shadowOffsetY;
        return this;
    }

    public BackgroundStyle defineOpacity(Integer opacity) {
        this.opacity = opacity;
        return this;
    }



}
