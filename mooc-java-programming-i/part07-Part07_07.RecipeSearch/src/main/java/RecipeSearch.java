
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logic logic = new Logic();
        Gui gui = new Gui(logic, scanner);
        gui.start();

    }

}
