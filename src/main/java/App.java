
import java.util.*;


public class App {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int smallest = Integer.MAX_VALUE;
        int secondsmall = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < smallest) {
                secondsmall = smallest;
                smallest = a[i];
            } else if (a[i] < secondsmall && a[i] > smallest) {
                secondsmall = a[i];
            }
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            } else if (a[i] > secondLargest && a[i] < largest) {
                secondLargest = a[i];
            }
        }
        System.out.println(secondLargest);
        System.out.println(secondsmall);


    }
}
