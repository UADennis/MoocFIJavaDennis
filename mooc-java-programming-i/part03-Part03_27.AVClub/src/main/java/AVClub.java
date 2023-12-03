
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String input = scanner.nextLine();
            String[] pieces = input.split(" ");
            if(input.equals("")){
                break;
            }
            for(String stuck : pieces){
                if(stuck.contains("av")){
                    System.out.println(stuck);
                }
            }
            
        }


    }
}
