package com.github.muskstark.echart.model.bar;


import com.alibaba.fastjson2.annotation.JSONField;
import com.github.muskstark.echart.attribute.Title;
import com.github.muskstark.echart.attribute.ToolTip;
import com.github.muskstark.echart.attribute.axis.XAxis;
import com.github.muskstark.echart.attribute.axis.YAxis;
import com.github.muskstark.echart.attribute.series.BarSeries;
import com.github.muskstark.echart.enums.TypeOfChart;
import com.github.muskstark.echart.model.Charts;
import com.github.muskstark.echart.style.asix.AxisPointer;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@EqualsAndHashCode(callSuper = true)
@Data
public class BarChar extends Charts {

    @JSONField(name = "xAxis")
    private XAxis xAxis;
    @JSONField(name = "yAxis")
    private YAxis yAxis;
    private ToolTip toolTip;
    private List<BarSeries> series;

    @Override
    public void initialize(TypeOfChart chartType) {
        // initialize bar
        BarSeries series = new BarSeries();
        series.type(chartType.getType());
        this.setTitle(new Title());
        this.setXAxis(new XAxis());
        this.setYAxis(new YAxis());
        this.setSeries(new ArrayList<BarSeries>());
        this.addSeries(series);
        if(Objects.equals(chartType.getKindOfChart(),TypeOfChart.BAR_CHART.getKindOfChart())){
            this.defineTitle().show(false);
        }
        if(Objects.equals(chartType.getKindOfChart(), TypeOfChart.BAR_CHART_BASE.getKindOfChart())) {
            this.defineTitle().show(false);
            this.defineXAxis().type("category");
            this.defineYAxis().type("value");
        }
        if(Objects.equals(chartType.getKindOfChart(),TypeOfChart.BAR_CHART_AXIS_ALIGN_WITH_TICK.getKindOfChart())){
            this.defineToolTip()
                    .trigger("asix")
                    .axisPointer(
                            new AxisPointer()
                                    .type("shadow")
                    );
            this.defineXAxis()
                    .type("category");
            this.defineYAxis()
                    .type("value");
        }
    }

    public Title defineTitle() {
        return this.getTitle();
    }

    public XAxis defineXAxis() {
        return this.getXAxis();
    }

    public YAxis defineYAxis() {
        return this.getYAxis();
    }

    public ToolTip defineToolTip() {
        if (this.getToolTip() == null) {
            this.setToolTip(new ToolTip());
        }
        return this.getToolTip();
    }

    public BarSeries defineDefaultSeries() {
        return this.getSeries().get(0);
    }

    public void addSeries(BarSeries series) {
        this.getSeries().add(series);
    }
}
