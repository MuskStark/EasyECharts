package com.github.muskstark.echart.exception;

import com.github.muskstark.echart.attribute.Grid;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class EChartsExceptionTest {

    @Test
    void gridExceptionTest(){
        Grid test = new Grid();
        test.left(new HashMap<>());
        test.getLeft();
        System.out.println(test.getLeft().getClass());
    }

}