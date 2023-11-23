package com.Trees;

public class App03_HeightOf_BT {
/*
    public static int recursiveApproach(Node root){
        if(root == null){
            return 0;
        }

        int res1 = recursiveApproach(root.left);
        int res2 = recursiveApproach(root.right);
        return Math.max(res1,res2) + 1;
    }

    public static int iterativeApproach(Node root){
        Queue<Integer> q = new LinkedList<>();
        if(root == null){
            return 0;
        }
        q.add(root);
        int height = 0;

        while(!q.isEmpty()){
            height++;
            if(q.peek().left != null){
                q.add(p.peek().left);
            }
            if(q.peek().right != null){
                q.add(q.peek().right);
            }
            q.remove();
        }
        return height;
    }
*/
    public static void main(String[] args) {

    }
}
