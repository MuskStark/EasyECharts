package com.github.muskstark.echart.style.asix;



import com.github.muskstark.echart.style.rich.Rich;
import lombok.Data;

import java.awt.*;

/**
 * 坐标轴名称样式
 */
@Data
public class NameTextStyle {
        private Color color;
        private String fontStyle;
        private String fontWeight;
        private String fontFamily;
        private Number fontSize;
        private String align;
        private String verticalAlign;
        private Number lineHeight;
        private Object backgroundColor;
        private Color borderColor;
        private Number borderWidth;
        private Object borderType;
        private Number borderDashOffset;
        private Number[] borderRadius;
        private Number[] padding;
        private Color shadowColor;
        private Number shadowBlur;
        private Number shadowOffsetX;
        private Number shadowOffsetY;
        private Number width;
        private Number height;
        private Color textBorderColor;
        private Number textBorderWidth;
        private Object textBorderType;
        private Number textBorderDashOffset;
        private Color textShadowColor;
        private Number textShadowBlur;
        private Number textShadowOffsetX;
        private Number textShadowOffsetY;
        private String overflow;
        private String ellipsis;
        private Rich rich;
    }