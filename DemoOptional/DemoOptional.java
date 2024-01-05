package DemoOptional;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;

public class DemoOptional {
  
  public static void main(String[] args) {
// String target = "";
//     "target".equals(target); //true/false
//     target.equals("target"); //NPE


    // Cat: age, name
    // cat.class, Cat is the name of a class only. You can name it anything, such as Box.
    // Or you can simply treat it as AgeAndNameHolder.class

    Account account = DemoOptional.setup(1, 0.0d);
    account.credit(10.0d);

  Account account2 = DemoOptional.setup(0, 0.0d);
   // account2.credit(200.0d); // NullPointerException

// As a caller, we can gengrally handel the null value in this way.
// Approach 1 to handle Optional return value
DemoOptional.setup2(2, 0.0d).ifPresent(acct -> {
  acct.credit(1000.d);

   System.out.println(acct);
});

// Approach 2 to handle Optional return value
Optional<Account> oa = DemoOptional.setup2(3, 0.0d);
if(oa.isPresent()){
  oa.get().credit(1000.0d);
} else {
  System.out.println("I decided to do nothing when Account Object is null.");
}

List<Account> accounts = new ArrayList<>(List.of(
  new Account(1, 120.0d),
  new Account(2, 50.0d)));
  
  Optional<Account> optaccount = accounts.stream() //
  .filter(e -> e.getBlance() > 30.0d) //
  .findFirst();

  // ifPresent(Consumer)
  // isPresent -> boolean

Optional<Account> optaccount2 = accounts.stream() //
  .filter(e -> e.getBlance() > 150.0d) //
  .findAny();

  Account acct = optaccount2.orElse(new Account(99, 0.1d));

Account acct2 = optaccount2.orElseGet(() ->new Account(99, 0.1d));

Account acct3 = optaccount2.orElseThrow(() ->new NoSuchElementException());

  }


  public static Account setup(int accountNo, double blance){
    if (accountNo <= 0 || blance < 0)
    return null;
    return new Account (accountNo, blance);
  }

 public static Optional <Account> setup2(int accountNo, double blance){
    if (accountNo <= 0 || blance < 0)
    return Optional.empty();
    return Optional.of(new Account (accountNo, blance));
  }

  // Important Note: We never use Optional<T> as input parameter's type.
// Inside the method, we still need to perform null check on Optional<T>,
// So we can't see any benfit in using Optional<T> in input parameter

// public static Optional<Account> setup3(Optional<Integer> accountNo, Optional<Double> blance){
//   if(accountNo == null)
//   return Optional.empty();
//   if(accountNo.isPresent()){// NPE

//   }
}





