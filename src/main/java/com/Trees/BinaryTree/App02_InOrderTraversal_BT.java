package com.Trees.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class App02_InOrderTraversal_BT {

/*
    public List<List<Integer>> levelOrderTraversal(Node root){
        Queue<Integer> q = new LinkedList<>();
        List<List<Integer> list = new ArrayList<>();

        if(root == null)
            return list;

        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0 ; i<size ; i++){
                if(q.peek().left != null)
                    q.add(q.peek().left)
                if(q.peek().right != null)
                    q.add(q.peek().right)

                subList.add(q.remove().val)
            }
        }
        return list;
    }

*/
    public static void main(String[] args) {
        List<List<Integer>> al = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
    }
}
