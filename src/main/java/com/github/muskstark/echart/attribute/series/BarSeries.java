package com.github.muskstark.echart.attribute.series;


import lombok.Getter;

@Getter
public class BarSeries extends Series {

    private String barWidth;
    private String barMaxWidth;
    private Integer barMinWidth;
    private Integer barMinHeight;
    private Integer barMinAngle;
    private String barGap;
    private String barCategoryGap;

    public BarSeries defineBarWidth(String barWidth){
        this.barWidth = barWidth;
        return this;
    }

    public BarSeries defineBarMaxWidth(String barMaxWidth){
        this.barMaxWidth = barMaxWidth;
        return this;
    }
    public BarSeries defineBarMinWidth(Integer barMinWidth){
        this.barMinWidth = barMinWidth;
        return this;
    }

    public BarSeries defineBarMinHeight(Integer barMinHeight){
        this.barMinHeight = barMinHeight;
        return this;
    }

    public BarSeries defineBarMinAngle(Integer barMinAngle){
        this.barMinAngle = barMinAngle;
        return this;
    }

    public BarSeries defineBarGap(String barGap){
        this.barGap = barGap;
        return this;
    }

    public BarSeries defineBarCategoryGap(String barCategoryGap){
        this.barCategoryGap = barCategoryGap;
        return this;
    }







}
