package org.example;

/**
 * The type Time converter.
 */
public class TimeConverter {

  /**
   * The constant SECONDS.
   */
  private static final int SECONDS = 60;

  /**
   * Minutes to seconds int.
   *
   * @param minutes the minutes
   * @return the seconds
   */
  public int minutesToSeconds(int minutes) {
    return minutes * SECONDS;
  }
}
