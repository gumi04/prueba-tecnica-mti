package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The type Matrix.
 */
public class Matrix {

  private int[][] matrix;

  /**
   * Instantiates a new Matrix.
   *
   * @param numberMatrix the number matrix
   */
  public Matrix(int numberMatrix) {
    this.matrix = new int[numberMatrix][numberMatrix];
  }

  /**
   * Fill matrix.
   */
  public void fillMatrix() {
    try (Scanner scanner = new Scanner(System.in)) {
      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix.length; j++) {
          System.out.print("Enter the value for the position [" + (i + 1) + "][" + (j + 1) + "] ");
          matrix[i][j] = scanner.nextInt();
        }
      }

    } catch (
              InputMismatchException exception) {
      System.out.println("No valid number entered for your conversion");
    }
  }

  /**
   * Show matrix in the console.
   */
  public void showMatrix() {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  /**
   * Is diagonal matrix string.
   *
   * @return Returns SI when the diagonal from left to right is the same number.
   */
  public String isDiagonalMatrix() {
    int initialValue = matrix[0][0];
    for (int i = 1; i < matrix.length; i++) {
      if (matrix[i][i] != initialValue)
        return "NO";
    }
    return "SI";
  }


}
