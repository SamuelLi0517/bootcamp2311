package DemoChar;

public class Demochar {
  public static void main(String[] args) {
    // char means character
    char c1 = 'a';
    char c2 = 'b';
    char c3 = ' ';
    char c4 = '#';
    char c5 = '1';
    // char c6 = '10'; // syntax error, string -> char
    // chat c7 = "10"; // syntax error, char value should be single character
    // chat c8 = ' '; // syntax error, char has to be at least one character
    char c9 = 'G';
    char c10 = '1'; // char -> int
    System.out.println(c4 + c9 + c10);
    String a = "a34567890p.9876543.09876";
    
    System.out.println(c1);
    System.out.println("c1 : " + c1);
    System.out.println("a : " + a);
    System.out.println(String.valueOf(c2));

    String s = "10";

    String isPassed = "P"; // or "F"
    char isPassed2 = 'P'; // "P"; -> wrong // or "F"
    boolean isPassed3 = true; // the best approach to describe pass or fail

  }
}
