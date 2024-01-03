package com.github.muskstark.echart.attribute;

import com.github.muskstark.echart.enums.EChartsExceptionsEnum;
import com.github.muskstark.echart.exception.EChartsException;
import com.github.muskstark.echart.style.line.LineStyle;
import com.github.muskstark.echart.style.text.TextStyle;
import lombok.Getter;

import java.util.List;

/**
 * Legend for charts
 */
@Getter
public class Legend {

    private String type;
    private String id;
    private Boolean show;
    private Double zLevel;
    private Double z;
    private Object left;
    private Object top;
    private Object right;
    private Object bottom;
    private Object width;
    private Object height;
    private String orient;
    private String align;
    private Integer[] padding;
    private Double itemGap;
    private Double itemWidth;
    private Double itemHeight;
//    private ItemStyle itemStyle;
    private LineStyle lineStyle;
    private Object symbolRotate;
    private String formatter;
    private Boolean selectedMode;
    private String inactiveColor;
    private String inactiveBorderColor;
    private String inactiveBorderWidth;
    private Object selected;
    private TextStyle textStyle;
    private ToolTip tooltip;
    private String icon;
    private List<Object> data;
    private String backgroundColor;
    private String borderColor;
    private Double borderWidth;
    private Integer[] borderRadius;
    private Double shadowBlur;
    private String shadowColor;
    private Double shadowOffsetX;
    private Double shadowOffsetY;
    private Double scrollDataIndex;
    private Double pageButtonItemGap;
    private Double pageButtonGap;
    private String pageButtonPosition;
    private String pageFormatter;
//    private PageIcons pageIcons;
    private String pageIconColor;
    private String pageIconInactiveColor;
    private Integer[] pageIconSize;
//    private TextStyle pageTextStyle;
    private Boolean animation;
    private Double animationDurationUpdate;
//    private Object emphasis;
    private Boolean[] selector;
//    private SelectorLabel selectorLabel;
    private String selectorPosition;
    private Integer selectorItemGap;
    private Integer selectorButtonGap;

    public Legend type(String type){
        this.type = type;
        return this;
    }

    public Legend id(String id){
        this.id = id;
        return this;
    }

    public Legend show(Boolean show){
        this.show = show;
        return this;
    }

    public Legend zLevel(Double zLevel){
        this.zLevel = zLevel;
        return this;
    }

    public Legend z(Double z){
        this.z = z;
        return this;
    }

    public Legend left(Object left){
        if(left instanceof String || left instanceof Double){
            this.left = left;
        }else {
            throw new EChartsException(EChartsExceptionsEnum.ECharts_Invalid_TypeError);
        }
        return this;
    }

    public Legend top(Object top){
        if(top instanceof String || top instanceof Double){
            this.top = top;
        }else {
            throw new EChartsException(EChartsExceptionsEnum.ECharts_Invalid_TypeError);
        }
        return this;
    }

    public Legend right(Object right){
        if(right instanceof String || right instanceof Double){
            this.right = right;
        }else {
            throw new EChartsException(EChartsExceptionsEnum.ECharts_Invalid_TypeError);
        }
        return this;
    }

    public Legend bottom(Object bottom){
        if(bottom instanceof String || bottom instanceof Double){
            this.bottom = bottom;
        }else {
            throw new EChartsException(EChartsExceptionsEnum.ECharts_Invalid_TypeError);
        }
        return this;
    }

    public Legend width(Object width){
        if(width instanceof String || width instanceof Double){
            this.width = width;
        }else {
            throw new EChartsException(EChartsExceptionsEnum.ECharts_Invalid_TypeError);
        }
        return this;
    }

    public Legend height(Object height){
        if(height instanceof String || height instanceof Double){
            this.height = height;
        }else {
            throw new EChartsException(EChartsExceptionsEnum.ECharts_Invalid_TypeError);
        }
        return this;
    }

    public Legend orient(String orient){
        this.orient = orient;
        return this;
    }



}
