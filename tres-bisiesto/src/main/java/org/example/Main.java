package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The type Main.
 */
public class Main {
  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    YEAR utils = new YEAR();
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Enter the year");
      int year = scanner.nextInt();
      System.out.println(utils.isLeapYear(year));
    } catch (InputMismatchException exception) {
      System.out.println("No valid number entered for your conversion");
    }
  }
}