
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 4, 5, 99, 3, 1};
        System.out.println(smallest(array));
        System.out.println(indexOfSmallest(array));

        int[] numbers = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));
    }

    public static int smallest(int[] arr) {
        int small = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[small]) {
                small = i;
            }

        }
        return arr[small];
    }

    public static int indexOfSmallest(int[] array) {
        int small = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[small]) {
                small = i;
            }

        }
        return small;

    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int small = startIndex ;
        for (int i = startIndex + 1; i < table.length; i++) {
            if (table[i] < table[small]) {
                small = i;
            }

        }
        return small;// write your code here
    }

    public static void swap(int[] array, int index1, int index2) {
        int help = 0;
        help = array[index1];
        array[index1] = array[index2];
        array[index2] = help;
    }
    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
             swap(array, i, indexOfSmallestFrom(array, i));
             System.out.println(Arrays.toString(array));
        }

}
}
