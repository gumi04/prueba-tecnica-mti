package org.example.service;

import org.example.entity.Queue;

import java.util.*;
import java.util.stream.Collectors;

/**
 * The type Customer service.
 */
public class CustomerServiceImpl implements CustomerService {

  public static final String LETTER_C = "C";
  public static final String LETTER_S = "S";
  /**
   * The Events.
   */
  private List<Queue> events = new ArrayList<>();

  /**
   * Fill customers.
   *
   * @param numberOfCustomers the number of customers
   */
  @Override
  public void fillCustomers(int numberOfCustomers) {
    try (Scanner scanner = new Scanner(System.in)) {
      for (int i = 0; i < numberOfCustomers; i++) {
        Queue queue = new Queue();
        System.out.print("Enter status ");
        String status = scanner.next();
        System.out.print("Enter the name ");
        String name = scanner.next();
        System.out.print("Enter the priority ");
        int priority = scanner.nextInt();

        queue.setStatus(status);
        queue.setName(name);
        queue.setPriority(priority);
        events.add(queue);
      }
    } catch (InputMismatchException exception) {
      System.out.println("No valid number entered for your conversion");
    }

  }

  /**
   * Show customer queue.
   */
  @Override
  public void showCustomerQueue() {
    List<Queue> rafflesList = searchRaffles();
    sumPriority(rafflesList);

    Collections.sort(events, Comparator.comparingInt(Queue::getPriority).reversed());
    System.out.println("Final Result");
    events
              .stream()
              .filter(event -> event.getStatus().equals(LETTER_C))
              .forEach(customer -> System.out.println(customer.getName()));
  }

  /**
   * Sum priority.
   *
   * @param rafflestList the rafflest list
   */
  private void sumPriority(List<Queue> rafflestList) {
    rafflestList.forEach(rafflest -> {
      events
                .stream()
                .filter(event -> (event.getName().startsWith(rafflest.getName()) && event.getStatus().equals(LETTER_C)))
                .forEach(customer -> customer.setPriority(customer.getPriority() + rafflest.getPriority()));
    });

  }


  /**
   * Search raffles list.
   *
   * @return the list
   */
  private List<Queue> searchRaffles() {
    return events
              .stream()
              .filter(item -> item.getStatus().equals(LETTER_S))
              .collect(Collectors.toList());
  }
}
