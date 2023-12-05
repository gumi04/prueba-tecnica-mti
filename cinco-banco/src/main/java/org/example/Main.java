package org.example;

import org.example.service.CustomerService;
import org.example.service.CustomerServiceImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    CustomerService service = new CustomerServiceImpl();

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Enter the number of events");
      int events = scanner.nextInt();
      service.fillCustomers(events);
      service.showCustomerQueue();
    } catch (InputMismatchException exception) {
      System.out.println("No valid number entered for your conversion");
    }


  }
}