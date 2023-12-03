
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
public class TextUI {
    
    private Scanner scan;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scan = scanner;
        this.dictionary = dictionary;
        
    }
    
    public void start(){
        
        while(true){
            System.out.println("Command:");
            String input = scan.nextLine();
            if(input.equals("end")){
                System.out.println("Bye bye!");
                break;
            }
            else if(input.equals("add")){
                System.out.println("Word:");
                String word = scan.nextLine();
                System.out.println("Translation:");
                String translation = scan.nextLine();
                dictionary.add(word, translation);
                
            }
            else if(input.equals("search")){
                System.out.println("To be translated:");
                String trans = scan.nextLine();
                if(dictionary.translate(trans)== null){
                    System.out.println("Word " + trans + " was not found" );
                }else{
                String awnser = dictionary.translate(trans);
                System.out.println(awnser);
                }
                
            }
            else{
                System.out.println("Unknown command");
            }
        }
    }
    
}
