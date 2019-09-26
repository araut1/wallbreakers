class Solution {


    private static final int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    private int[] parents;
    private int[] ranks;
    private int onBorder;

    private void buildUnionFind(int rows, int cols) {
        parents = new int[rows * cols + 1];
        ranks = new int[rows * cols + 1];
        onBorder = rows * cols;

        for (int i = 0; i < parents.length; ++i) {
            parents[i] = i;
            ranks[i] = 1;
        }
    }

    private int find(int id) {
        while (id != parents[id]) {
            parents[id] = parents[parents[id]];
            id = parents[id];
        }
        return id;
    }

    private boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    private void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);

        if (rootP == rootQ) return;

        if (ranks[rootP] <= ranks[rootQ]) {
            parents[rootP] = parents[rootQ];
            ranks[rootQ] += ranks[rootP];
        } else {
            parents[rootQ] = parents[rootP];
            ranks[rootP] += ranks[rootQ];
        }
    }

    public void solve(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) return;

        int rows = board.length, cols = board[0].length;

        buildUnionFind(rows, cols);

        int rr, cc;
        for (int r = 0; r < rows; ++r) {
            for (int c = 0; c < cols; ++c) {
                if (!isValid(r, c, board)) continue;
                if (r == 0 || r == rows - 1) union(r * cols + c, onBorder);
                else if (c == 0 || c == cols - 1) union(r * cols + c, onBorder);

                for (int[] direction : directions) {
                    rr = r + direction[0];
                    cc = c + direction[1];

                    if (!isValid(rr, cc, board)) continue;
                    union(r * cols + c, rr * cols + cc);
                }
            }
        }

        for (int r = 0; r < rows; ++r) {
            for (int c = 0; c < cols; ++c) {
                if (!isValid(r, c, board)) continue;
                if (!connected(r * cols + c, onBorder)) board[r][c] = 'X';
            }
        }
    }

    private boolean isValid(int r, int c, char[][] board) {
        return r >= 0 && r < board.length && c >= 0 && c < board[0].length && board[r][c] == 'O';
    }
}
