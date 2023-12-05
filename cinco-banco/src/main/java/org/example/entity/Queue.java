package org.example.entity;

import java.util.Objects;

/**
 * The type Customers.
 */
public class Queue {

  /**
   * The Status.
   */
  private String status;
  /**
   * The Name.
   */
  private String name;
  /**
   * The Priority.
   */
  private Integer priority;

  /**
   * Instantiates a new Customers.
   */
  public Queue() {
  }

  /**
   * Instantiates a new Customers.
   *
   * @param status   the status
   * @param name     the name
   * @param priority the priority
   */
  public Queue(String status, String name, Integer priority) {
    this.status = status;
    this.name = name;
    this.priority = priority;
  }

  /**
   * Gets status.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Sets status.
   *
   * @param status the status
   */
  public void setStatus(String status) {
    this.status = status.toUpperCase();
  }

  /**
   * Gets name.
   *
   * @return the name
   */
  public String getName() {
    if (Objects.isNull(name)){
      return "";
    }
    return name;
  }



  /**
   * Sets name.
   *
   * @param name the name
   */
  public void setName(String name) {
    this.name = name.toUpperCase();
  }

  /**
   * Gets priority.
   *
   * @return the priority
   */
  public Integer getPriority() {
    if (Objects.isNull(priority)){
      return 0;
    }
    return priority;
  }

  /**
   * Sets priority.
   *
   * @param priority the priority
   */
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  @Override
  public String toString() {
    return "Queue{" +
              "status='" + status + '\'' +
              ", name='" + name + '\'' +
              ", priority=" + priority +
              '}';
  }
}
