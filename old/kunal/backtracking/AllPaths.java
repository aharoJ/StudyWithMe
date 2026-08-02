import java.util.Arrays;

/**
 * AllPaths
 */
public class AllPaths {
  public static void main(String[] args) {
    // allPaths(0, 0, maze, "");
    allPathDigits(0, 0, maze, path, 1, "");
  }

  static boolean[][] maze = {
      { true, true, true },
      { true, true, true },
      { true, true, true }
  };

  static void allPaths(int rows, int cols, boolean[][] maze, String process) {
    if (rows == maze.length - 1 && cols == maze[0].length - 1) {
      System.out.println(process);
      return;
    }
    if (maze[rows][cols] == false) {
      return;
    }

    // I am considering this block in my path
    maze[rows][cols] = false;

    if (rows < maze.length - 1) {
      allPaths(rows + 1, cols, maze, process + "D");
    }
    if (cols < maze[0].length - 1) {
      allPaths(rows, cols + 1, maze, process + "R");
    }

    if (rows > 0) {
      allPaths(rows - 1, cols, maze, process + "U");
    }

    if (cols > 0) {
      allPaths(rows, cols - 1, maze, process + "L");
    }

    // this line is where the function will be over
    // before function gets returend, also remove the changes that were made by that
    // function
    maze[rows][cols] = true;
  }

  static int[][] path = new int[maze.length][maze[0].length];

  static void allPathDigits(int rows, int cols, boolean[][] maze, int[][] path, int step, String process) {
    if (rows == maze.length - 1 && cols == maze[0].length - 1) {
      path[rows][cols] = step;
      for (int[] nums : path) {
        System.out.println(Arrays.toString(nums));
      }
      System.out.println(process);
      System.out.println();
      return;
    }
    if (maze[rows][cols] == false) {
      return;
    }

    maze[rows][cols] = false;
    path[rows][cols] = step;

    if (rows < maze.length - 1) {
      allPathDigits(rows + 1, cols, maze, path, step + 1, process + "D");
    }
    if (cols < maze[0].length - 1) {
      allPathDigits(rows, cols + 1, maze, path, step + 1, process + "R");
    }

    if (rows > 0) {
      allPathDigits(rows - 1, cols, maze, path, step + 1, process + "U");
    }

    if (cols > 0) {
      allPathDigits(rows, cols - 1, maze, path, step + 1, process + "L");
    }

    maze[rows][cols] = true;
    path[rows][cols] = 0;

  }

}

/**
 * [1, 0, 0]
 * [2, 0, 0]
 * [3, 4, 5]
 * DDRR
 * 
 * [1, 0, 0]
 * [2, 5, 6]
 * [3, 4, 7]
 * DDRURD
 * 
 * [1, 6, 7]
 * [2, 5, 8]
 * [3, 4, 9]
 * DDRUURDD
 * 
 * [1, 0, 0]
 * [2, 3, 0]
 * [0, 4, 5]
 * DRDR
 * 
 * [1, 0, 0]
 * [2, 3, 4]
 * [0, 0, 5]
 * DRRD
 * 
 * [1, 4, 5]
 * [2, 3, 6]
 * [0, 0, 7]
 * DRURDD
 * 
 * [1, 2, 0]
 * [0, 3, 0]
 * [0, 4, 5]
 * RDDR
 * 
 * [1, 2, 0]
 * [0, 3, 4]
 * [0, 0, 5]
 * RDRD
 * 
 * [1, 2, 0]
 * [4, 3, 0]
 * [5, 6, 7]
 * RDLDRR
 * 
 * [1, 2, 3]
 * [0, 0, 4]
 * [0, 0, 5]
 * RRDD
 * 
 * [1, 2, 3]
 * [0, 5, 4]
 * [0, 6, 7]
 * RRDLDR
 * 
 * [1, 2, 3]
 * [6, 5, 4]
 * [7, 8, 9]
 * RRDLLDRR
 * 
 */
