import com.sun.source.tree.Tree;

import java.util.*;

public class Test {
    static void getSubSet(Integer[] arr, List<Integer> fres, List<Integer> ds, int idx) {
        if (idx == arr.length) {
            fres.add(ds.stream().mapToInt(Integer::intValue).sum());
            return;
        }
        ds.add(arr[idx]);
        getSubSet(arr, fres, ds, idx + 1);
        ds.remove(ds.size() - 1);
        getSubSet(arr, fres, ds, idx + 1);
    }
    static ArrayList<Integer> subsetSums(ArrayList<Integer> arr){
        ArrayList<Integer> fres  = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();

        getSubSet(arr.toArray(new Integer[arr.size()]),fres,ds,0);
        return fres;
    }
    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(2);
//        arr.add(3);
//        ArrayList<Integer> arrayList = subsetSums(arr);
//        System.out.println(arrayList);






    }
}
