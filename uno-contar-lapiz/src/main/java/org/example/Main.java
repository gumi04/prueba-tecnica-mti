package org.example;

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
    Pencil pencil;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of pencils to count, followed by the type of pencil  to search");
    String[] input = scanner.nextLine().split(" ");

    pencil = new Pencil(Integer.parseInt(input[0]));
    pencil.fillPencils();

    System.out.println("We found " + pencil.countPencil(Integer.parseInt(input[1])) + " match for the pencil of type " + input[1]);
    scanner.close();
  }
}