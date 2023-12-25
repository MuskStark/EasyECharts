package com.github.muskstark.echart.attribute.axis;

import com.github.muskstark.echart.style.asix.*;
import lombok.Getter;

import java.io.Serializable;
import java.util.List;

/**
 * 坐标轴公共属性
 */
@Getter
public abstract class Axis implements Serializable {

    private String id;
    private Boolean show;
    private Integer gridIndex;
    private Boolean alignTicks;
    private String position;
    private Integer offset;
    private String type;
    private String name;
    private String nameLocation;
    private NameTextStyle nameTextStyle;
    private Integer nameGap;
    private Integer nameRotate;
    private Boolean inverse;
    private Object boundaryGap;
    private Integer min;
    private Integer max;
    private Boolean scale;
    private Integer splitInteger;
    private Integer minInterval;
    private Integer maxInterval;
    private Integer interval;
    private Integer logBase;
    private Boolean silent;
    private Boolean triggerEvent;
    private AxisLine axisLine;
    private AxisTick axisTick;
    private MinorTick minorTick;
    private AxisLabel axisLabel;
    private SplitLine splitLine;
    private MinorSplitLine minorSplitLine;
    private SplitArea splitArea;
    private List<String> data;
    private AxisPointer axisPointer;
    private Boolean animation;
    private Integer animationThreshold;
    private Integer animationDuration;
    private String animationEasing;
    private Integer animationDelay;
    private Integer animationDurationUpdate;
    private String animationEasingUpdate;
    private Integer animationDelayUpdate;
    private Integer zLevel;
    private Integer z;

    public Axis id(String id) {
        this.id = id;
        return this;
    }

    public Axis show(Boolean show) {
        this.show = show;
        return this;
    }

    public Axis gridIndex(Integer gridIndex) {
        this.gridIndex = gridIndex;
        return this;
    }

    public Axis alignTicks(Boolean alignTicks) {
        this.alignTicks = alignTicks;
        return this;
    }

    public Axis position(String position) {
        this.position = position;
        return this;
    }

    public Axis offset(Integer offset) {
        this.offset = offset;
        return this;
    }

    public Axis type(String type) {
        this.type = type;
        return this;
    }

    public Axis name(String name) {
        this.name = name;
        return this;
    }

    public Axis nameLocation(String nameLocation) {
        this.nameLocation = nameLocation;
        return this;
    }

    public Axis nameTextStyle(NameTextStyle nameTextStyle) {
        this.nameTextStyle = nameTextStyle;
        return this;
    }

    public Axis nameGap(Integer nameGap) {
        this.nameGap = nameGap;
        return this;
    }

    public Axis nameRotate(Integer nameRotate) {
        this.nameRotate = nameRotate;
        return this;
    }

    public Axis inverse(Boolean inverse) {
        this.inverse = inverse;
        return this;
    }

    public Axis boundaryGap(Object boundaryGap) {
        this.boundaryGap = boundaryGap;
        return this;
    }

    public Axis min(Integer min) {
        this.min = min;
        return this;
    }

    public Axis max(Integer max) {
        this.max = max;
        return this;
    }

    public Axis scale(Boolean scale) {
        this.scale = scale;
        return this;
    }

    public Axis splitInteger(Integer splitInteger) {
        this.splitInteger = splitInteger;
        return this;
    }

    public Axis minInterval(Integer minInterval) {
        this.minInterval = minInterval;
        return this;
    }

    public Axis maxInterval(Integer maxInterval) {
        this.maxInterval = maxInterval;
        return this;
    }

    public Axis interval(Integer interval) {
        this.interval = interval;
        return this;
    }

    public Axis logBase(Integer logBase) {
        this.logBase = logBase;
        return this;
    }

    public Axis silent(Boolean silent) {
        this.silent = silent;
        return this;
    }

    public Axis triggerEvent(Boolean triggerEvent) {
        this.triggerEvent = triggerEvent;
        return this;
    }

    public Axis axisLine(AxisLine axisLine) {
        this.axisLine = axisLine;
        return this;
    }

    public Axis axisTick(AxisTick axisTick) {
        this.axisTick = axisTick;
        return this;
    }

    public Axis minorTick(MinorTick minorTick) {
        this.minorTick = minorTick;
        return this;
    }

    public Axis axisLabel(AxisLabel axisLabel) {
        this.axisLabel = axisLabel;
        return this;
    }

    public Axis splitLine(SplitLine splitLine) {
        this.splitLine = splitLine;
        return this;
    }

    public Axis minorSplitLine(MinorSplitLine minorSplitLine) {
        this.minorSplitLine = minorSplitLine;
        return this;
    }

    public Axis splitArea(SplitArea splitArea) {
        this.splitArea = splitArea;
        return this;
    }

    public Axis data(List data) {
        this.data = data;
        return this;
    }

    public Axis axisPointer(AxisPointer axisPointer) {
        this.axisPointer = axisPointer;
        return this;
    }

    public Axis animation(Boolean animation) {
        this.animation = animation;
        return this;
    }

    public Axis animationThreshold(Integer animationThreshold) {
        this.animationThreshold = animationThreshold;
        return this;
    }

    public Axis animationDuration(Integer animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public Axis animationEasing(String animationEasing) {
        this.animationEasing = animationEasing;
        return this;
    }

    public Axis animationDelay(Integer animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    public Axis animationDurationUpdate(Integer animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    public Axis animationEasingUpdate(String animationEasingUpdate) {
        this.animationEasingUpdate = animationEasingUpdate;
        return this;
    }

    public Axis animationDelayUpdate(Integer animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    public Axis zLevel(Integer zIndex) {
        this.zLevel = zIndex;
        return this;
    }

    public Axis z(Integer z) {
        this.z = z;
        return this;
    }




}
