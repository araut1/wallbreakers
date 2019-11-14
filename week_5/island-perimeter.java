class Solution {
  
     int perimeter = 0;

     public void helper(int[][] grid, int i, int j) {

        if (i < 0 || j < 0 || i == grid.length || j == grid[0].length || grid[i][j] == -1 || grid[i][j] == 0) {
            return;
        }

        grid[i][j] = -1;
        int temp = 4;

        if (!(i - 1 < 0) && (grid[i - 1][j] == 1 || grid[i - 1][j] == -1)) {
            temp--;
        }
        if (!(j - 1 < 0) && (grid[i][j - 1] == 1 || grid[i][j - 1] == -1)) {
            temp--;
        }
        if (!(i + 1 == grid.length) && (grid[i + 1][j] == 1 || grid[i + 1][j] == -1)) {
            temp--;
        }
        if (!(j + 1 == grid[0].length) && (grid[i][j + 1] == 1 || grid[i][j + 1] == -1)) {
            temp--;
        }

        perimeter += temp;

        helper(grid, i - 1, j);
        helper(grid, i, j - 1);
        helper(grid, i, j + 1);
        helper(grid, i + 1, j);

    }

     public int islandPerimeter(int[][] grid) {

        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    helper(grid, i, j);
                    break;
                }

            }
        }

        return perimeter;
    }
}
