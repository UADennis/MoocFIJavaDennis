
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zaehler = 0;
        int summe = 0;
        while (true) {
            int eingabe = Integer.valueOf(scanner.nextLine());
            if (eingabe == 0) {
                if (summe == 0) {
                    System.out.println("Cannot calculate the average");
                }
                break;
            }
            if (!(eingabe < 0)) {
                summe += eingabe;
                zaehler++;
            }
            if (summe < 0) {
                System.out.println("Cannot calculate the average");
                break;
            }

        }
        double average = (double) summe / (double) zaehler;
        System.out.println(average);

    }
}
