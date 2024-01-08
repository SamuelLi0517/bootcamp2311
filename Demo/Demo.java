package Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo {
  
  public static void main(String[] args) {
    // 1. Instance Method
    List<String> strings = new ArrayList<>(List.of("abc", "ijk", "def"));

// length()
List<Integer> strLengths = strings.stream() //
.map(e -> e.length()) //
.collect(Collectors.toList());

List<Integer>  strLengths2 = strings.stream() //
.map(String::length)//
.collect(Collectors.toList());

List<String> sortedStrings = strings.stream() //
.sorted((s1, s2) -> s1.compareTo(s2))
.collect(Collectors.toList());

System.out.println("sortedStrings = " + sortedStrings);

strings.stream() //
.sorted(String::compareTo) //
.collect(Collectors.toList());


System.out.println("sortedStrings = " + sortedStrings);

// 2. Static Method

strings.stream() //
.forEach(e -> System.out.println(e));

// method reference: alternative as a lambda expression
strings.stream() //
.forEach(System.out::println);
// When there is a single input, and there is only one input paramter of the method

  }
}
