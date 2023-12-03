
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        
        ArrayList<String> test = new ArrayList<>();
        
        System.out.println("Input numbers, type 'end' to stop.");
        
        while(true){
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            test.add(input);
        }
        
        long sum = test.stream().mapToLong(s -> Long.valueOf(s)).sum();
        long count = test.stream().mapToLong(s -> Long.valueOf(s)).count();
        
        System.out.println("average of the numbers: " + (double)sum/count);

    }
}
