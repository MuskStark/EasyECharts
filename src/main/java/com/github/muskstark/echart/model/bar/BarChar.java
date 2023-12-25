package com.github.muskstark.echart.model.bar;


import com.alibaba.fastjson2.annotation.JSONField;
import com.github.muskstark.echart.attribute.Title;
import com.github.muskstark.echart.attribute.axis.XAxis;
import com.github.muskstark.echart.attribute.axis.YAxis;
import com.github.muskstark.echart.attribute.series.BarSeries;
import com.github.muskstark.echart.model.Charts;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class BarChar extends Charts {

    @JSONField(name = "xAxis")
    private XAxis xAxis;
    @JSONField(name = "yAxis")
    private YAxis yAxis;
    private List<BarSeries> series;

    @Override
    public void initialize(String type) {
        Title title = new Title();
        XAxis xAxis = new XAxis();
        YAxis yAxis = new YAxis();
        title.show(false);
        this.setTitle(title);
        this.setXAxis(xAxis);
        this.setYAxis(yAxis);
        this.setSeries(new ArrayList<BarSeries>());
    }

    public Title defineTitle() {
        return this.getTitle();
    }

    public XAxis defineXAxis() {
        return this.xAxis;
    }

    public YAxis defineYAxis() {
        return this.yAxis;
    }

    public void defineSeries(BarSeries series) {
        this.series.add(series);
    }
}
