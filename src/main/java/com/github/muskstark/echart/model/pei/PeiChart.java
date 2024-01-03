package com.github.muskstark.echart.model.pei;

import com.github.muskstark.echart.attribute.series.PieSeries;
import com.github.muskstark.echart.model.Charts;
import lombok.Getter;

import java.util.List;

@Getter
public class PeiChart extends Charts {

    private List<PieSeries> pieSeries;

    public PieSeries defineDefaultPieSeries(){
        return this.pieSeries.get(0);
    }

    public void addPieSeries(PieSeries pieSeries){
        this.pieSeries.add(pieSeries);
    }


}
