/**
 * Main
 */
public class Main {
  public static void main(String[] args) {
    // pattern2(4);
    // pattern1(5);
    // pattern3(5);
    pattern31(4);
  }

  static void pattern2(int n) {
    for (int row = 1; row <= n; ++row) {
      for (int col = 1; col <= row; ++col) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void pattern1(int n) {
    for (int row = 1; row <= n; ++row) {
      for (int col = 1; col <= n; ++col) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void pattern3(int n) {
    for (int row = 1; row <= n; ++row) {
      for (int col = n; col >= row; --col) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void pattern4(int n) {
    for (int row = 1; row <= n; ++row) {
      for (int col = 1; col <= row; ++col) {
        System.out.print(col);
      }
      System.out.println();
    }
  }

  static void pattern4Reverse(int n) {
    for (int row = 1; row <= 2 * n; ++row) {
      for (int col = n; col >= row; --col) {
        System.out.print(col);
      }
      System.out.println();
    }
  }

  static void pattern5(int n) {
    for (int row = 1; row <= 2 * n - 1; ++row) {
      int totalColsInRow = row >= n ? 2 * n - row : row;
      for (int col = 1; col <= totalColsInRow; ++col) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void pattern28(int n) {
    for (int row = 1; row <= 2 * n - 1; ++row) {
      int totalColsInRow = row >= n ? 2 * n - row : row;

      int numberOfSpaces = n - totalColsInRow;
      for (int spaces = 0; spaces <= numberOfSpaces; ++spaces) {
        System.out.print(" ");
      }

      for (int col = 1; col <= totalColsInRow; ++col) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void pattern30(int n) {
    for (int row = 1; row <= n; ++row) {

      for (int spaces = 1; spaces <= n - row; ++spaces) {
        System.out.print(" ");
      }
      for (int col = row; col >= 1; --col) {
        System.out.print(col);
      }

      for (int col = 2; col <= row; ++col) {
        System.out.print(col);
      }

      System.out.println();
    }
  }

  static void pattern17(int n) {
    for (int row = 1; row <= 2 * n - 1; ++row) {

      int c = row > n ? 2 * n - row : row;

      for (int spaces = 1; spaces <= n - c; ++spaces) {
        System.out.print(" ");
      }

      for (int col = c; col >= 1; --col) {
        System.out.print(col);
      }

      for (int col = 2; col <= c; ++col) {
        System.out.print(col);
      }

      System.out.println();
    }
  }

  static void pattern31(int n) {
    n = 2 * n - 1;
    for (int row = 1; row <= n; ++row) {
      for (int col = 1; col <= n; ++col) {
        int index = 0;
        System.out.print(row);
      }
      System.out.println();

    }
  }
}
