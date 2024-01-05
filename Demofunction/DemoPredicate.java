package Demofunction;

import java.util.Objects;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class DemoPredicate {

  public static void main(String[] args) {
    int age = 17;
    boolean isAdult = age >= 18;
    System.out.println(isAdult);// false

    Predicate<Integer> isAdult2 = x -> x >= 18;
    System.out.println(isAdult2.test(17));// false
    System.out.println(isAdult2.test(18));// true
    System.out.println(isAdult2.test(19));// true

    Function<Integer, Boolean> predicateFunction = x -> x >= 18; // same idea with Predicate<Integer>

    Predicate<Integer> isOdd = x -> x % 2 == 1;
    System.out.println(isOdd.test(10));

    if (isOdd.test(9)) {
      System.out.println("9 is an odd number");
    }

    Predicate<Integer> isEvenAndPredicate = x -> x % 2 == 0 && x > 0;

    // Approach 2 (and)
    Predicate<Integer> isPositive = x -> x > 0;
    System.out.println(isOdd.and(isPositive).test(2));// false
    System.out.println(isOdd.and(isPositive).test(-2));// false
    System.out.println(isOdd.and(isPositive).test(1));// true
    System.out.println(isOdd.and(isPositive).test(-1));// false

    System.out.println(isOdd.or(isPositive).test(2));// True

    // BiPredicate
    // Example 1: Testing if two integers are equal
    BiPredicate<Integer, Integer> isEqual = (s1, s2) -> s1.equals(s2);
    System.out.println(isEqual.test(5, 5)); // Output: true
    System.out.println(isEqual.test(5, 10)); // Output: false

    // Example 2: Testing if two strings have the same length
    BiPredicate<String, String> hasSameLength =
        (s1, s2) -> s1.length() == s2.length();
    System.out.println(hasSameLength.test("hello", "world")); // Output: true
    System.out.println(hasSameLength.test("hello", "hi")); // Output: false
    System.out.println(hasSameLength.test(new String("hello"), new String("hello")));// true

    // Example 3: Testing if a number is divisible by another number
    BiPredicate<Integer, Integer> isDivisibleBy =
        (num, divisor) -> num % divisor == 0;
    System.out.println(isDivisibleBy.test(10, 2)); // Output: true
    System.out.println(isDivisibleBy.test(10, 3)); // Output: false

    // Example 4: Check if the chatAt string is vowel
    BiPredicate<String, Integer> isVowel = (str, idx) -> {
      Objects.nonNull(str); // throw NPE
      Objects.nonNull(idx); // throw NPE
      if (idx > str.length() - 1 || idx < 0)
        return false;
      if (str.charAt(idx) == 'a' || str.charAt(idx) == 'e'
          || str.charAt(idx) == 'i' || str.charAt(idx) == 'o'
          || str.charAt(idx) == 'u')
        return true;
      return false;
    };

    System.out.println(isVowel.test("hello", 2));// false
    System.out.println(isVowel.test("hello", 4));// true
    System.out.println(isVowel.test("hello", -1));// false
    System.out.println(isVowel.test("hello", 5));// false


  }
}
