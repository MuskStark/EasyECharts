package com.github.muskstark.echart.attribute;

import com.github.muskstark.echart.style.asix.AxisPointer;
import com.github.muskstark.echart.style.text.TextStyle;
import lombok.Getter;

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

    public ToolTip show(Boolean show) {
        this.show = show;
        return this;
    }

    public ToolTip trigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public ToolTip axisPointer(AxisPointer axisPointer) {
        this.axisPointer = axisPointer;
        return this;
    }

    public ToolTip showContent(Boolean showContent) {
        this.showContent = showContent;
        return this;
    }

    public ToolTip alwaysShowContent(Boolean alwaysShowContent) {
        this.alwaysShowContent = alwaysShowContent;
        return this;
    }

    public ToolTip triggerOn(String triggerOn) {
        this.triggerOn = triggerOn;
        return this;
    }

    public ToolTip showDelay(Integer showDelay) {
        this.showDelay = showDelay;
        return this;
    }

    public ToolTip hideDelay(Integer hideDelay) {
        this.hideDelay = hideDelay;
        return this;
    }

    public ToolTip rendererMode(String rendererMode) {
        this.rendererMode = rendererMode;
        return this;
    }

    public ToolTip confine(Boolean confine) {
        this.confine = confine;
        return this;
    }

    public ToolTip appendToBody(Boolean appendToBody) {
        this.appendToBody = appendToBody;
        return this;
    }

    public ToolTip className(String className) {
        this.className = className;
        return this;
    }

    public ToolTip transitionDuration(Double transitionDuration) {
        this.transitionDuration = transitionDuration;
        return this;
    }

    public ToolTip formatter(String formatter) {
        this.formatter = formatter;
        return this;
    }

    public ToolTip valueFormatter(String valueFormatter) {
        this.valueFormatter = valueFormatter;
        return this;
    }

    public ToolTip textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    public ToolTip extraCssText(String extraCssText) {
        this.extraCssText = extraCssText;
        return this;
    }

    public ToolTip order(String order) {
        this.order = order;
        return this;
    }

//    public ToolTip position(Object position) {
//        this.position = position;
//        return this;
//    }
//
//    public ToolTip backgroundColor(Color backgroundColor) {
//        this.backgroundColor = backgroundColor;
//        return this;
//    }
//
//    public ToolTip borderColor(Color borderColor) {
//        this.borderColor = borderColor;
//        return this;
//    }
//
//    public ToolTip borderWidth(Double borderWidth) {
//        this.borderWidth = borderWidth;
//        return this;
//    }
//
//    public ToolTip padding(Double padding) {
//        this.padding = padding;
//        return this;
//    }





}
