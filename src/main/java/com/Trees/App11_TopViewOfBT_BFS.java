package com.Trees;


/*
class Pair{
    Node node;
    int verticalIndex;

    Pair(int verticalIndex,Node node){
        this.verticalIndex = verticalIndex;
        this.node = node;
    }
}
*/
public class App11_TopViewOfBT_BFS {
    /*
        static ArrayList<Integer> topView(Node root){
            ArrayList<Integer> res = new ArrayList<>();

            // to store keys of hashmap in ascending sorted order we are using TreeMap
            Map<Integer,Integer> hm = new TreeMap<>();

            Queue<Pair> q = new LinkedList<>();
            if(root == null){
                return;
            }
            q.add(new Pair(root,0));
            while(!q.isEmpty()){
                Pair p = q.remove();
                int verticalIndex = p.verticalIndex;
                Node tempNode = p.node;

                if(hm.get(verticalIndex) == null){
                    hm.put(verticalIndex,tempNode.data)
                }
                if(tempNode.left != null){
                    q.add(new Pair(root,verticalIndex-1));
                }
                if(tempNode.right != null){
                    q.add(new Pair(root,verticalIndex+1));
                }
            }
            for(int i : hm.values()){
                res.add(i);
            }
            return ans;
        }
    */
    public static void main(String[] args) {

    }
}
