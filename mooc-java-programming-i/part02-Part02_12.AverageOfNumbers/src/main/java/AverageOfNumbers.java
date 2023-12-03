
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zaehler = 0;
        int summe = 0;
        while(true){
            System.out.println("Give a number:");
            int eingabe = Integer.valueOf(scanner.nextLine());
            if(eingabe == 0 ){
                break;
            }
            summe += eingabe;
            zaehler++;
        }
        double average = (double)summe / (double)zaehler;
        System.out.println("Average of the numbers: " + average );

    }
}
