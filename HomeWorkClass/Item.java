package HomeWorkClass;

import java.math.BigDecimal;

public class Item {

    private double discount;

    private double price;

    private boolean membership;

    private String size;

    private BigDecimal weight;

    private int quantity;

    private String description;

    // Constructor
    public Item(double discount, double price, boolean membership, String size,
            BigDecimal weight, int quantity, String description) {
                this.discount = discount;
                this.price = price;
                this.membership = membership;
                this.size = size;
                this.weight = weight;
                this.quantity = quantity;
                this.description = description;
    }

    // Getters and Setters

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public double getDiscount() {
        return discount;
    }
    
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    public boolean isMembership() {
        return membership;
    }
    
    public void setMembership(boolean membership) {
        this.membership = membership;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double totalAmount() {
        return BigDecimal.valueOf(this.price).multiply(BigDecimal.valueOf(this.quantity))
            .multiply(BigDecimal.valueOf(this.discount)).doubleValue();

}

}
