package com.github.muskstark.echart.style.asix;


import lombok.Getter;

/**
 * 坐标轴指示器的文本标签。
 */
@Getter
public class AxisPointerLabel {
    private Boolean show;
    private Integer precision;
    private String formatter;
    private Integer margin;
    private String color;
    private String fontStyle;
    private String fontWeight;
    private String fontFamily;
    private Integer fontSize;
    private Integer lineHeight;
    private Integer width;
    private Integer height;
    private String textBorderColor;
    private Integer textBorderWidth;
    private String textBorderType;
    private Integer textBorderDashOffset;
    private String textShadowColor;
    private Integer textShadowBlur;
    private Integer textShadowOffsetX;
    private Integer textShadowOffsetY;
    private String overflow;
    private String ellipsis;
    private Integer[] padding;
    private String backgroundColor;
    private String borderColor;
    private Integer borderWidth;
    private Integer shadowBlur;
    private String shadowColor;
    private Integer shadowOffsetX;
    private Integer shadowOffsetY;

    public AxisPointerLabel show(boolean show) {
        this.show = show;
        return this;
    }
    public AxisPointerLabel precision(int precision) {
        this.precision = precision;
        return this;
    }
    public AxisPointerLabel formatter(String formatter) {
        this.formatter = formatter;
        return this;
    }
    public AxisPointerLabel margin(int margin) {
        this.margin = margin;
        return this;
    }
    public AxisPointerLabel color(String color) {
        this.color = color;
        return this;
    }
    public AxisPointerLabel fontStyle(String fontStyle) {
        this.fontStyle = fontStyle;
        return this;
    }
    public AxisPointerLabel fontWeight(String fontWeight) {
        this.fontWeight = fontWeight;
        return this;
    }
    public AxisPointerLabel fontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
        return this;
    }
    public AxisPointerLabel fontSize(int fontSize) {
        this.fontSize = fontSize;
        return this;
    }
    public AxisPointerLabel lineHeight(int lineHeight) {
        this.lineHeight = lineHeight;
        return this;
    }
    public AxisPointerLabel width(int width) {
        this.width = width;
        return this;
    }
    public AxisPointerLabel height(int height) {
        this.height = height;
        return this;
    }
    public AxisPointerLabel textBorderColor(String textBorderColor) {
        this.textBorderColor = textBorderColor;
        return this;
    }
    public AxisPointerLabel textBorderWidth(int textBorderWidth) {
        this.textBorderWidth = textBorderWidth;
        return this;
    }

    public AxisPointerLabel textBorderType(String textBorderType) {
        this.textBorderType = textBorderType;
        return this;
    }
    public AxisPointerLabel textBorderDashOffset(int textBorderDashOffset) {
        this.textBorderDashOffset = textBorderDashOffset;
        return this;
    }
    public AxisPointerLabel textShadowColor(String textShadowColor) {
        this.textShadowColor = textShadowColor;
        return this;
    }
    public AxisPointerLabel textShadowBlur(int textShadowBlur) {
        this.textShadowBlur = textShadowBlur;
        return this;
    }
    public AxisPointerLabel textShadowOffsetX(int textShadowOffsetX) {
        this.textShadowOffsetX = textShadowOffsetX;
        return this;
    }
    public AxisPointerLabel textShadowOffsetY(int textShadowOffsetY) {
        this.textShadowOffsetY = textShadowOffsetY;
        return this;
    }
    public AxisPointerLabel overflow(String overflow) {
        this.overflow = overflow;
        return this;
    }
    public AxisPointerLabel ellipsis(String ellipsis) {
        this.ellipsis = ellipsis;
        return this;
    }
    public AxisPointerLabel padding(Integer[] padding) {
        this.padding = padding;
        return this;
    }
    public AxisPointerLabel backgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }
    public AxisPointerLabel borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }
    public AxisPointerLabel borderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }
    public AxisPointerLabel shadowBlur(int shadowBlur) {
        this.shadowBlur = shadowBlur;
        return this;
    }
    public AxisPointerLabel shadowColor(String shadowColor) {
        this.shadowColor = shadowColor;
        return this;
    }
    public AxisPointerLabel shadowOffsetX(int shadowOffsetX) {
        this.shadowOffsetX = shadowOffsetX;
        return this;
    }
    public AxisPointerLabel shadowOffsetY(int shadowOffsetY) {
        this.shadowOffsetY = shadowOffsetY;
        return this;
    }



}
