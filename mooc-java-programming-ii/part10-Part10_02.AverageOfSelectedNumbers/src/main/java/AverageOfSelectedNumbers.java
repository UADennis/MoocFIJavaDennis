
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> eingaben = new ArrayList<>();
        System.out.println("Input numbers, type 'end' to stop.");
        
        while (true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            
            eingaben.add(input);
        }
        System.out.println("Print the average of the negative or the positive numbers? (n/p)");
        String choice = scanner.nextLine();
        
        if(choice.equals("n")){
            System.out.println("Average of the negative numbers: " + eingaben.stream().mapToDouble(s -> Double.valueOf(s)).filter(s -> s < 0).average().getAsDouble());
        }
        
        if(choice.equals("p")){
            System.out.println("Average of the positive numbers: " + eingaben.stream().mapToDouble(s -> Double.valueOf(s)).filter(s -> s > 0).average().getAsDouble());
        }
        
        
        
        

    }
}
