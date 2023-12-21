package DemoGenerics;

import java.util.ArrayList;
import java.util.List;

public class Printer<T extends Number> { // T is part of class defintion, and it can be bounded
  
private List<T> values;

public Printer(){
  this.values =  new ArrayList<>();
}

public Printer(T value){
  this.values = new ArrayList<>(List.of(value));
}

public void add(T value){
  values.add(value);
}

public List<T> getValue(){
  return this.values;
}

public double sum(){
  double sum = 0;
  
for(T t : this.values ){
  sum += (double) t;
}
return sum;
}

public static void main(String[] args) {
  Printer<Integer> integerPrinter = new Printer<>(10);
  //Printer<String> stringPrinter = new Printer<>("abc");

Printer<Double> doublPrinter = new Printer<>(10.3);
doublPrinter.add(5.5);
doublPrinter.add(3.2);
//doublPrinter.add(10L);


}

}
