package com.Trees.BinaryTree;

import java.util.ArrayList;
import java.util.List;


class Node{
     int data;
     Node left;
     Node right;
     public Node(int data){
         this.data = data;
     }
}
public class App01_PreOrderTraversal_BT {

    public static void preorderTraversal(Node root,List<Integer> list) {
        if(root == null)
            return ;

        list.add(root.data);
        preorderTraversal(root.left,list);
        preorderTraversal(root.right,list);

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        preorderTraversal(new Node(10),list);
        preorderTraversal(new Node(11),list);
        preorderTraversal(new Node(13),list);
        preorderTraversal(new Node(3),list);
        preorderTraversal(new Node(4),list);
        System.out.println(list);
    }
}
