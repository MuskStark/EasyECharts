# 一、在Maven项目中引用该项目
```xml
<dependency>
  <groupId>io.github.muskstark</groupId>
  <artifactId>easyecharts</artifactId>
  <version>0.0.1</version>
</dependency>
```
# 二、快速使用
## 1.获取图标实体类
EasyECharts通过使用对应的图表工厂来创建相应图表实体类：
```java
BarChartFactory factory = new BarChartFactory();
BarChar chart = factory.createChart();
```
通过对应的工厂类提供的createCHart方法，可以帮助用户完成对应图表所需属性的装配。
```java
public void initialize(String type) {
    Title title = new Title();
    XAxis xAxis = new XAxis();
    YAxis yAxis = new YAxis();
    title.show(false);
    this.setTitle(title);
    this.setXAxis(xAxis);
    this.setYAxis(yAxis);
    this.setSeries(new ArrayList<BarSeries>());
}
```
## 2.配置图表属性
在获取到对应图表的实体类可以通过defineXXX方法来对已装配好的属性进行配置。具体属性配置方法请参考[ECharts配置项手册](https://echarts.apache.org/zh/option.html#title)。
```java
chart.defineTitle()
        .backgroundColor("black")
        .text("test")
        .show(true);
chart.defineXAxis()
        .id("1")
        .type("category")
        .alignTicks(true);
chart.defineYAxis()
        .id("2")
        .type("value")
        .animationThreshold(1);
```

