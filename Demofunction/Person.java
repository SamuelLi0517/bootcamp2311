package Demofunction;

import java.util.function.Predicate;

public class Person implements Predicate<Integer> {
  
private age;

@Override
public boolean test(Integer aduInteger){
  return this.age >= 18;
}



}
