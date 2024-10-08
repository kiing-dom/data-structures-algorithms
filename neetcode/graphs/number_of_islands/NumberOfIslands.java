package neetcode.graphs.number_of_islands;

public class NumberOfIslands {
    /*
     * Given a 2D grid 'grid' where '1' represents land and '0' represents water,
     * count and return the number of islands.
     * An island is formed by connecting adjacent lands horizontally or vertically
     * and is surrounded by water.
     * You may assume water is surrounding the grid (i.e., all the edges are water).
     */

    public int numIslands(char[][] grid) {
        if(grid.length == 0 || grid == null) {
            return 0;
        }

        int row = grid.length;
        int col = grid[0].length;

        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1') {
                    searchForIslands(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * TC: O(m * n)
     * SC: O(m * n)
     */

    private void searchForIslands(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';
        searchForIslands(grid, i + 1, j);
        searchForIslands(grid, i - 1, j);
        searchForIslands(grid, i, j + 1);
        searchForIslands(grid, i, j - 1);
    }

    public static void main(String[] args) {
        NumberOfIslands noi = new NumberOfIslands();

        /* Example 1 - Expected Output: 1 */
        char[][] grid1 = {
                { '0', '1', '1', '1', '0' },
                { '0', '1', '0', '1', '0' },
                { '1', '1', '0', '0', '0' },
                { '0', '0', '0', '0', '0' }
        };
        System.out.println(noi.numIslands(grid1));

        /* Edge Case 1 - Empty Grid - Expected Output: 0 */
        char[][] grid2 = {};
        System.out.println(noi.numIslands(grid2));

        /* Edge Case 2 - Single Element Grid - Expected Output: 0 */
        char[][] grid3 = { { '0' } };
        System.out.println(noi.numIslands(grid3));

        /* Edge Case 2 - Single Element Grid - Expected Output: 1 */
        char[][] grid4 = { { '1' } };
        System.out.println(noi.numIslands(grid4));

        /* Edge Case 3 - All Water - Expected Output: 0 */
        char[][] grid5 = {
                { '0', '0', '0' },
                { '0', '0', '0' },
                { '0', '0', '0' }
        };
        System.out.println(noi.numIslands(grid5));

        /* Edge Case 4 - All Land - Expected Output: 1 */
        char[][] grid6 = {
                { '1', '1', '1' },
                { '1', '1', '1' },
                { '1', '1', '1' }
        };
        System.out.println(noi.numIslands(grid6));

        /* Edge Case 5 - One Row Grid - Expected Output: 2 */
        char[][] grid7 = { { '1', '0', '1' } };
        System.out.println(noi.numIslands(grid7));

        /* Edge Case 6 - One Column Grid - Expected Output: 2 */
        char[][] grid8 = {
                { '1' },
                { '0' },
                { '1' }
        };
        System.out.println(noi.numIslands(grid8));

        /* Edge Case 7 - Diagonal Land - Expected Output: 3 */
        char[][] grid9 = {
                { '1', '0', '0' },
                { '0', '1', '0' },
                { '0', '0', '1' }
        };
        System.out.println(noi.numIslands(grid9));

        /* Edge Case 8 - Multiple Disconnected Islands - Expected Output: 3 */
        char[][] grid10 = {
                { '1', '0', '1', '0' },
                { '0', '1', '0', '1' },
                { '1', '0', '1', '0' }
        };
        System.out.println(noi.numIslands(grid10));

    }
}
