
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
public class Frontend {
    
    public BirdDataBase base;
    public Scanner scan;
    
    public Frontend(){
        this.base = new BirdDataBase();
        this.scan = new Scanner(System.in);
    }
    
    public void start(){
        while(true){
            System.out.println("?");
            String input = scan.nextLine();
            if(input.equals("Quit")){
                break;
            } else if(input.equals("Add")){
                System.out.println("Name:");
                String name = scan.nextLine();
                System.out.println("Name in Latin:");
                String latin = scan.nextLine();
                base.add(name, latin);
            } else if(input.equals("Observation")){
                System.out.println("Bird?");
                String question = scan.nextLine();
                base.observe(question);
            } else if(input.equals("All")){
                base.printAll();
       
            } else if(input.equals("One")){
                String ask = scan.nextLine();
                base.printOne(ask);
            }
            
           
            
        }
    }
    
}
