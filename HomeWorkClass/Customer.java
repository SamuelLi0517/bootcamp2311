package HomeWorkClass;

import java.util.Arrays;

public class Customer {
  
  private String name;

    private String address;
    
    private Order[] orders;
    // Constructor
    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    // Getters and Setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public void addOrder(Order order) {
    Order[] newOrders = Arrays.copyOf(this.orders, this.orders.length + 1);
    newOrders[newOrders.length - 1] = order;
    this.orders = newOrders;
  }

  public boolean deleteOrder(int orderId) {
    boolean found = false;
    for (int i = 0; i < this.orders.length; i++) {
      if (orderId == this.orders[i].getOrderId())
        found = true;
    }
    if (!found) {
      return false;
    } else {
      Order[] newArr = new Order[this.orders.length - 1];
      int idx = 0;
      for (int i = 0; i < this.orders.length; i++) {
        if (orderId == this.orders[i].getOrderId())
          newArr[idx++] = this.orders[i];
      }
      this.orders = newArr;
      return found;
    }
}
}