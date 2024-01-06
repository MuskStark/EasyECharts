package com.github.muskstark.echart.attribute.series;


import com.github.muskstark.echart.style.background.BackgroundStyle;
import com.github.muskstark.echart.style.label.Label;
import lombok.Getter;

import java.util.List;

/**
 * 图标数据集对象
 */
@Getter
public abstract class Series {
    private String id;
    private String name;
    private String type;
    private String colorBy;
    private Boolean legendHoverLink;
    private String coordinateSystem;
    private Integer xAxisIndex;
    private Integer yAxisIndex;
    private Integer polarIndex;
    private Boolean roundCap;
    private Boolean realtimeSort;
    private Boolean showBackground;
    private BackgroundStyle backgroundStyle;
    private Label label;
    private Boolean clip;
    private Boolean large;
    private Integer largeThreshold;
    private Integer progressive;
    private Integer progressiveThreshold ;
    private String progressiveChunkMode;
    private String[] dimensions;
//    private Encode encode;
    private String seriesLayoutBy;
    private Integer datasetIndex;
    private String dataGroupId;
    private List<?> data;
    private Integer zLevel;
    private Integer z;
    private Boolean silent;
    private Boolean animation;
    private Integer animationThreshold;
    private Integer animationDuration;
    private String animationEasing;
    private Object animationDelay;
    private Object animationDurationUpdate;
    private String animationEasingUpdate;
    private Object animationDelayUpdate;
    private Object universalTransition;
//    private MarkPoint markPoint;
//    private MarkLine markLine;
//    private MarkArea markArea;
//    private Emphasis emphasis;
//    private Blur blur;
//    private Select select;
    private String cursor;
//    private Tooltip tooltip;

    public Series id(String id) {
        this.id = id;
        return this;
    }

    public Series name(String name) {
        this.name = name;
        return this;
    }

    public Series type(String type) {
        this.type = type;
        return this;
    }

    public Series colorBy(String colorBy) {
        this.colorBy = colorBy;
        return this;
    }

    public Series legendHoverLink(Boolean legendHoverLink) {
        this.legendHoverLink = legendHoverLink;
        return this;
    }

    public Series coordinateSystem(String coordinateSystem) {
        this.coordinateSystem = coordinateSystem;
        return this;
    }

    public Series xAxisIndex(Integer xAxisIndex) {
        this.xAxisIndex = xAxisIndex;
        return this;
    }

    public Series yAxisIndex(Integer yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
        return this;
    }

    public Series polarIndex(Integer polarIndex) {
        this.polarIndex = polarIndex;
        return this;
    }

    public Series roundCap(Boolean roundCap) {
        this.roundCap = roundCap;
        return this;
    }

    public Series realtimeSort(Boolean realtimeSort) {
        this.realtimeSort = realtimeSort;
        return this;
    }

    public Series showBackground(Boolean showBackground) {
        this.showBackground = showBackground;
        return this;
    }

    public Series backgroundStyle(BackgroundStyle backgroundStyle) {
        this.backgroundStyle = backgroundStyle;
        return this;
    }

    public Series label(Label label) {
        this.label = label;
        return this;
    }

    public Series clip(Boolean clip) {
        this.clip = clip;
        return this;
    }

    public Series large(Boolean large) {
        this.large = large;
        return this;
    }

    public Series largeThreshold(Integer largeThreshold) {
        this.largeThreshold = largeThreshold;
        return this;
    }

    public Series progressive(Integer progressive) {
        this.progressive = progressive;
        return this;
    }

    public Series progressiveThreshold(Integer progressiveThreshold) {
        this.progressiveThreshold = progressiveThreshold;
        return this;
    }

    public Series progressiveChunkMode(String progressiveChunkMode) {
        this.progressiveChunkMode = progressiveChunkMode;
        return this;
    }

    public Series dimensions(String[] dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public Series data(List<?> data) {
        this.data = data;
        return this;
    }




}
