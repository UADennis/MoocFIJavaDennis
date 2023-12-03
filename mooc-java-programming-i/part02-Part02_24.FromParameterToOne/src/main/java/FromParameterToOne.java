

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);


    }
    public static void printFromNumberToOne(int number){
        int counter = number;
        while(counter > 0){
            System.out.println(counter);
            counter--;
        }
        
    }

}
