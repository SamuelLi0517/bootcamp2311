package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
// import org.junit.jupiter.api.OrderAnnotation;
import org.junit.jupiter.api.BeforeAll;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
public class CalculatorTest2 {
  
private static int value;

 @BeforeAll
  static void beforeAll(){// must be static

value = 10000;
System.out.println("PER_CLASS, beforeAll this.value = " + value);
  }


@Test
@Order(1)
void testAdd(){
  this.value = Calculator.add(2, 3);
  assertEquals(5, this.value);
}

@Test
@Order(2)
void testSubstract(){
  this.value = Calculator.substract(this.value, 10);
  assertEquals(-5, this.value);
}

public static void main(String[] args) {
  CalculatorTest2 calculatorTest2 = new CalculatorTest2();
  calculatorTest2.testAdd();
  calculatorTest2.testSubstract();
}


}
