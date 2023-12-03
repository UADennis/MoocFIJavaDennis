
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dennis Mayer
 */
public class Statistics {

    ArrayList<Integer> points = new ArrayList<>();
    ArrayList<Integer> passingPoints = new ArrayList<>();

    public Statistics() {
        //TODO

    }

    public void add(int point) {
        if (point > 0 && point <= 100) {
            points.add(point);
            if (point >= 50) {
                passingPoints.add(point);
            }

        }

    }

    public double average() {

        int counter = 0;
        int sum = 0;
        for (int i : points) {
            counter++;
            sum += i;

        }
        return (double) sum / counter;
    }

    public double passingGrade() {
        int counter = 0;
        int sum = 0;
        if (passingPoints.isEmpty()) {
            return -1;
        }
        for (int i : passingPoints) {
            counter++;
            sum += i;
        }
        return (double) sum / counter;
    }

    public double passPercentage() {

        return (double) 100 * passingPoints.size() / points.size();
    }

    public int[] gradeDistributor() {
        int gradeCounterFail = 0;
        int gradeCounterOne = 0;
        int gradeCounterTwo = 0;
        int gradeCounterThree = 0;
        int gradeCounterFour = 0;
        int gradeCounterFive = 0;

        for (int i : points) {
            if (i < 50) {
                gradeCounterFail++;
            } else if (i < 60) {
                gradeCounterOne++;
            } else if (i < 70) {
                gradeCounterTwo++;
            } else if (i < 80) {
                gradeCounterThree++;
            } else if (i < 90) {
                gradeCounterFour++;
            } else {
                gradeCounterFive++;
            }
        }
        int arrOne[] = {gradeCounterFail, gradeCounterOne, gradeCounterTwo, gradeCounterThree, gradeCounterFour, gradeCounterFive};
        return arrOne;

    }

    public String gradePrinter(int e){
        String s = "";
        for(int i = 0; i < e; i++){
           s += "*";
        }
        return s;
    }
       
     
  
}
