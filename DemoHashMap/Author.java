package DemoHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Author {

  private String name;

  public Author(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Author))
      return false;
    Author author = (Author) obj;
    return Objects.equals(this.name, author.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name);
  }


  public static void main(String[] args) {

    Map<Author, Book> Bookstore = new HashMap<>();
    Bookstore.put(new Author("John"), new Book("Harry Potter"));
    Bookstore.put(new Author("Moses"), new Book("Bible"));
    // if no equals & hashCode() -> new entry
    // if there are equals() & hashCode() -> update
    Bookstore.put(new Author("John"), new Book("Harry Potter2"));

    System.out.println(Bookstore.size());// 2
    // put() is not working without hashCode() or equals() method

    System.out.println(Bookstore.get(new Author("John")));// Book(name=Harry potter2)
    // get() is not working without hashCode or equals() method

    Author john = new Author("John");
    Bookstore.put(john, new Book("Harry Potter"));
    Bookstore.put(new Author("John"), new Book("Harry Potter2"));// if no equals() & hashCode() -> update

    System.out.println("    " + Bookstore.get("John"));// null, because "John" is a String

    System.out.println(Bookstore.containsKey(new Author("John")));// true
    System.out.println(Bookstore.containsKey(john));// true

    System.out.println(Bookstore.containsValue(new Book("Harry Potter2")));// true

    System.out.println("before :  = " + Bookstore.size());
    System.out
        .println(Bookstore.putIfAbsent(new Author("Ann"), new Book("IJK")));// null, original value
    for (Author a : Bookstore.keySet()) {
      System.out.println("a: " + a.getName());
    }
    System.out.println("after :  = " + Bookstore.size());
    System.out
        .println(Bookstore.putIfAbsent(new Author("Ann"), new Book("CCC")));// IJK, original value

    for (Map.Entry<Author, Book> book : Bookstore.entrySet()) {
      System.out.println(book.getValue());
    }
    System.out.println(Bookstore.get(new Author("Ann")));

    System.out.println("get=" + Bookstore.get(new Author("Ann")));



  }

}
