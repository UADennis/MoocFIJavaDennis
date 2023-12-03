import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        Random rndm = new Random();
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        while(numbers.size() < 7) {
            int rng = rndm.nextInt(40) + 1;
            if (!numbers.contains(rng)) {
                numbers.add(rng);
            }
        }
    }

    public boolean containsNumber(int number) {
        // Check if the number is already in the list
        if (numbers.contains(number)) {
            return true;
        }
        return false;
    }
}
