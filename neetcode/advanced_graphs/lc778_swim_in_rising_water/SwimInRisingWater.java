package neetcode.advanced_graphs.lc778_swim_in_rising_water;

import java.util.*;

public class SwimInRisingWater {
    /*
     * You are given an n x n integer matrix grid where each value grid[i][j]
     * represents the elevation at that point (i, j).
     * 
     * The rain starts to fall. At time t, the depth of the water everywhere is t.
     * You can swim from a square to another 4-directionally adjacent square if and
     * only if the elevation of both squares individually are at most t. You can
     * swim infinite distances in zero time. Of course, you must stay within the
     * boundaries of the grid during your swim.
     * 
     * Return the least time until you can reach the bottom right square (n - 1, n -
     * 1) if you start at the top left square (0, 0).
     */

    private static final int[] X_DIR = { -1, 1, 0, 0 };
    private static final int[] Y_DIR = { 0, 0, -1, 1 };

    public int swimInWater(int[][] grid) {
        int n = grid.length;

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]); // store {maxElevation so far, row, col}
    }
}