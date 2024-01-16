package com.Trees;

public class App010_BoundaryTraversalOfABinaryTree {

    /*

        public boolean isLeaf(TreeNode root){
           return (root.left == null) && (root.right == null);
        }
        public void addLeftBoundary(TreeNode root,ArrayList<Integer> res){
            Node curr_node = root.left;
            while(curr_node != null){
                if(isLeafNode(curr_node) == false){
                    res.add(curr_node.data);
                }
                if(curr_node.left != null){
                    curr_node = curr_node.left;
                }
                else{
                    curr_node = curr_node.right;
                }
            }
        }
        public void addRightBoundary(TreeNode root,ArrayList<Integer> res){
            Node curr_node = root.right;
            ArrayList<Integer> tmp = new ArrayList<>();
            while(curr_node != null){
                if(isLeafNode(curr_node) == false){
                    tmp.add(curr_node.data);
                }
                if(curr_node.right != null){
                    curr_node = curr_node.right;
                }
                else{
                    curr_node = curr_node.left;
                }
            }

            for(int i=tmp.size()-1 ; i>=0 ; --i){
                res.add(tmp.get(i));
            }
        }

        public void addLeaves(TreeNode root,ArrayList<Integer>res){
            if(isLeafNode(root)){
                res.add(root.data);
                return;
            }
            if(root.left != null){
                addLeaves(root.left,res);
            }
            if(root.right != null){
                addLeaves(root.right,res);
            }
        }

        static ArrayList<Integer> printBoundary(TreeNode root){
            ArrayList<Integer> res = new ArrayList<>();
            if(isLeafNode(root) == false){
                res.add(root.data);
            }
            addLeftBoundary(root,res);
            addLeaves(root,res);
            addRightBoundary(root,res);
            return res;
        }
    */
    public static void main(String[] args) {
        /*
            Node root = new Node(1);
            root.left = new Node(2);
            root.left.left = new Node(3);
            root.left.left.right = new Node(4);
            root.left.left.right.left = new Node(5);
            root.left.left.right.right = new Node(6);
            root.right = new Node(7);
            root.right.right = new Node(8);
            root.right.right.left = new Node(9);
            root.right.right.left.left = new Node(10);
            root.right.right.left.right = new Node(11);

            ArrayList <Integer> boundaryTraversal;
            boundaryTraversal = printBoundary(root);

            System.out.println("The Boundary Traversal is : ");
            for (int i = 0; i < boundaryTraversal.size(); i++) {
                System.out.print(boundaryTraversal.get(i) + " ");
            }
         */
    }
}
