package com.github.muskstark.echart.attribute.series;

import com.github.muskstark.echart.attribute.Grid;
import com.github.muskstark.echart.enums.EChartsExceptionsEnum;
import com.github.muskstark.echart.exception.EChartsException;
import lombok.Getter;

@Getter
public class PieSeries {

    private Double geoIndex;
    private Double calendarIndex;
    private Boolean selectedMode;
    private Double selectedOffset;
    private Boolean clockwise;
    private Double startAngle;
    private String minAngle;
    private Boolean minShowLabelAngle;
    private Object roseType;
    private Boolean avoidLabelOverlap;
    private Boolean stillShowZeroSum;
    private Double percentPrecision;
    private String cursor;
    private Object left;
    private Object right;
    private Object top;
    private Object bottom;
    private Object height;
    private Object width;
    private Boolean showEmptyCircle;




    public PieSeries geoIndex(Double geoIndex){
        this.geoIndex = geoIndex;
        return this;
    }

    public PieSeries calendarIndex(Double calendarIndex){
        this.calendarIndex = calendarIndex;
        return this;
    }

    public PieSeries selectedMode(Boolean selectedMode){
        this.selectedMode = selectedMode;
        return this;
    }

    public PieSeries selectedOffset(Double selectedOffset){
        this.selectedOffset = selectedOffset;
        return this;
    }

    public PieSeries clockwise(Boolean clockwise){
        this.clockwise = clockwise;
        return this;
    }

    public PieSeries startAngle(Double startAngle){
        this.startAngle = startAngle;
        return this;
    }

    public PieSeries minAngle(String minAngle){
        this.minAngle = minAngle;
        return this;
    }

    public PieSeries minShowLabelAngle(Boolean minShowLabelAngle){
        this.minShowLabelAngle = minShowLabelAngle;
        return this;
    }

    public PieSeries roseType(Object roseType){
        if(!(roseType instanceof String) || !(roseType instanceof Boolean)){
            throw new EChartsException(EChartsExceptionsEnum.ECharts_Invalid_TypeError);
        }
        this.roseType = roseType;
        return this;
    }

    public PieSeries avoidLabelOverlap(Boolean avoidLabelOverlap){
        this.avoidLabelOverlap = avoidLabelOverlap;
        return this;
    }

    public PieSeries stillShowZeroSum(Boolean stillShowZeroSum){
        this.stillShowZeroSum = stillShowZeroSum;
        return this;
    }

    public PieSeries percentPrecision(Double percentPrecision){
        this.percentPrecision = percentPrecision;
        return this;
    }

    public PieSeries cursor(String cursor){
        this.cursor = cursor;
        return this;
    }

    public PieSeries left(Object left) {
        if(left instanceof String || left instanceof Double){
            this.left = left;
        }else {
            throw new EChartsException(EChartsExceptionsEnum.ECharts_Invalid_TypeError);
        }
        return this;
    }

    public PieSeries right(Object right) {
        if(right instanceof String || right instanceof Double){
            this.right = right;
        }else {
            throw new EChartsException(EChartsExceptionsEnum.ECharts_Invalid_TypeError);
        }
        return this;
    }

    public PieSeries top(Object top){
        if(top instanceof String || top instanceof Double){
            this.top = top;
        }else {
            throw new EChartsException(EChartsExceptionsEnum.ECharts_Invalid_TypeError);
        }
        return this;
    }

    public PieSeries bottom(Object bottom){
        if(bottom instanceof String || bottom instanceof Double){
            this.bottom = bottom;
        }else {
            throw new EChartsException(EChartsExceptionsEnum.ECharts_Invalid_TypeError);
        }
        return this;
    }

    public PieSeries height(Object height){
        if(height instanceof String || height instanceof Double){
            this.height = height;
        }else {
            throw new EChartsException(EChartsExceptionsEnum.ECharts_Invalid_TypeError);
        }
        return this;
    }

    public PieSeries width(Object width) {
        if(width instanceof String || width instanceof Double){
            this.width = width;
        }else {
            throw new EChartsException(EChartsExceptionsEnum.ECharts_Invalid_TypeError);
        }
        return this;
    }

    public PieSeries showEmptyCircle(Boolean showEmptyCircle){
        this.showEmptyCircle = showEmptyCircle;
        return this;
    }
}
