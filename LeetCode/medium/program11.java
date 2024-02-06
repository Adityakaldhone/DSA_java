/*
Game of Life
Company: Amazon, Goldmansachs, Cuemath
Platform: Leetcode- 289, Coding Ninjas
Fraz’s DSA sheet
Description
According to Wikipedia's article: "The Game of Life, also known simply as
Life, is a cellular automaton devised by the British mathematician John
Horton Conway in 1970."
The board is made up of an m x n grid of cells, where each cell has an initial
state: live (represented by a 1) or dead (represented by a 0). Each cell
interacts with its eight neighbors (horizontal, vertical, diagonal) using the
following four rules (taken from the above Wikipedia article):
1. Any live cell with fewer than two live neighbors dies as if caused by
under-population.
2. Any live cell with two or three live neighbors lives on to the next
generation.
3. Any live cell with more than three live neighbors dies, as if by
overpopulation.
4. Any dead cell with exactly three live neighbors becomes a live cell, as if
by reproduction.
The next state is created by applying the above rules simultaneously to every
cell in the current state, where births and deaths occur simultaneously. Given
the current state of the m x n grid board, return the next state.

Example 1:
Input: board = [[0,1,0],[0,0,1],[1,1,1],[0,0,0]]
Output: [[0,0,0],[1,0,1],[0,1,1],[0,1,0]]
Example 2:
Input: board = [[1,1],[1,0]]
Output: [[1,1],[1,1]]
Constraints:
m == board.length
n == board[i].length
1 <= m, n <= 25
board[i][j] is 0 or 1.
*/ 
class Solution {
    public void gameOfLife(int[][] board) {
         if (board == null || board.length == 0) return;
    int m = board.length, n = board[0].length;

    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            int lives = liveNeighbors(board, m, n, i, j);
            if (board[i][j] == 1 && lives >= 2 && lives <= 3) {
                board[i][j] = 3;
            }
            if (board[i][j] == 0 && lives == 3) {
                board[i][j] = 2;
            }
        }
    }

    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            board[i][j] >>= 1;
        }
    }
}

public int liveNeighbors(int[][] board, int m, int n, int i, int j) {
    int lives = 0;
    for (int x = Math.max(i - 1, 0); x <= Math.min(i + 1, m - 1); x++) {
        for (int y = Math.max(j - 1, 0); y <= Math.min(j + 1, n - 1); y++) {
            lives += board[x][y] & 1;
        }
    }
    lives -= board[i][j] & 1;
    return lives;
    }
}
