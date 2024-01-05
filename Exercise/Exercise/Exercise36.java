package Exercise;

import java.io.Serializable;
import java.io.Writer;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Exercise: Deal with common data structures, using stream flatmap() to restructure the data
 */
/**
 * Expected Output: 
Writer: Susan
Writer: Tracy
Book Name: Book A, Book Price: 34.9
Book Name: Book B, Book Price: 78.9
Book Name: Book C, Book Price: 104.9
Book Name: Book D, Book Price: 449.9
The Most Expensive Book: Name=Book D, Price=449.9
 */
// Implement Book class
// Code here ...
 class Book{

    private String name;
    private double price;

    public Book(double price, String name){
        this.name = name;
        this.price = price;
    }

    public Book(String string, double d) {}

    public String getName(){
      return name;
    }

    public double getPrice(){
        return price;
    }

}
// Implement Wrtier Class
// Code here ...
class Wrtier{

    private String name;

    private List<Book> books;

    public Wrtier(String name, List<Book> books){
this.name = name;
this.books = books;
    }

    public String getName(){
        return name;
    }

    public List<Book> getBooks(){
        return books;
    }
}
// Implement a Comparator to compare the book price
// Code here ...

class Exercise36 {
    public static void main(String[] args) {
        // Create Books1 and Writer1
        List<Book> books = Arrays.asList(new Book("Book A", 34.9), new Book("Book B", 78.9));
        Writer w1 = new Writer("Susan", books);

        // Create Books2 and Writer2
        books = Arrays.asList(new Book(104.9, "Book C"), new Book(449.9, "Book D"));
        Writer w2 = new Writer("Tracy", books);

        List<Writer> writers = Arrays.asList(w1, w2);
        // Print all Writers names
        // Code here ...
writers.stream()//
.
        // Use flatMap method to return all books written by our writers, storing in a List<Book>
        // Just return the Books!
        // Code here ...

        // Print out all books' Name and Price.
        // Code here

        // Create Comparator for stream max() method use, aims to find the most expensive book
        // Book maxPriceBook = ...
                
        // Print out the most expensive book
        System.out.println("Name:" + maxPriceBook.getName() + ", Price:" + maxPriceBook.getPrice());
    }
}
