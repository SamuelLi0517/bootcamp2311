package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
  
  @Test
  void testAdd1() {
    assertEquals(5, Calculator.add(2, 3));
  }

  // @Test
  void testAdd2() {
    assertNotEquals(6, Calculator.add(2, 3));
  }

  void testAdd3() {
    assertEquals(10, Calculator.add(1, 9));
  }

  void testAdd4() {
    assertNotEquals(50, Calculator.add(2, 3));
  }
}
