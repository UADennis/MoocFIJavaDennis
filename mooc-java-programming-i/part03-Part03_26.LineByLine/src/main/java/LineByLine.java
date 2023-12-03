
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String[] pieces = input.split(" ");
            if (input.equals("")) {
                break;
            }

            for (String stuck : pieces) {
                System.out.println(stuck);
            }

        }
    }
}
