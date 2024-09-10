public class NKnights {
  public static void main(String[] args) {
    int n = 4;
    boolean[][] board = new boolean[n][n];
    knight(board, 0, 0, 4);
  }

  static void knight(boolean[][] board, int row, int col, int knights) {
    // Base case: If we have placed all knights, display the board
    if (knights == 0) {
      display(board);
      return;
    }

    // If row exceeds the board, return (termination condition)
    if (row == board.length) {
      return;
    }

    // If column exceeds, move to the next row
    if (col == board.length) {
      knight(board, row + 1, 0, knights);
      return;
    }

    // If it's safe to place the knight, place it and recurse for next positions
    if (isSafe(board, row, col)) {
      board[row][col] = true;
      knight(board, row, col + 1, knights - 1);
      board[row][col] = false; // Backtracking step
    }

    // Recursive call without placing the knight at the current position
    knight(board, row, col + 1, knights);
  }

  private static boolean isSafe(boolean[][] board, int row, int col) {
    // Check for knights in 'L' shape
    if (isValid(board, row - 2, col - 1) && board[row - 2][col - 1]) {
      return false;
    }
    if (isValid(board, row - 1, col - 2) && board[row - 1][col - 2]) {
      return false;
    }
    if (isValid(board, row - 2, col + 1) && board[row - 2][col + 1]) {
      return false;
    }
    if (isValid(board, row - 1, col + 2) && board[row - 1][col + 2]) {
      return false;
    }

    return true;
  }

  // Check if a given cell is within the bounds of the board
  private static boolean isValid(boolean[][] board, int row, int col) {
    return row >= 0 && row < board.length && col >= 0 && col < board.length;
  }

  // Display the board with knights placed
  private static void display(boolean[][] board) {
    for (boolean[] row : board) {
      for (boolean element : row) {
        if (element) {
          System.out.print("K ");
        } else {
          System.out.print(". ");
        }
      }
      System.out.println();
    }
    System.out.println(); // Print a newline after each solution for clarity
  }
}
