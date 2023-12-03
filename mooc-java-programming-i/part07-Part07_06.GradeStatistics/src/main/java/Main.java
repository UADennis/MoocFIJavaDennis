
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        /**
         *
         * @author Dennis Mayer
         */
        Statistics statistic = new Statistics();
        BenutzerOberflaeche interfaceOne = new BenutzerOberflaeche(statistic, scanner);
        interfaceOne.start();
        
        

    }

}
