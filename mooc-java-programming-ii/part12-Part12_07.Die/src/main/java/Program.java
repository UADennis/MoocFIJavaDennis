
public class Program {

    public static void main(String[] args) {
        // main program
        Die die = new Die(15);

        int i = 0;
        while (i < 100) {
            System.out.println(die.throwDie());
            i++;
        }

    }
}
