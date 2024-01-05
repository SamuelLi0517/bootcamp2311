package DemoStaticNestedClass;

import Demointerface.bank.Account;

public class AccountHolder {

  private Account account;
  
public AccountHolder(){

}

public AccountHolder(Account account){
  this.account = account;
}

public void setAccountr(Account account){
  this.account = account;
}

public Account createAccount(String AccountNo){
  return new Account(AccountNo);
}

public class Account{

private String accountNo;

public Account(String accountNo){
  this.accountNo = accountNo;
}
}

public static void main(String[] args) {
  AccountHolder john = new AccountHolder();
Account johnAccount = john.createAccount("1234");
}




}
