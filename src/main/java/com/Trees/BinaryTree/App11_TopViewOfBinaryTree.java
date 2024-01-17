package com.Trees.BinaryTree;


//class Pair {
//    int data;
//    int level;
//
//    Pair(int data, int leve) {
//        this.data = data;
//        this.level = level;
//    }
//}

public class App11_TopViewOfBinaryTree {

    /*
        public static void applyPreOrderTraversal(TreeNode root,int hDist,int level,HashMap<Integer,Pair> visited){
            if(root == null){
                return;
            }

            if(!visited.containsKey(hDist) || visited.get(hDist).level > level){
                visited.put(hDist,new Pair(root.data,leve));
            }
            applyPreOrderTraversal(root.left,hDist-1,level+1,visited);
            applyPreOrderTraversal(root.left,hDist+1,level+1,visited);

        }
    */

    public static void main(String[] args) {
        /*
            HashMap<Integer,Pair> visited = new HashMap<>();
            applyPreOrderTraversal(root,0,0,visited);

            ArrayList<Integer> topView = new ArrayList<Integer>();
            ArrayList<Integer> res = new ArrayList<Integer>();

            for(int i : visited.keySet()){
                  topView.add(i);
            }
            Collections.sort(topView);
            for(int i : topView){
                res.add(i);
            }
            return res;
        */


    }
}
