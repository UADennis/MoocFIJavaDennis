
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String eingabe = scanner.nextLine();
            if(eingabe.equals("end")){
                break;
            }
            System.out.println(Integer.parseInt(eingabe)*Integer.parseInt(eingabe)*(Integer.parseInt(eingabe)));
        }

    }
}
