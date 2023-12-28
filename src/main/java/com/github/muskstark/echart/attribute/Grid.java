package com.github.muskstark.echart.attribute;

import lombok.Getter;

import java.io.Serializable;

/**
 * 直角坐标系内绘图网格
 *
 */
@Getter
public class Grid implements Serializable {

    private String id;
    private Boolean show;
    private Double zLevel;
    private Double z;
    private Object left;
    private Object right;
    private Object top;
    private Object bottom;
    private Object height;
    private Object width;
    private Boolean containLabel;
    private String backgroundColor;


    public Grid id(String id) {
        this.id = id;
        return this;
    }

    public Grid show(Boolean show) {
        this.show = show;
        return this;
    }

    public Grid zLevel(Double zLevel) {
        this.zLevel = zLevel;
        return this;
    }

    public Grid z(Double z) {
        this.z = z;
        return this;
    }

    public Grid left(Object left) {
        if(left instanceof String || left instanceof Double){
            this.left = left;
        }else {
            throw new RuntimeException(left.getClass() + "不受支持的类型");
        }

        return this;
    }

}
