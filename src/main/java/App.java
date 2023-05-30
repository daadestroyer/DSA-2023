
import java.util.*;




public class App {

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 0, 4, 5, 0};
        int hi = arr.length - 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[hi] = arr[i];
                hi--;
            }
        }

        while (hi >= 0) {
            arr[hi] = 0;
            hi--;
        }

        System.out.println(Arrays.toString(arr));



    }
}
