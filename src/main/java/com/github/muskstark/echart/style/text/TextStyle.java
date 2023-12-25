package com.github.muskstark.echart.style.text;

import lombok.Data;

import java.io.Serializable;

@Data
public class TextStyle implements Serializable {
            private String color;
            private String fontStyle;
            private String fontWeight;
            private String fontFamily;
            private int fontSize;
            private int lineHeight;
            private int width;
            private int height;
            private String textBorderColor;
            private int textBorderWidth;
            private String textBorderType;
            private int textBorderDashOffset;
            private String textShadowColor;
            private int textShadowBlur;
            private int textShadowOffsetX;
            private int textShadowOffsetY;
            private String overflow;
            private String ellipsis;
            private String rich;
        }