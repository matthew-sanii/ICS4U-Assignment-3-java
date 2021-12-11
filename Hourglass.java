import java.util.Scanner;
import java.util.InputMismatchException;

final class Hourglass {

  public static final String star = "*";

  public static final String space = " ";

  /**
  * Prevent instantiation
  * Throw an exception IllegalStateException.
  * if this ever is called
  *
  * @throws IllegalStateException
  *
  */
  private Hourglass() {
    throw new IllegalStateException("Cannot be initated.");
  }

  /**
  * Function creates the top half of the hourglass.
  *
  * @param max the total number of rows being made.
  * @param current the current row being made.
  *
  * @return top half of the hourglass.
  */
  public static String topHalf(final int max, final int current) {
    String result = "";
    if (current != 0) {
      result += "\n";
    }
    if ((current + 1) == max) {
      for (int times = 0; times < current; times++) {
        result += space;
      }
      result += star;
    } else {
      final int row = max - current;
      for (int times = 0; times < current; times++) {
        result += space;
      }
      for (int layer = 0; layer < row; layer++) {
        result += star;
        result += space;
      }
      result += topHalf(max, current + 1);
    }
    return result;
  }

  /**
  * Function creates the bottom half of the hourglass.
  *
  * @param min the total number of rows being made.
  * @param current the current row being made.
  * @param value value used to check what row function is on.
  *
  * @return top half of the hourglass.
  */
  public static String bottomHalf(final int min, final int current,
                                  final int value) {
    String result = "";
    if (current != value) {
      result += "\n";
    }
    if (current == min) {
      for (int times = value; times > current; times--) {
        result += star;
        result += space;
      }
    } else {
      final int row = value - current;
      for (int times = value; times > row; times--) {
        result += space;
      }
      for (int layer = value; layer > current; layer--) {
        result += star;
        result += space;
      }
      result += bottomHalf(min, current - 1, value);
    }
    return result;
  }

  /**
  * The starting main() function.
  *
  * @param args Name of file containing a string of numbers
  * @throws NumberFormatException if error occurs.
  */
  public static void main(final String[] args) {
    final Scanner userInput = new Scanner(System.in);
    System.out.print("\nInput size of hourglass: ");
    final String usrInput = userInput.nextLine();
    try {
      final int glassSize = Integer.valueOf(usrInput);
      System.out.println();
      if (glassSize > 0) {
        String hourglass = topHalf(glassSize, 0);
        hourglass += bottomHalf(0, glassSize, glassSize);
        System.out.print(hourglass);
      } else {
        System.out.println("\nPlease enter a positive integer.");
      }
    } catch (NumberFormatException errorCode) {
      System.err.print("\nThis is not an integer.");
    }
    System.out.println("");
    System.out.println("\nDone.");
  }
}
