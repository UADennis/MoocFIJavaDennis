
import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());
        int counter = 0;
        boolean exsists = true;

        while (counter < array.length) {
            if (array[counter] == searching) {
                exsists = true;
                System.out.println(searching + " is at index " + counter + ".");
                break;
            } else {
                exsists = false;
            }
            counter++;
  
        }
        if(exsists == false)
            System.out.println(searching + " was not found.");

    }

}
