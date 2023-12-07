package App;

import java.time.LocalDate;
import java.util.Arrays;

public class Customer {
  // 17 types (String, Wraper Classes, Primitives)

  private Order[] orders;

  private int age;

  private char membership;

  // Constructor
  public Customer() {
    orders = new Order[0];
  }

  public Customer(Order order) {
    this.orders = new Order[] {order};
  }

  public Customer(Order[] orders) {
    this.orders = orders;
  }

  // Getter
  public Order[] getOrders() {
    return this.orders;
  }

  public Order getOrder(int orderId) {
    for (int i = 0; i < this.orders.length; i++) {
      if (orderId == this.orders[i].getId())
        return this.orders[i];
    }
    return null; // null means "No Object is returned"
  }

  // public boolean updateOrderAmount(int orderId, double totalAmount){
  // for (int i = 0; i < this.orders.length; i++ ){
  // if (orders[i].getId() == orderId) {
  // orders[i].setTotalAmount(totalAmount);
  // return true;
  // }
  // }
  // return false;
  // }

  // Setter
  public void addOrder(Order order) {
    Order[] newOrders = Arrays.copyOf(this.orders, this.orders.length + 1);
    newOrders[newOrders.length - 1] = order;
    this.orders = newOrders;
  }

  public boolean deleteOrder(int orderId) {
    boolean found = false;
    for (int i = 0; i < this.orders.length; i++) {
      if (orderId == this.orders[i].getId())
        found = true;
    }
    if (!found) {
      return false;
    } else {
      Order[] newArr = new Order[this.orders.length - 1];
      int idx = 0;
      for (int i = 0; i < this.orders.length; i++) {
        if (orderId == this.orders[i].getId())
          newArr[idx++] = this.orders[i];
      }
      this.orders = newArr;
      return found;
    }
  }

  public void setAge(int age) {
    this.age = age;
  }

  public boolean isAdult() {
    return this.age >= 18;
  }

  public boolean isVip() {
    return this.orders.length >= 100;
  }

  public char membership() { // 'G', 'S', 'N'
    if (this.orders.length >= 100) {
      return 'G';
    } else if (this.orders.length >= 50) {
      return 'S';
    }
    return 'N';
  }

  public int getAge() {
    return this.age;
  }



  @Override
  public String toString() {
    return "Customer(orders=" + Arrays.toString(orders) + ")";
  }

  public static void main(String[] args) {
    // New a customer object
    Order o1 = new Order(LocalDate.of(2023, 10, 26));
    Order[] o2 = new Order[] {new Order(LocalDate.of(2023, 10, 28)), o1};
    // Customer customer = new Customer(new Order[] {o1});
    Customer customer = new Customer(o2);

    // customer.addOrder(o2);
    // New some order object, and put into the customer object

    // research -> Class of class
    System.out.println("before: " + customer.toString());
    // o2.setTotalAmount(4000.0d)
    System.out.println("after: " + customer.toString());

    customer.addOrder(new Order(LocalDate.of(2000, 10, 1)));

    System.out.println("after adding order: " + customer.toString());

    customer.deleteOrder(2); // return boolean

    System.out.println(customer.getOrder(1).totalAmount());

    customer.setAge(18);
    if (customer.isAdult()) {
      System.out.println("The customer is an adult");
    }
    if (customer.getOrders().length >= 100) {
      System.out.println("The customer is VIP");

    }


  }


}
