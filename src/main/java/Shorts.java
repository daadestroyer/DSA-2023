import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Shorts {
    public static void main(String[] args) {
        int[] A = {3, 1, 2, 5, 3};
        List<Integer> al = new ArrayList<>();
        int[] count = new int[A.length];
        for (int i : A) {
            count[i - 1]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 2) {
                al.add(i+1);
            } else if (count[i] == 0) {
                al.add(i+1);
            }
        }
        System.out.println(al);
    }
}
