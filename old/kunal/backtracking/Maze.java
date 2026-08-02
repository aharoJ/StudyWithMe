import java.util.ArrayList;
import java.util.List;

public class Maze {
  public static void main(String[] args) {
    // int counter = count(3, 3);
    // System.out.println(counter);
    // printPath(3, 3, "");
    // List<String> answer = printPathList(3, 3, "");
    // System.out.println(answer);
    pathWithWatter(0, 0, maze, "");
  }

  static int count(int row, int col) {
    if (row == 1 || col == 1) {
      return 1;
    }
    int left = count(row - 1, col);
    int right = count(row, col - 1);
    return left + right;
  }

  static void printPath(int row, int col, String processed) {
    if (row == 1 && col == 1) {
      System.out.println(processed);
      return;
    }
    if (row > 1) {
      printPath(row - 1, col, processed + 'D');
    }

    if (col > 1) {
      printPath(row, col - 1, processed + 'R');
    }
  }

  static List<String> printPathList(int rows, int cols, String process) {
    List<String> result = new ArrayList<>();
    if (rows == 1 && cols == 1) {
      result.add(process);
      return result;
    }
    if (rows > 1) {
      result.addAll(printPathList(rows - 1, cols, process + "D"));
    }
    if (cols > 1) {
      result.addAll(printPathList(rows, cols - 1, process + "R"));
    }
    return result;
  }

  static List<String> printPathDiagnal(int rows, int cols, String process) {
    List<String> result = new ArrayList<>();
    if (rows == 1 && cols == 1) {
      result.add(process);
      return result;
    }
    if (rows > 1) {
      result.addAll(printPathDiagnal(rows - 1, cols, process + "H"));
    }
    if (cols > 1) {
      result.addAll(printPathDiagnal(rows, cols - 1, process + "V"));
    }

    if (rows > 1 && cols > 1) {
      result.addAll(printPathDiagnal(rows - 1, cols - 1, process + "D"));
    }
    return result;
  }

  static boolean[][] maze = {
      { true, true, true },
      { true, false, true },
      { true, true, true }
  };

  static void pathWithWatter(int rows, int cols, boolean[][] maze, String process) {
    if (rows == maze.length - 1 && cols == maze[0].length - 1) {
      System.out.println(process);
      return;
    }
    if (maze[rows][cols] == false) {
      return;
    }
    if (rows < maze.length - 1) {
      pathWithWatter(rows + 1, cols, maze, process + "D");
    }
    if (cols < maze[0].length - 1) {
      pathWithWatter(rows, cols + 1, maze, process + "R");
    }
  }
}
