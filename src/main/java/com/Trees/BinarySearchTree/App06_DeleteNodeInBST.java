package com.Trees.BinarySearchTree;

public class App06_DeleteNodeInBST {

    /*
        public TreeNode deleteNode(Node root, int key){
            if(root == null){
                return null;
            }
            if(root.val > key){
                root.left = deleteNode(root.left,key);
            }
            else if(root.val < key){
                root.right = deleteNode(root.right,key);
            }
            else{
                // node to be deleted has no children
                if(root.left == null && root.right == null){
                    root = null;
                }
                // node to be deleted has one right child
                else if(root.left == null){
                    root = root.right;
                }
                // node to be deleted has one left child
                else if(root.right == null){
                    root = root.left;
                }
                // node to be deleted has two child
                else{
                    Node minNode = findMin(root.right);
                    root.val = minNode.val;
                    root.right = deleteNode(root.right,root.val);
                }
            }
            return root;
        }
    */
    public static void main(String[] args) {

    }
}
