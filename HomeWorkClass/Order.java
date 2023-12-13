package HomeWorkClass;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Order {
  
  private static int nextOrderId = 1;
    
    private int orderId;
    private int orderNumber;
    private LocalDate buyDate;
    private LocalTime buyTime;
    private LocalDate deliveryDate;
    private LocalTime deliveryTime;
    private Item[] items;
    
    // Constructor
    public Order(Item item) {
        this.orderId = nextOrderId++;
        this.orderNumber = 0; 
        this.buyDate = LocalDate.now();
        this.buyTime = LocalTime.now();
        this.deliveryDate = LocalDate.now();
        this.deliveryTime = LocalTime.now();
        this.items = new Item[]{item};

    }
    
    // Getters and Setters
    public int getOrderId() {
        return orderId;
    }
    
    public int getOrderNumber() {
        return orderNumber;
    }
    
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    
    public LocalDate getBuyDate() {
        return buyDate;
    }
    
    public void setBuyDate(LocalDate buyDate) {
        this.buyDate = buyDate;
    }
    
    public LocalTime getBuyTime() {
        return buyTime;
    }
    
    public void setBuyTime(LocalTime buyTime) {
        this.buyTime = buyTime;
    }
    
    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }
    
    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
    
    public LocalTime getDeliveryTime() {
        return deliveryTime;
    }
    
    public void setDeliveryTime(LocalTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
    
    public Item getItem() {
        return item;
    }
    
    public void setItem(Item item) {
        this.items = item;
    }
    
    public static double totalAmount(Item[] items){
        BigDecimal total = BigDecimal.valueOf(0);
        BigDecimal price = BigDecimal.valueOf(0);
        BigDecimal quantity = BigDecimal.valueOf(0);
        BigDecimal discount = BigDecimal.valueOf(0);
      for(int i = 0; i < items.length; i++){
        price = BigDecimal.valueOf(items[i].getPrice());
         quantity = BigDecimal.valueOf(items[i].getQuantity());
         discount = BigDecimal.valueOf(items[i].getDiscount());
         total = total.add(price.multiply(quantity).multiply(discount));
      }
      return total.doubleValue();
      }
      
      public double totalAmount() {
        BigDecimal total = BigDecimal.valueOf(0);
      for(int i = 0; i < this.items.length; i++){
         total = total.add(BigDecimal.valueOf(this.items[i].totalAmount()));
      }
      return total.doubleValue();
      }
}

