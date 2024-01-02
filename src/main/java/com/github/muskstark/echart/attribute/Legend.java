package com.github.muskstark.echart.attribute;

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
    private Double zlevel;
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

}
