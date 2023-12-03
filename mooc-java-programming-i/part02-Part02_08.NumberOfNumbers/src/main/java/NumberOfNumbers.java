
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zaehler = 0;
        
        while(true){
            System.out.println("Give a number:");
            int zahl = Integer.valueOf(scanner.nextLine());
            if(zahl == 0 ){
                break;
            }
            zaehler += 1;
        }
        System.out.println("Number of numbers: " + zaehler);

    }
}
