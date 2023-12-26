package com.github.muskstark.echart.model;


import com.github.muskstark.echart.attribute.Title;
import com.github.muskstark.echart.enums.TypeOfChart;
import lombok.Data;

import java.io.Serializable;

@Data
public abstract class Charts implements Serializable {

    private Title title;

    /**
     * 根据输入的图表种类完成图表初始化
     *
     * Initializes the chart of the specified type.
     *
     * @param  chartType  the type of chart to initialize
     */
    public void initialize(TypeOfChart chartType){}

}
