
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest, n = 0;

        while (true) {
            String input = scanner.nextLine();

            
            if (input.equals("")) {
                break;
            }
            String[] stuck = input.split(",");
            oldest = Integer.valueOf(stuck[1]);
            if (oldest > n) {
                n = oldest;
            }

        }
        System.out.println("Age of the oldest:" + n);

    }
}
