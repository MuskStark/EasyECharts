package com.github.muskstark.echart.model.bar;

import com.github.muskstark.echart.factory.BarChartFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BarCharTest {

    @Test
    public void createBarCharTest() {
        BarChartFactory factory = new BarChartFactory();
        BarChar chart = factory.createChart();
        System.out.println(chart.toString());
    }

}