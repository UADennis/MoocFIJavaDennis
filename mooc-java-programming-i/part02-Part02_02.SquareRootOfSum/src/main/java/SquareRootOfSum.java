
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());
        int sum = input + second;
        double squareRoot = Math.sqrt(sum);
        System.out.println(squareRoot);
    }
}
