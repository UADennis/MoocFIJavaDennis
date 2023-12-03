package application;

import java.util.HashMap;
import java.util.Map;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        
        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Ranking");
        XYChart.Series data = new XYChart.Series();
        data.setName("University of Helsinki");
        
        Map<Integer, Integer> yearHashMap = new HashMap<>();

        // Adding key-value pairs
        yearHashMap.put(2007, 73);
        yearHashMap.put(2008, 68);
        yearHashMap.put(2009, 72);
        yearHashMap.put(2010, 72);
        yearHashMap.put(2011, 74);
        yearHashMap.put(2012, 73);
        yearHashMap.put(2013, 76);
        yearHashMap.put(2014, 73);
        yearHashMap.put(2015, 67);
        yearHashMap.put(2016, 56);
        yearHashMap.put(2017, 56);
        
        yearHashMap.entrySet().forEach(pair -> {data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));});
        
        NumberAxis xAxis = new NumberAxis(yearHashMap.keySet().stream().min(Integer::compareTo).get(),yearHashMap.keySet().stream().max(Integer::compareTo).get(),1);
        xAxis.setLabel("Year");
        
       
        LineChart ratingChart = new LineChart(xAxis,yAxis);
        ratingChart.getData().add(data);
        
        Scene test = new Scene(ratingChart);
        stage.setScene(test);
        stage.show();
        
        
    }

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
        System.out.println("Hello world!");
    }

}
