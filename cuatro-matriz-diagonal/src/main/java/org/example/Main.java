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
    Matrix matrix;
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("The matrix is filled from left to right and from top to bottom.");
      System.out.println("Enter the matrix number");
      int numberMatrix = scanner.nextInt();
      matrix = new Matrix(numberMatrix);

      matrix.fillMatrix();


      System.out.println();
      System.out.println("Matrix entered");
      matrix.showMatrix();

      System.out.println();
      System.out.println("Is diagonal matrix " + matrix.isDiagonalMatrix());


    } catch (InputMismatchException exception) {
      System.out.println("No valid number entered for your conversion");
    }
  }
}