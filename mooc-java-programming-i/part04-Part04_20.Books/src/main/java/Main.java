import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> booklist = new ArrayList<>();
        
        while(true){
            System.out.println("Title:");
            String title = scanner.nextLine();
            if(title.isEmpty()){
                break;
            }
            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year:");
            int year = Integer.valueOf(scanner.nextLine());
            booklist.add(new Book(title, pages, year));
            
        }
        System.out.println("What information will be printed ?");
        String instruction = scanner.nextLine();
        if(instruction.equals("everything")){
            for(Book buch: booklist){
                System.out.println(buch.getTitle() + ", " + buch.getPages() + " pages, " + buch.getPublication());
            }
        } else if(instruction.equals("name")){
            for(Book buch : booklist){
                System.out.println(buch.getTitle());
            }
        }
    }
}


    
