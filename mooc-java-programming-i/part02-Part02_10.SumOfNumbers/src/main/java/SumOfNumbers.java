
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zaehler = 0;
        while (true) {
            System.out.println("Give a number:");
            int zahl = Integer.valueOf(scanner.nextLine());
            if (zahl == 0) {
                break;
            }
            
            zaehler += zahl;

        }
        System.out.println("Sum of the numbers: " + zaehler);

    }
}
