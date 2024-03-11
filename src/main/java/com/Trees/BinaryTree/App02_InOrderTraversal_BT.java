package com.Trees.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode{
    int data;
    Node left;
    Node right;
    public TreeNode(int data){
        this.data = data;
    }
}
public class App02_InOrderTraversal_BT {


    public static void InOrderTraversal(Node root,List<Integer> list) {
        if(root == null)
            return ;


        InOrderTraversal(root.left,list);
        list.add(root.data);
        InOrderTraversal(root.right,list);

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        InOrderTraversal(new Node(10),list);
        InOrderTraversal(new Node(11),list);
        InOrderTraversal(new Node(13),list);
        InOrderTraversal(new Node(3),list);
        InOrderTraversal(new Node(4),list);
        System.out.println(list);
    }
}
