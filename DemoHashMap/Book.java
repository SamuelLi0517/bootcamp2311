package DemoHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Book {

  private String name;

  public Book(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    return "book name : " + this.name;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Book))
      return false;
    Book book = (Book) obj;
    return Objects.equals(this.name, book.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name);
  }

  public static void main(String[] args) {

    Map<String, Book> bookMap = new HashMap<>();
    bookMap.put("SAM", new Book("ABC"));
    bookMap.put("SAM", new Book("IJK"));
    bookMap.put("Jenny", new Book("XYZ"));

    for (Map.Entry<String, Book> entry : bookMap.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue().getName());
    }
    // get book name
    System.out.println(bookMap.get("Jenny").getName());// XYZ



  }



}
