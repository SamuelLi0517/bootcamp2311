package com.example;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

  @Test //annotation
  void testAdd() {
    int actualresult = Calculator.add(3, 2);
    int expectedResult = 5;
    Assertions.assertEquals(actualresult, expectedResult);
    assertNotEquals(6, Calculator.add(3, 2));
    assertNotEquals(4, Calculator.add(3, 2));
  }

  @Test
  void test1(){
    assertTrue(true);
  }
}
