package DemoOptional;

import java.util.Optional;

public class Account {

  private double blance;

  private int accountNo;

  // Import Note:
  // Optional<T> is not suitable for Class attribute.
  // Optional<T> does not support serialization/ deserialization natually
 // private Optional<String> currency; 

  public Account(double blance, int accountNo) {
    this.accountNo = accountNo;
    this.blance = blance;
  }

  public Account(int accountNo2, double blance2) {
    this.accountNo = accountNo2;
    this.blance = blance2;
  }

  public double getBlance() {
    return this.blance;
  }

  public int getAccountNo() {
    return this.accountNo;
  }

  public void credit(double amount) {
    this.blance += amount;
  }

  public boolean debit(double amount) {
    if (this.blance < amount)
      return false;
    this.blance -= amount;// BigDecimal
    return true;
  }

  @Override
  public String toString() {
    return "accountNo : " + this.accountNo + " ,blance : " + this.blance;
  }

}
