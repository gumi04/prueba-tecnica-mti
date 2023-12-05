package org.example;

/**
 * The type Year.
 */
public class YEAR {

  private static final int FOUR = 4;
  private static final int ZERO = 0;
  private static final int ONE_HUNDRED = 100;
  private static final int FOUR_HUNDRED = 400;

  /**
   * Is leap year string.
   *
   * Rules for calculation
   * A year is a leap year if it is divisible by 4, unless it is divisible by 100.
   * However, if a year is divisible by 100 and is also divisible by 400, it is also a leap year.
   *
   * @param year the year
   * @return the corresponding answer
   */
  public String isLeapYear(int year) {
    if ((year % FOUR == ZERO && year % ONE_HUNDRED != ZERO) ||
              (year % ONE_HUNDRED == ZERO && year % FOUR_HUNDRED == ZERO)) {
      return "S";
    }
    return "N";
  }
}
