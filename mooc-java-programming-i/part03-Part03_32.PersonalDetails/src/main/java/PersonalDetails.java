
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        double avg = 0;

        int count = 0;

        int largest = 0;

        String largestName = "";

        while (true) {

            String input = scanner.nextLine();

            if (input.equals("")) {

                break;

            }

            String[] pieces = input.split(",");

            for (int i = 0; i < pieces.length; i++) {

                sum = sum + Integer.valueOf(pieces[1]);

                count++;

                if (largest < pieces[0].length()) {

                    largest = pieces[0].length();

                    largestName = pieces[0];

                }

            }

        }

        avg = 1.0 * sum / count;

        System.out.println("Longest name: " + largestName);

        System.out.println("Average of the birth years: " + avg);

    }

}
