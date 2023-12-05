package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The type Pencil.
 */
public class Pencil {

  private int[] pencils;


  /**
   * Instantiates a new Pencil.
   *
   * @param numberOfPencils the number of pencils
   */
  public Pencil(int numberOfPencils) {
    this.pencils = new int[numberOfPencils];
  }

  /**
   * Fill pencils.
   */
  public void fillPencils() {
    try (Scanner scanner = new Scanner(System.in)) {
      for (int i = 0; i < pencils.length; i++) {
        System.out.println("give me the type of pencil #" + (i + 1));
        pencils[i] = scanner.nextInt();
      }
    } catch (
              InputMismatchException exception) {
      System.out.println("No valid number entered for your conversion");
    }
  }

  /**
   * Count pencil int.
   *
   * @param type the type
   * @return the int
   */
  public int countPencil(int type) {
    int count = 0;
    for (int pencil : pencils) {
      if (pencil == type) {
        count++;
      }
    }
    return count;
  }
}
