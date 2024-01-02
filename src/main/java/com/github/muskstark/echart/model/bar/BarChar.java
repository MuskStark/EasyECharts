package com.github.muskstark.echart.model.bar;


import com.alibaba.fastjson2.annotation.JSONField;
import com.github.muskstark.echart.attribute.Legend;
import com.github.muskstark.echart.attribute.Title;
import com.github.muskstark.echart.attribute.ToolTip;
import com.github.muskstark.echart.attribute.axis.XAxis;
import com.github.muskstark.echart.attribute.axis.YAxis;
import com.github.muskstark.echart.attribute.series.BarSeries;
import com.github.muskstark.echart.model.Charts;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.util.List;



@EqualsAndHashCode(callSuper = true)
@Data
public class BarChar extends Charts {

    @JSONField(name = "xAxis")
    private XAxis xAxis;
    @JSONField(name = "yAxis")
    private YAxis yAxis;
    private List<BarSeries> series;


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

    public Legend defineLegend() {
        return this.getLegend();
    }

    public void addSeries(BarSeries series) {
        this.getSeries().add(series);
    }
}
