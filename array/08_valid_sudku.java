class Solution {
    boolean check_row(char[][] board, int r) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            if (board[r][i] == '.') {
                continue;
            }
            if (set.contains(board[r][i])) {
                return false;
            }
            set.add(board[r][i]);
        }
        return true;
    }
    boolean check_col(char[][] board, int c) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            if (board[i][c] == '.') {
                continue;
            }
            if (set.contains(board[i][c])) {
                return false;
            }
            set.add(board[i][c]);
        }
        return true;
    }
    boolean check_matrix(char[][] board, int r, int c) {
        Set<Character> set = new HashSet<>();
        for (int i = r; i < r+3; i++) {
            for (int j = c; j <c+3; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (set.contains(board[i][j])) {
                    return false;
                }
                set.add(board[i][j]);
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean row = check_row(board, i);

            boolean col = check_col(board, i);
            if (row == false || col == false)
                return false;
        }
        for (int i = 0; i < 9; i = i + 3) {
            for (int j = 0; j < 9; j = j + 3) {
                boolean mat = check_matrix(board, i, j);
                if (mat == false)
                    return false;
            }
        }
        return true;
    }
}
