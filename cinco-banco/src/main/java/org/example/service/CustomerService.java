package org.example.service;

/**
 * The interface Customer service.
 */
public interface CustomerService {

  /**
   * Fill customers.
   *
   * @param numberOfCustomers the number of customers
   */
  void fillCustomers(int numberOfCustomers);


  /**
   * Show customer queue.
   */
  void showCustomerQueue();
}
