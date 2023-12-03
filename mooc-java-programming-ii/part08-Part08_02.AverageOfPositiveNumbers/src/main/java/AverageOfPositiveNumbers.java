
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float summe = 0;
        int counter = 0;
        float aver = 0;
        while (true) {
            float input = scanner.nextFloat();
            if (input == 0) {
                break;
            }
            if(input > 0){
                summe += input;
                counter++;
            }
            
        }
        if (summe != 0) {
            float avr = summe / counter;
            System.out.println(avr);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
