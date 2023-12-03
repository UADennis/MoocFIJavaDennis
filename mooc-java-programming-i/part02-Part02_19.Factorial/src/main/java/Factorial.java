
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        int counter = 1;
        int result = 1;
        while(counter <= number){                                
            result *= counter;
            counter++;
            
        }
        System.out.println("Factorial: " + result);

    }
}
