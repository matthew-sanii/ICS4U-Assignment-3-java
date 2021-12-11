import java.util.Scanner;
import java.util.InputMismatchException;

final class Hourglass {

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
  * The starting main() function.
  *
  * @param args Name of file containing a string of numbers
  * @throws NumberFormatException if error occurs.
  */
  public static void main(final String[] args) {
    glassTop topGlass = new glassTop();
    glassBottom bottomGlass = new glassBottom();
    final Scanner userInput = new Scanner(System.in);
    System.out.print("\nInput size of hourglass: ");
    final String usrInput = userInput.nextLine();
    try {
      final int glassSize = Integer.valueOf(usrInput);
      System.out.println();
      if (glassSize > 0) {
        String hourglassTop = topGlass.topHalf(glassSize, 0);
        String hourglassBottom = bottomGlass.bottomHalf(0, glassSize,
        glassSize);
        System.out.print(hourglassTop);
        System.out.print(hourglassBottom);
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
