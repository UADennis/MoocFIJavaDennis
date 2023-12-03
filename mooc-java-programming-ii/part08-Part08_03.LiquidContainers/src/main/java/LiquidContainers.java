
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int containerOne = 0;
        int containerTwo = 0;

        while (true) {
            System.out.println("First: " + containerOne + "/100");
            System.out.println("Second: " + containerTwo + "/100");
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if (command.equals("add")) {
                if (amount < 0) {
                } else if (amount < 100 && amount + containerOne < 100) {
                    containerOne += amount;
                } else {
                    containerOne = 100;
                }

            }
            if (command.equals("move")) {
                if (amount < 0 || containerTwo == 100 || containerOne == 0) {

                } else if (containerOne != 0 && amount > containerOne) {
                    containerTwo += containerOne;
                    containerOne = 0;
                } else if (amount <= 100 && amount <= containerOne) {
                    if (containerTwo < 100 && containerTwo + amount <= 100) {
                        containerTwo += amount;

                    } else {
                        containerTwo = 100;
                    }
                    containerOne -= amount;

                } else {
                    containerOne = 0;

                }
            }
            if (command.equals("remove")) {
                if (amount < 0 ) {

                } else if(containerTwo != 0 && amount - containerTwo <= 0){
                    containerTwo -= amount;
                } else{
                    containerTwo = 0;

            }
        }

    }
    }
}
