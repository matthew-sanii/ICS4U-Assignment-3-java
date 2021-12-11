public class glassTop {

  private static final String star = "*";

  private static final String space = " ";

  /**
  * Function creates the top half of the hourglass.
  *
  * @param max the total number of rows being made.
  * @param current the current row being made.
  *
  * @return top half of the hourglass.
  */
  public String topHalf(final int max, final int current) {
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
}
