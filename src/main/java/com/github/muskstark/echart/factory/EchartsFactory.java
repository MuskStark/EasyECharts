package com.github.muskstark.echart.factory;


import com.github.muskstark.echart.enums.TypeOfChart;
import com.github.muskstark.echart.model.Charts;

/**
 * 通过TypeOfChart获取指定chart实体类
 */
public interface EchartsFactory {

    Charts createChart(TypeOfChart chartType);

}
