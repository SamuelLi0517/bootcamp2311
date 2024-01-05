package GenericCalculator;

import java.util.List;

public class CheckOut {

  // call formula()
  // Force the method caller to pass an object implementing calculator interface
  public static <T extends Adjustment>double calculate(List<T> items, double adjustment){
double total = 0.0;
for (T item : items){
  total += item.adjust(adjustment);// because T is bounded by a contract Adjustment.class
}
return total;
  }
}
