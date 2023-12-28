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

    public Grid right(Object right) {
        if(right instanceof String || right instanceof Double){
            this.right = right;
        }else {
            throw new RuntimeException(right.getClass() + "不受支持的类型");
        }
        return this;
    }

    public Grid top(Object top) {
        if(top instanceof String || top instanceof Double){
            this.top = top;
        }else {
            throw new RuntimeException(top.getClass() + "不受支持的类型");
        }
        return this;
    }

    public Grid bottom(Object bottom) {
        if(bottom instanceof String || bottom instanceof Double){
            this.bottom = bottom;
        }else {
            throw new RuntimeException(bottom.getClass() + "不受支持的类型");
        }
        return this;
    }

    public Grid height(Object height) {
        if(height instanceof String || height instanceof Double){
            this.height = height;
        }else {
            throw new RuntimeException(height.getClass() + "不受支持的类型");
        }
        return this;
    }

    public Grid width(Object width) {
        if(width instanceof String || width instanceof Double){
            this.width = width;
        }else {
            throw new RuntimeException(width.getClass() + "不受支持的类型");
        }
        return this;
    }

    public Grid containLabel(Boolean containLabel) {
        this.containLabel = containLabel;
        return this;
    }

    public Grid backgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }


}
