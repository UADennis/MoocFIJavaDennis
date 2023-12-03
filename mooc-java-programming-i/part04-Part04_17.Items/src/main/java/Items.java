
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
     Scanner scanner1 = new Scanner(System.in);   
     ArrayList<Item> items = new ArrayList<>();
        while(true){
            System.out.println("Name: ");
            String name = scanner1.nextLine();
            if(name.isEmpty()){
                break;
            }
            items.add(new Item(name));
        }
        for(Item test: items){
            System.out.println(test);
        }
    }
  
    

     

    }
