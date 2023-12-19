package com.Trees;

import java.util.List;

public class App08_BinaryTreeZigZagTraversal {

    /*
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            Queue<TreeNode> q = new LinkedList<>();
            List<List<TreeNode>> res = new ArrayList<>();

            int l = 0;
            q.add(root);
            while(!q.isEmpty()){
                int size = q.size();
                List<Integer> curr_res = new LinkedList<>();
                for(int i=0 ; i<size ; i++){
                    TreeNode node = q.remove();
                    if(node != null){
                        curr_res.add(node.val);
                        q.add(node.left);
                        q.add(node.right);
                    }
                }
                if(!curr_res.isEmpty()){
                    if(i % 2 == 1){
                        Collections.reverse(curr_res);
                    }
                }
                l++;
                res.add(curr_res);
            }

        }
    */
    public static void main(String[] args) {

    }
}
