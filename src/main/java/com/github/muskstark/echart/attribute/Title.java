package com.github.muskstark.echart.attribute;


import com.github.muskstark.echart.style.text.TextStyle;
import lombok.Getter;

import java.io.Serializable;

/**
 * Echarts表头属性
 */
@Getter
public class Title implements Serializable {
        private String id;
        private boolean show;
        private String text;
        private String link;
        private String target;
        private TextStyle textStyle;
        private String subtext;
        private String subLink;
        private String subTarget;
        private TextStyle subtextStyle;
        private String textAlign;
        private String textVerticalAlign;
        private boolean triggerEvent;
        private int[] padding;
        private int itemGap;
        private int zLevel;
        private int z;
        private String left;
        private String top;
        private String right;
        private String bottom;
        private String backgroundColor;
        private String borderColor;
        private int borderWidth;
        private int[] borderRadius;
        private int shadowBlur;
        private String shadowColor;
        private int shadowOffsetX;
        private int shadowOffsetY;

        public Title id(String id){
            this.id = id;
            return this;
        }

        public Title show(boolean show){
            this.show = show;
            return this;
        }

        public Title text(String text){
            this.text = text;
            return this;
        }

        public Title link(String link){
            this.link = link;
            return this;
        }

        public Title target(String target){
            this.target = target;
            return this;
        }

        public Title textStyle(TextStyle textStyle){
            this.textStyle = textStyle;
            return this;
        }

        public Title subtext(String subtext){
            this.subtext = subtext;
            return this;
        }

        public Title subLink(String subLink){
            this.subLink = subLink;
            return this;
        }

        public Title subTarget(String subTarget){
            this.subTarget = subTarget;
            return this;
        }

        public Title subtextStyle(TextStyle subtextStyle){
            this.subtextStyle = subtextStyle;
            return this;
        }

        public Title textAlign(String textAlign){
            this.textAlign = textAlign;
            return this;
        }

        public Title textVerticalAlign(String textVerticalAlign){
            this.textVerticalAlign = textVerticalAlign;
            return this;
        }

        public Title triggerEvent(boolean triggerEvent){
            this.triggerEvent = triggerEvent;
            return this;
        }

        public Title padding(int[] padding){
            this.padding = padding;
            return this;
        }

        public Title itemGap(int itemGap){
            this.itemGap = itemGap;
            return this;
        }

        public Title zLevel(int zLevel){
            this.zLevel = zLevel;
            return this;
        }

        public Title z(int z){
            this.z = z;
            return this;
        }

        public Title left(String left){
            this.left = left;
            return this;
        }

        public Title top(String top){
            this.top = top;
            return this;
        }

        public Title right(String right){
            this.right = right;
            return this;
        }

        public Title bottom(String bottom){
            this.bottom = bottom;
            return this;
        }

        public Title backgroundColor(String backgroundColor){
            this.backgroundColor = backgroundColor;
            return this;
        }

        public Title borderColor(String borderColor){
            this.borderColor = borderColor;
            return this;
        }

        public Title borderWidth(int borderWidth){
            this.borderWidth = borderWidth;
            return this;
        }

        public Title borderRadius(int[] borderRadius){
            this.borderRadius = borderRadius;
            return this;
        }

        public Title shadowBlur(int shadowBlur){
            this.shadowBlur = shadowBlur;
            return this;
        }

        public Title shadowColor(String shadowColor){
            this.shadowColor = shadowColor;
            return this;
        }

        public Title shadowOffsetX(int shadowOffsetX){
            this.shadowOffsetX = shadowOffsetX;
            return this;
        }

        public Title shadowOffsetY(int shadowOffsetY){
            this.shadowOffsetY = shadowOffsetY;
            return this;
        }


}
