package Demointerface.bank;

import java.time.LocalDateTime;

public class Transaction {// Enty
//  String 
private LocalDateTime datetime;

private boolean isCredit;

private int amount;

//
public Transaction(LocalDateTime datetime, boolean isCredit, int amount){
  this.datetime = datetime;
  this.isCredit = isCredit;
  this.amount = amount;
}

public Transaction(boolean isCredit, int amount){
  this(LocalDateTime.now(), isCredit, amount);
}

public static Transaction now(boolean isCredit, int amount){
  return new Transaction(isCredit, amount);
}


public boolean isCredit(){
  return this.isCredit;
}

public int getAmount(){
  return this.amount;
}

@Override
public String toString(){
  return "Transaction(" //
  + "datetime=" + this.datetime
  +", isCredit=" + this.isCredit
  +", amount=" + this.amount
  + ")";
}
  
}
