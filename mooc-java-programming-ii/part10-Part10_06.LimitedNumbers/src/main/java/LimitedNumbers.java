
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true){
            int input = scanner.nextInt();
            if (input < 0){
                break;
            }
            numbers.add(input);
        }
        
        numbers.stream().mapToInt(s -> Integer.valueOf(s)).filter(s -> s >= 1 && s <= 5).forEach(s -> System.out.println(s));
    }
}
