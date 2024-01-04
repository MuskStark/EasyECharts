# 一、在Maven项目中引用该项目
```xml
<dependency>
  <groupId>io.github.muskstark</groupId>
  <artifactId>easyecharts</artifactId>
  <version>{{last version}}</version>
</dependency>
```
# 二、快速使用
## 1.获取图标实体类
EasyECharts通过使用对应的图表工厂来创建相应图表实体类：
```java
 BarChar chart = BarChartFactory.createChart(TypeOfBarChart.BAR_CHART);
```
通过对应的工厂类提供的createChart方法并向方法传入对应图表的TypeOfXXChart枚举类，可以帮助用户完成对应图表所需属性的装配。
> #### 兼容性提醒
> 因在**0.0.3**版本及后续版本中对工厂类和枚举类均做出较大修改，因此之前版本中的 **new XXXChartFactory，TypeOfChart**在升级0.0.3版本后将不再被兼容。

:::success
可以通过XXChartFactory创建目前EasyECharts项目所支持的图表类型，相关介绍请参考：[EasyECharts支持的图表种类](https://www.yuque.com/phoebej/yfqw7q/vp7g5ro0hhgsohaq)
:::
## 2.配置图表属性
在获取到对应图表的实体类可以通过defineXXX方法来对已装配好的属性进行配置。具体属性配置方法请参考[ECharts配置项手册](https://echarts.apache.org/zh/option.html#title)。
```java
BarChar chart = BarChartFactory.createChart(TypeOfBarChart.BAR_CHART_BASE);
chart.defineXAxis().id("1")
	.alignTicks(true);
chart.defineYAxis()
	.id("2");
chart.defineTitle()
	.show(true);
```
## 3.通过EchartsUtil完成序列化
> 本项目通过集成FastJson2，实现图表对象序列化。如您使用的时SpringBoot，也可以通过其集成的Jaskson来实现该步骤。

```java
String json = EchartsUtil.toJson(chart);
```
```json
{
  "legend": {},
  "series": [
    {
      "type": "bar"
    }
  ],
  "title": {
    "show": true
  },
  "xAxis": {
    "alignTicks": true,
    "id": "1",
    "type": "category"
  },
  "yAxis": {
    "id": "2",
    "type": "value"
  }
}
```
完成序列化后将Json字符串返回给前端。
## 4.前端接收图表JSON并展示图表
以Vue3为例。标准Html方法详见[Apache ECharts快速上手](https://echarts.apache.org/handbook/zh/get-started/)
```html
<script setup>
import {onMounted} from "vue";
import * as echarts from "echarts";
import axios from "axios";

let option;

onMounted(() => {
  axios.get("/getChart").then((response) => {
    const json = response.data;
    if(json.status){
      option = json.data;
      const chartDom = document.getElementById('workingChart');
      const myChart = echarts.init(chartDom);
      window.addEventListener("resize", () => {
        myChart.resize();
      });
      option && myChart.setOption(option);
    }
  })

})
</script>

<template>
  <div id="workingChart"/>
</template>

<style scoped>
#workingChart {
  width: 100%;
  height: 100%;
}
</style>
```

