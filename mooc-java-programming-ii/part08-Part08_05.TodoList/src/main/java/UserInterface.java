
import java.util.Scanner;
import static org.graalvm.compiler.replacements.nodes.BitScanForwardNode.scan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dennis Mayer
 */
public class UserInterface {

    private TodoList list;
    private Scanner scan;

    public UserInterface(TodoList list, Scanner scan) {
        this.list = list;
        this.scan = scan;

    }

    public void start() {

        while (true) {
            System.out.println("Command:");

            String input = scan.nextLine();
            if (input.equals("stop")) {
                break;

            }
            switch (input) {
                case "add":
                    System.out.println("To add:");
                    String question = scan.nextLine();

                    list.add(question);
                    break;
                case "remove":
                    System.out.println("Which one is removed?");
                    question = scan.nextLine();
                    list.remove(Integer.valueOf(question));
                    break;
                case "list":
                    list.print();

            }
        }

    }

}
