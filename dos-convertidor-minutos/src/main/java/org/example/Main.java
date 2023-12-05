package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The type Main.
 */
public class Main {

  /**
   * The constant ONE.
   */
  public static final int ONE = 1;
  /**
   * The constant THREE_HUNDRED.
   */
  public static final int THREE_HUNDRED = 300;

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {

    TimeConverter utils = new TimeConverter();
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Enter the minutes to convert to seconds");
      int minutes = scanner.nextInt();
      if (minutes >= ONE && minutes <= THREE_HUNDRED) {
        System.out.println(utils.minutesToSeconds(minutes) + "s");
      }
    } catch (InputMismatchException exception) {
      System.out.println("No valid number entered for your conversion");
    }


  }
}