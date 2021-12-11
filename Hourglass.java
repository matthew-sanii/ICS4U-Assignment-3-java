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

  public static String topHalf(final int max, final int current) {
    String result = "";
    result += "\n";
    if ()
    for (int times = 0, times < current, times++) {
      result += space;
    }
    if (current.equals(max)) {
      result += star;
      result += bottomHalf(max, 0);
    } else {
      final int row = max - current;
      for (int layer = 0, layer < row, layer++) {
        result += star;
        result += space;
      }
      result += topHalf(max, current + 1);
    }
    
  }

  public static String bottomHalf(final int min, final int current) {
    if (min.equals(current)) {
      d
    }
  }

  /**
  * The starting main() function.
  *
  * @param args Name of file containing a string of numbers
  */
  public static void main(final String[] args) {
    final Scanner userInput = new Scanner(System.in);



}
}