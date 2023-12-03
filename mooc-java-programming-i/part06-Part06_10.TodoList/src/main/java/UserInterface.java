
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
public class UserInterface {
    private TodoList list;
    private Scanner scan;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scan = scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("Command: ");
            String input = scan.nextLine();
            if(input.equals("stop")){
                break;
            }
            else if(input.equals("add")){
                System.out.println("To add: ");
                String addTO = scan.nextLine();
                this.list.add(addTO);
            }
            else if(input.equals("list")){
                this.list.print();
            }
            else if(input.equals("remove")){
                System.out.println("Which one is removed?");
                int userIn = Integer.valueOf(scan.nextLine());
                this.list.remove(userIn);
                
            }
        }
    }
    
}
