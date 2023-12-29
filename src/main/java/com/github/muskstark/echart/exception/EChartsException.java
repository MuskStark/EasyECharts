package com.github.muskstark.echart.exception;

import com.github.muskstark.echart.enums.EChartsExceptionsEnum;

public class EChartsException extends RuntimeException {
    public EChartsException(EChartsExceptionsEnum exceptions) {
        super(exceptions.getMessage());
    }
}
