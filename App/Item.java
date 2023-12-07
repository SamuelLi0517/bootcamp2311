package App;

import java.math.BigDecimal;

public class Item {

  private double price;

  private int quantity;

  private String desc;

  // All-args constructor
  public Item(double price, int quantity, String desc) {
    this.price = price;
    this.quantity = quantity;
    this.desc = desc;
  }

  // Setter
  public void setPrice(double price) {
    this.price = price;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  // Getter
  public double getPrice() {
    return this.price;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public String getDesc() {
    return this.desc;
  }

  public double totalAmount() {
    return BigDecimal.valueOf(this.price).multiply(BigDecimal.valueOf(quantity))
        .doubleValue();
  }



}
