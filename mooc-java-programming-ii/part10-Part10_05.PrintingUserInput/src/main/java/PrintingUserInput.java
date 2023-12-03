
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> eingaben = new ArrayList<>();
        
        while(true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            eingaben.add(input);
        }
        
        eingaben.forEach(s -> System.out.println(s));
            
            

    }
}
