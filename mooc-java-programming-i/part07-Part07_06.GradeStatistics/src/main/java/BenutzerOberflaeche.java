
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dennis Mayer
 */
public class BenutzerOberflaeche {
    
    private Statistics statistics;
    private Scanner scanner;
    
    public BenutzerOberflaeche(Statistics statistics, Scanner scanner){
        this.statistics = statistics;
        this.scanner = scanner;
        
    }
    public void start(){
        System.out.println("Enter point totals, -1 stops:");
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                break;
            }
            statistics.add(input);
        }
        System.out.println("Point average (all): " + statistics.average());
        if(statistics.passingGrade()== -1){
            System.out.println("Point average (passing):-");
        } else {
           System.out.println("Point average (passing):" + statistics.passingGrade());
        }
        System.out.println("Pass percentage:" + statistics.passPercentage());
        System.out.println("Grade distribution:");
        System.out.println("5:" + statistics.gradePrinter(statistics.gradeDistributor()[5]));
        System.out.println("4:" + statistics.gradePrinter(statistics.gradeDistributor()[4]));
        System.out.println("3:" + statistics.gradePrinter(statistics.gradeDistributor()[3]));
        System.out.println("2:" + statistics.gradePrinter(statistics.gradeDistributor()[2]));
        System.out.println("1:" + statistics.gradePrinter(statistics.gradeDistributor()[1]));
        System.out.println("0:" + statistics.gradePrinter(statistics.gradeDistributor()[0]));
        
        
        
        
    }
    
    
}
