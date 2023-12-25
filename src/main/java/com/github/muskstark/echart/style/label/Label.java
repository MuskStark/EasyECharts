package com.github.muskstark.echart.style.label;

import lombok.Getter;

/**
 * 标签样式
 */
@Getter
public class Label {

    private boolean show;
    private int distance;
    private int rotate;

    public Label defineShow(boolean show){
        this.show = show;
        return this;
    }

    public Label defineDistance(int distance){
        this.distance = distance;
        return this;
    }

    public Label defineRotate(int rotate){
        this.rotate = rotate;
        return this;
    }
    

}
