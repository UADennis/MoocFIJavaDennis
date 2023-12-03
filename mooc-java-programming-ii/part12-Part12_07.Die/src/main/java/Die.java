
import java.util.Random;

public class Die {

    private Random random;
    private int numberOfFaces;

    public Die(int numberOfFaces) {
        this.random = new Random();
        this.numberOfFaces = random.nextInt(numberOfFaces + 2);
    }

    public int throwDie() {
        
        int number = random.nextInt(numberOfFaces) +1;
        return number;
    }
}
