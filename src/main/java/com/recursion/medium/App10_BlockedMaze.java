package com.recursion.medium;

// maze at 0,0 need to go at last 3,3
// 4 moves allowed top,down,left,right
// [0,1,0,0]
// [0,0,0,0]
// [0,1,0,0]
// [0,0,1,0]
public class App10_BlockedMaze {


    static void blockedMaze(int[][] maze, int row, int col, String ans, boolean[][] visted) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(ans);
            return;
        }
        if (row == maze.length || row == -1 || col == maze[0].length || col == -1 || visted[row][col] || maze[row][col] == 1) {
            return;
        }

        visted[row][col] = true;
        // top call
        blockedMaze(maze, row - 1, col, ans + "T", visted);

        // left call
        blockedMaze(maze, row, col - 1, ans + "L", visted);

        // down call
        blockedMaze(maze, row + 1, col, ans + "D", visted);

        // right call
        blockedMaze(maze, row, col + 1, ans + "R", visted);

        visted[row][col] = false;
    }

    public static void main(String[] args) {
        int[][] maze = new int[][]{{0, 1, 0, 0}, {0, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}};
        blockedMaze(maze, 0, 0, "", new boolean[maze.length][maze.length]);
    }
}
