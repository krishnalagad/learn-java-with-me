import java.util.*;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        HashSet<Character> rows = new HashSet<>();
        HashSet<Character> cols = new HashSet<>();
        HashMap<List<Integer>, HashSet<Character>> boxes = new HashMap<>();
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {
                if (!boxes.containsKey(Arrays.asList(i / 3, j / 3))) {
                    boxes.put(Arrays.asList(i / 3, j / 3), new HashSet<>());
                }

                if (board[i][j] != '.' && rows.contains(board[i][j])) {
                    return false;
                }
                rows.add(board[i][j]);

                if (board[j][i] != '.' && cols.contains(board[j][i])) {
                    return false;
                }
                cols.add(board[j][i]);

                if (board[i][j] != '.' && boxes.get(Arrays.asList(i / 3,
                        j / 3)).contains(board[i][j])) {
                    return false;
                }
                boxes.get(Arrays.asList(i / 3, j / 3)).add(board[i][j]);
            }
            rows.clear();
            cols.clear();
        }
        return true;
    }
}
