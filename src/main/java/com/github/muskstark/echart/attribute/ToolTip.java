package com.github.muskstark.echart.attribute;

import com.github.muskstark.echart.style.asix.AxisPointer;
import com.github.muskstark.echart.style.text.TextStyle;
import lombok.Getter;

import java.awt.*;

@Getter
public class ToolTip {

    private Boolean show;
    private String trigger;
    private AxisPointer axisPointer;
    private Boolean showContent;
    private Boolean alwaysShowContent;
    private String triggerOn;
    private Integer showDelay;
    private Integer hideDelay;
    private String rendererMode;
    private Boolean confine;
    private Boolean appendToBody;
    private String className;
    private Double transitionDuration;
//    private Object position;
    private String formatter;
    private String valueFormatter;
//    private Color backgroundColor;
//    private Color borderColor;
//    private Double borderWidth;
//    private Double padding;
    private TextStyle textStyle;
    private String extraCssText;
    private String order;




}
