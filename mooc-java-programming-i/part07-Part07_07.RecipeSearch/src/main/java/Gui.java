
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dennis Mayer
 */
public class Gui {

    private Logic logic;
    private Scanner inputScanner;

    public Gui(Logic logic, Scanner scanner) {
        this.logic = logic;
        this.inputScanner = scanner;

    }

    public void start() {
        System.out.println("File to read: ");
        String input = inputScanner.nextLine();
        try {
            Scanner fileReader = new Scanner(Paths.get(input));

            while (fileReader.hasNextLine()) {
                String name = fileReader.nextLine();
                int cookingTime = Integer.valueOf(fileReader.nextLine());
                ArrayList<String> ingredientList = new ArrayList<>();
                String ingredient = fileReader.nextLine();
                while (fileReader.hasNextLine()) {
                    if (ingredient.isEmpty()) {
                        break;
                    }

                    ingredientList.add(ingredient);
                    ingredient = fileReader.nextLine();
                }
                Recipe recipe = new Recipe(name, ingredientList, cookingTime);
                logic.recipes.add(recipe);
            }

            System.out.println("Commands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");
            while (true) {
                System.out.println("Enter command:");
                input = inputScanner.nextLine();
                if (input.equals("stop")) {
                    break;
                }
                if (input.equals("list")) {
                    System.out.println("Recipes:");
                    logic.list();

                }
                if (input.equals("find name")) {
                    System.out.println("Searched word:");
                    String search = inputScanner.nextLine();
                    System.out.println("Recipes:");
                    logic.findName(search);
                }
                if(input.equals("find cooking time")){
                    System.out.println("Max cooking time:");
                    int cookTime = Integer.valueOf(inputScanner.nextLine());
                    System.out.println("Recipes:");
                    logic.timeCook(cookTime);
                }
                if(input.equals("find ingredient")){
                    System.out.println("Ingredient:");
                    String ingredient = inputScanner.nextLine();
                    System.out.println("Recipes:");
                    logic.findIngrediet(ingredient);
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
