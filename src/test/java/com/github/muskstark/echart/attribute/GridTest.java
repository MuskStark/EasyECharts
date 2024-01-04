package com.github.muskstark.echart.attribute;

import org.junit.jupiter.api.Test;

class GridTest {

    @Test
    void testException(){
        Grid test = new Grid();
        test.left("new GridTest()");
        test.getLeft();
        System.out.println(test.getLeft().getClass());
    }

}