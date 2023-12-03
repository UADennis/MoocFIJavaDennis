
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while(true){
            System.out.println("Input the name of the book, empty stops:");
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            System.out.println("Input the age recommendation:");
            int age = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(input, age));
           
        }
        System.out.println(books.size() + " books in total. \n");
        
        System.out.println("Books:");
        
        Comparator<Book> comp = Comparator.comparing(Book::getAgeR).thenComparing(Book::getName);
        
        Collections.sort(books, comp);
        books.forEach(p -> System.out.println(p));
       
    }

}
