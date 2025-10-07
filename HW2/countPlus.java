public class countPlus {
    private char[][] grid;
    public int CountPlus() {
        int count = 0;
        boolean[][] mark_table = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (mark_table[i][j] == true) {
                    continue;
                }
                mark_table[i][j] = true;
                int left = 0;
                int right = 0;
                int top = 0;
                int bottom = 0;
                char sample = grid[i][j];
                //right
                for (int k = j; k < grid[i].length; k++) {
                    if (grid[i][k] == sample) {
                        right++;
                        mark_table[i][j] = true;
                    } else {
                        break;
                    }
                }
                //left
                for (int k = j; k >= 0; k--) {
                    if (grid[i][k] == sample) {
                        left++;
                        mark_table[i][j] = true;
                    } else {
                        break;
                    }
                }
                //top
                for (int k = i; k >= 0; k--) {
                    if (grid[k][j] == sample) {
                        top++;
                        mark_table[i][j] = true;
                    } else {
                        break;
                    }
                }
                //bottom
                for (int k = i; k < grid.length; k++) {
                    if (grid[k][j] == sample) {
                        bottom++;
                        mark_table[i][j] = true;
                    } else {
                        break;
                    }
                }
                if (left == right && right == top && top == bottom && bottom >= 2) {
                    count++;
                }
            }
        }
        return count;
    }
}
