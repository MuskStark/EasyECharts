package com.github.muskstark.echart.style.text;


import com.github.muskstark.echart.style.rich.Rich;
import lombok.Getter;

import java.awt.*;
import java.io.Serializable;

@Getter
public class TextStyle implements Serializable {
            private String color;
            private String fontStyle;
            private String fontWeight;
            private String fontFamily;
            private int fontSize;
            private int lineHeight;
            private int width;
            private int height;
            private String textBorderColor;
            private int textBorderWidth;
            private String textBorderType;
            private int textBorderDashOffset;
            private String textShadowColor;
            private int textShadowBlur;
            private int textShadowOffsetX;
            private int textShadowOffsetY;
            private String overflow;
            private String ellipsis;
            private Rich rich;

           public TextStyle color(String color) {
               this.color = color;
               return this;
           }

           public TextStyle fontStyle(String fontStyle) {
               this.fontStyle = fontStyle;
               return this;
           }

           public TextStyle fontWeight(String fontWeight) {
               this.fontWeight = fontWeight;
               return this;
           }

           public TextStyle fontFamily(String fontFamily) {
               this.fontFamily = fontFamily;
               return this;
           }

           public TextStyle fontSize(int fontSize) {
               this.fontSize = fontSize;
               return this;
           }

           public TextStyle lineHeight(int lineHeight) {
               this.lineHeight = lineHeight;
               return this;
           }

           public TextStyle width(int width) {
               this.width = width;
               return this;
           }

           public TextStyle height(int height) {
               this.height = height;
               return this;
           }

           public TextStyle textBorderColor(String textBorderColor) {
               this.textBorderColor = textBorderColor;
               return this;
           }

           public TextStyle textBorderWidth(int textBorderWidth) {
               this.textBorderWidth = textBorderWidth;
               return this;
           }

           public TextStyle textBorderType(String textBorderType) {
               this.textBorderType = textBorderType;
               return this;
           }

           public TextStyle textBorderDashOffset(int textBorderDashOffset) {
               this.textBorderDashOffset = textBorderDashOffset;
               return this;
           }

           public TextStyle textShadowColor(String textShadowColor) {
               this.textShadowColor = textShadowColor;
               return this;
           }

           public TextStyle textShadowBlur(int textShadowBlur) {
               this.textShadowBlur = textShadowBlur;
               return this;
           }

           public TextStyle textShadowOffsetX(int textShadowOffsetX) {
               this.textShadowOffsetX = textShadowOffsetX;
               return this;
           }

           public TextStyle textShadowOffsetY(int textShadowOffsetY) {
               this.textShadowOffsetY = textShadowOffsetY;
               return this;
           }

           public TextStyle overflow(String overflow) {
               this.overflow = overflow;
               return this;
           }

           public TextStyle ellipsis(String ellipsis) {
               this.ellipsis = ellipsis;
               return this;
           }

           public TextStyle rich(Rich rich) {
               this.rich = rich;
               return this;
           }


        }