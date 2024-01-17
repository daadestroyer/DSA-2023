package com.Trees.BinaryTree;

import java.util.Map;
import java.util.TreeMap;

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
public class App13_BottomViewOfBT_BFS {

    /*
          public ArrayList <Integer> bottomView(Node root){
              ArrayList<Integer> al = new ArrayList<>();
              Queue<Pair> q = new LinkedList<>();
              Map<Integer,Integer> hm = new TreeMap<>();
              q.add(new Pair(0,root));

              while(!q.isEmpty()){
                    Pair p = q.remove();
                    int hDist = p.hDist;
                    Node tempNode = p.node;

                    hm.put(hDist,tempNode.data);

                    if(tempNode.left != null){
                        q.add(new Pair(hDist-1,tempNode.left));
                    }
                    if(tempNode.right != null){
                        q.add(new Pair(hDist+1,tempNode.right));
                    }
              }
              for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
                  al.add(entry.getValue())
              }
          }
    */
    public static void main(String[] args) {
        Map<Integer,Integer> hm = new TreeMap<>();
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();
        }
    }
}
