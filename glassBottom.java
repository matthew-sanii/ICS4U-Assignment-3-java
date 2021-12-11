public class glassBottom {

  private static final String star = "*";

  private static final String space = " ";

  /**
  * Function creates the bottom half of the hourglass.
  *
  * @param min the total number of rows being made.
  * @param current the current row being made.
  * @param value value used to check what row function is on.
  *
  * @return bottom half of the hourglass.
  */
  public String bottomHalf(final int min, final int current,
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
}
