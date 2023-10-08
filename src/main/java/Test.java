import com.sun.source.tree.Tree;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        int k=2;
        String text = "hi my name is is java nigam is i love to java in java because it is very good name";
        Map<String, Integer> hm = new HashMap<>();
        String[] words = text.split("\\s");
        for (String s : words) {
            hm.put(s, hm.getOrDefault(s, 0) + 1);
        }

        System.out.println(hm);

        PriorityQueue<String> maxheap = new PriorityQueue<>((a,b)->hm.get(b)-hm.get(a));
        for(String s : hm.keySet()){
            maxheap.add(s);
        }
        while(k-- > 0){
            System.out.println(maxheap.poll());
        }
//        System.out.println(maxheap);
    }
}
