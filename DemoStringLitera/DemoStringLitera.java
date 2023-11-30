package DemoStringLitera;

public class DemoStringLitera {
  public static void main(String[] args){

String s1 = "john";
String s2 = "john";

System.out.println(s1.equals(s2));// true (same value)
// ==, check if they are same object
System.out.println(s1 == s2);// true, check if s1 an s2 are same object

String s3 = new String("john");
System.out.println(s1.equals(s3));// true (same value)
System.out.println(s1 == s3);// false (different objects)

String s4 = String.valueOf("john");
 System.out.println(s1.equals(s4));// true (same value)
System.out.println(s1 == s4);// true // s4's string object is in Literal pool
System.out.println(s2 == s4);// true // s4's string object is in Literal pool
System.out.println(s3 ==s4);// false


s1 = "John2";
System.out.println(s1 == s4);// false
System.out.println(s2 == s4);// true

s2 = s2 + "3"; // "john3"
System.out.println(s2 == s4);// false




  }
}
