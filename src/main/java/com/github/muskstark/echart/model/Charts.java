package com.github.muskstark.echart.model;


import com.github.muskstark.echart.attribute.Title;
import lombok.Data;

import java.io.Serializable;

@Data
public abstract class Charts implements Serializable {

    private Title title;

    public void initialize(String type) {

    }

}
