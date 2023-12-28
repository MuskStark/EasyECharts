package com.github.muskstark.echart.style.asix;


import com.github.muskstark.echart.style.line.LineStyle;
import lombok.Getter;

/**
 * 坐标轴轴线设置
 */
@Getter
public class AxisLine {
    private Boolean show;
    private Boolean onZero;
    private Number onZeroAxisIndex;
    private Object symbol;
    private Number[] symbolSize;
    private Number[] symbolOffset;
    private LineStyle lineStyle;

    public AxisLine show(boolean show){
        this.show = show;
        return this;
    }
    public AxisLine onZero(boolean onZero){
        this.onZero = onZero;
        return this;
    }
    public AxisLine onZeroAxisIndex(int onZeroAxisIndex){
        this.onZeroAxisIndex = onZeroAxisIndex;
        return this;
    }
    public AxisLine symbol(Object symbol){
        this.symbol = symbol;
        return this;
    }
    public AxisLine symbolSize(Number[] symbolSize){
        this.symbolSize = symbolSize;
        return this;
    }
    public AxisLine symbolOffset(Number[] symbolOffset){
        this.symbolOffset = symbolOffset;
        return this;
    }
    public AxisLine lineStyle(LineStyle lineStyle){
        this.lineStyle = lineStyle;
        return this;
    }

}
