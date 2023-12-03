
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number ?");
        int counter = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int n = Integer.valueOf(scanner.nextLine());
        int result = 0;
        while (counter <= n) {
            result += counter;
            counter++;
        }
        System.out.println("The sum is " + result);

    }
}
