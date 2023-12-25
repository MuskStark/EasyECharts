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
    private int[] borderRadius;
    private int shadowBlur;
    private Color shadowColor;
    private int shadowOffsetX;
    private int shadowOffsetY;
    private int opacity;

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

    public BackgroundStyle defineBorderRadius(int leftUp, int rightUp, int rightDown, int leftDown) {
        this.borderRadius = new int[]{leftUp, rightUp, rightDown, leftDown};
        return this;
    }
    public BackgroundStyle defineBorderRadius(int allRadius) {
        this.borderRadius = new int[]{allRadius, allRadius, allRadius, allRadius};
        return this;
    }

    public BackgroundStyle defineShadowBlur(int shadowBlur) {
        this.shadowBlur = shadowBlur;
        return this;
    }

    public BackgroundStyle defineShadowColor(Color shadowColor) {
        this.shadowColor = shadowColor;
        return this;
    }

    public BackgroundStyle defineShadowOffsetX(int shadowOffsetX) {
        this.shadowOffsetX = shadowOffsetX;
        return this;
    }

    public BackgroundStyle defineShadowOffsetY(int shadowOffsetY) {
        this.shadowOffsetY = shadowOffsetY;
        return this;
    }

    public BackgroundStyle defineOpacity(int opacity) {
        this.opacity = opacity;
        return this;
    }



}
