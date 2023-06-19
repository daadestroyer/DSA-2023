import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Shorts {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int n = nums.length;
        int stored_ele = 0 , count = 0;


        for(int i : nums){
            if(count == 0){
                stored_ele = i;
            }
            if(i == stored_ele){
                count +=1;
            }
            else{
                count -=1;
            }
        }

        System.out.println(stored_ele);
    }
}
