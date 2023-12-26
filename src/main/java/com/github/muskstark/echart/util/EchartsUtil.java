package com.github.muskstark.echart.util;

import com.alibaba.fastjson2.JSON;

public  class EchartsUtil {

    public static String toJson(Object obj) {
        return JSON.toJSONString(obj);
    }

}
