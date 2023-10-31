import java.util.Arrays;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        System.out.println("Before Being Sorted");
        System.out.println(Arrays.toString(arr));

        System.out.println("After Being Sorted");
        sortArray(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static void sortArray(int[] arr) {
        boolean isSwappedElement = true;

        while (isSwappedElement) {
            isSwappedElement = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    isSwappedElement = true;
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
}