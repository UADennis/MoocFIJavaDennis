
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zaehlerPositiv = 0;
        int zaehlerNegativ = 0;

        while (true) {
            System.out.println("Give a number:");
            int zahl = Integer.valueOf(scanner.nextLine());
            if (zahl == 0) {
                break;
            }

            zaehlerNegativ += 1;
            zaehlerPositiv += zahl;

        }
        System.out.println("Number of numbers: " + zaehlerNegativ);
        System.out.println("Sum of the numbers: " + zaehlerPositiv);

    }
}
