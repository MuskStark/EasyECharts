package com.github.muskstark.echart.model;


import com.github.muskstark.echart.attribute.Legend;
import com.github.muskstark.echart.attribute.Title;
import com.github.muskstark.echart.attribute.ToolTip;
import lombok.Data;

import java.io.Serializable;

@Data
public abstract class Charts implements Serializable {

    private Title title;

    private ToolTip toolTip;

    private Legend legend;

}
