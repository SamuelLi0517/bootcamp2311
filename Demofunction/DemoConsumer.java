package Demofunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class DemoConsumer {

  public static void main(String[] args) {
    Consumer<String> sendEmailFunction =
        emailAddress -> sendEmail(emailAddress);


    List<String> emails = new ArrayList<>(List.of(""));
    emails.forEach(sendEmailFunction);

    emails.forEach(x -> {
      sendEmail(x);
    });

    List<Book> books = new ArrayList<>(List.of(new Book(10.3), new Book(3.4)));
    books.add(new Book(30.8));
    for (Book book : books) {
      System.out.println(book.getPrice());
    }

    books.forEach(e -> {
      System.out.println((e.getPrice()));
    });

    // BiConsumer<>
    BiConsumer<Integer, Integer> adder = (a, b) -> {
      int sum = a + b;
      System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    };
    adder.accept(5, 3); // Output: The sum of 5 and 3 is: 8

    // SuperConsumer
    SuperConsumer<String, Integer, String> superConsumer = (s1, i1, s2) -> {
System.out.println(new StringBuilder(s2).append(s1.charAt(i1)));
    };

superConsumer.accept("hello", 4, "prefix");// prefix


  }

  public static boolean sendEmail(String emailAddress) {
    System.out.println("I am sending email ... " + emailAddress);
    return true;
  }


}
