package com.github.muskstark.echart.enums;

import lombok.Getter;

@Getter
public enum EChartsExceptionsEnum {

    ECharts_Invalid_TypeError("方法传入的参数为不受支持的类型")
    ;
    private String message;

    private EChartsExceptionsEnum(String message) {
        this.message = message;
    }
}
