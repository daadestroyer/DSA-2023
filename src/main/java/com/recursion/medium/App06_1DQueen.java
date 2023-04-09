package com.recursion.medium;

public class App06_1DQueen {


    static void queenPermutation(boolean[] boxes, int qp, int tq, String ans) {
        if (qp == tq) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < boxes.length; i++) {
            if (!boxes[i]) {
                boxes[i] = true;
                queenPermutation(boxes, qp + 1, tq, ans + "Q" + qp + "B" + i);
                boxes[i] = false;
            }
        }
    }

    static void queenCombiation(boolean[] boxes, int qp, int tq, int lastIdx, String ans) {

        if (tq == qp) {
            System.out.println(ans);
            return;
        }
        for (int i = lastIdx; i < boxes.length; i++) {
            boxes[i] = true;
            queenCombiation(boxes, qp + 1, tq, i + 1, ans + "Q" + qp + "B" + i);
            boxes[i] = false;
        }
    }

    public static void main(String[] args) {
        // queenPermutation(new boolean[4], 0, 2, "");
        queenCombiation(new boolean[4], 0, 2, 0, "");

    }
}
