package com.github.muskstark.echart.style.asix;



import com.github.muskstark.echart.style.rich.Rich;
import lombok.Data;
import lombok.Getter;

import java.awt.*;

/**
 * 坐标轴名称样式
 */
@Getter
public class NameTextStyle {
        private String color;
        private String fontStyle;
        private String fontWeight;
        private String fontFamily;
        private Number fontSize;
        private String align;
        private String verticalAlign;
        private Number lineHeight;
        private Object backgroundString;
        private String borderString;
        private Number borderWidth;
        private Object borderType;
        private Number borderDashOffset;
        private Number[] borderRadius;
        private Number[] padding;
        private String shadowString;
        private Number shadowBlur;
        private Number shadowOffsetX;
        private Number shadowOffsetY;
        private Number width;
        private Number height;
        private String textBorderString;
        private Number textBorderWidth;
        private Object textBorderType;
        private Number textBorderDashOffset;
        private String textShadowString;
        private Number textShadowBlur;
        private Number textShadowOffsetX;
        private Number textShadowOffsetY;
        private String overflow;
        private String ellipsis;
        private Rich rich;

        public NameTextStyle color(String color) {
                this.color = color;
                return this;
        }
        public NameTextStyle fontStyle(String fontStyle) {
                this.fontStyle = fontStyle;
                return this;
        }
        public NameTextStyle fontWeight(String fontWeight) {
                this.fontWeight = fontWeight;
                return this;
        }
        public NameTextStyle fontFamily(String fontFamily) {
                this.fontFamily = fontFamily;
                return this;
        }
        public NameTextStyle fontSize(Number fontSize) {
                this.fontSize = fontSize;
                return this;
        }

        public NameTextStyle align(String align) {
                this.align = align;
                return this;
        }
        public NameTextStyle verticalAlign(String verticalAlign) {
                this.verticalAlign = verticalAlign;
                return this;
        }
        public NameTextStyle lineHeight(Number lineHeight) {
                this.lineHeight = lineHeight;
                return this;
        }
        public NameTextStyle backgroundString(Object backgroundString) {
                this.backgroundString = backgroundString;
                return this;
        }
        public NameTextStyle borderString(String borderString) {
                this.borderString = borderString;
                return this;
        }
        public NameTextStyle borderWidth(Number borderWidth) {
                this.borderWidth = borderWidth;
                return this;
        }
        public NameTextStyle borderType(Object borderType) {
                this.borderType = borderType;
                return this;
        }
        public NameTextStyle borderDashOffset(Number borderDashOffset) {
                this.borderDashOffset = borderDashOffset;
                return this;
        }
        public NameTextStyle borderRadius(Number[] borderRadius) {
                this.borderRadius = borderRadius;
                return this;
        }
        public NameTextStyle padding(Number[] padding) {
                this.padding = padding;
                return this;
        }
        public NameTextStyle shadowString(String shadowString) {
                this.shadowString = shadowString;
                return this;
        }
        public NameTextStyle shadowBlur(Number shadowBlur) {
                this.shadowBlur = shadowBlur;
                return this;
        }
        public NameTextStyle shadowOffsetX(Number shadowOffsetX) {
                this.shadowOffsetX = shadowOffsetX;
                return this;
        }
        public NameTextStyle shadowOffsetY(Number shadowOffsetY) {
                this.shadowOffsetY = shadowOffsetY;
                return this;
        }
        public NameTextStyle width(Number width) {
                this.width = width;
                return this;
        }
        public NameTextStyle height(Number height) {
                this.height = height;
                return this;
        }
        public NameTextStyle textBorderString(String textBorderString) {
                this.textBorderString = textBorderString;
                return this;
        }
        public NameTextStyle textBorderWidth(Number textBorderWidth) {
                this.textBorderWidth = textBorderWidth;
                return this;
        }
        public NameTextStyle textBorderType(Object textBorderType) {
                this.textBorderType = textBorderType;
                return this;
        }
        public NameTextStyle textBorderDashOffset(Number textBorderDashOffset) {
                this.textBorderDashOffset = textBorderDashOffset;
                return this;
        }
        public NameTextStyle textShadowString(String textShadowString) {
                this.textShadowString = textShadowString;
                return this;
        }
        public NameTextStyle textShadowBlur(Number textShadowBlur) {
                this.textShadowBlur = textShadowBlur;
                return this;
        }
        public NameTextStyle textShadowOffsetX(Number textShadowOffsetX) {
                this.textShadowOffsetX = textShadowOffsetX;
                return this;
        }
        public NameTextStyle textShadowOffsetY(Number textShadowOffsetY) {
                this.textShadowOffsetY = textShadowOffsetY;
                return this;
        }
        public NameTextStyle overflow(String overflow) {
                this.overflow = overflow;
                return this;
        }
        public NameTextStyle ellipsis(String ellipsis) {
                this.ellipsis = ellipsis;
                return this;
        }
        public NameTextStyle rich(Rich rich) {
                this.rich = rich;
                return this;
        }

    }