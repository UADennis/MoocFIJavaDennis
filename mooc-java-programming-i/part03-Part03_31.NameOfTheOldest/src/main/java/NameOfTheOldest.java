
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest, n = 0;
        String name = "";

        while (true) {
            String input = scanner.nextLine();

            
            if (input.equals("")) {
                break;
            }
            String[] stuck = input.split(",");
            oldest = Integer.valueOf(stuck[1]);
            if (oldest > n) {
                n = oldest;
                name = stuck[0];
            }

        }
        System.out.println("Name of the oldest:" + name);


    }
}
