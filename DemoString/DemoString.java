package DemoString;


public class DemoString {
public static void main(String[] args){

  String emailAddress = "samuelli@gmail.com";
  //String s =3; // s is declared by String, so you canont assign int value
  // int i = "hello"; // i is declared by int, you cannot assign String value

  System.out.println(emailAddress); // samuelli@gmail.com

  // Operations -> append (concat)
  String str = "hello" + " " + "world";
  System.out.println(str); // "hello world"

  // Always look at the code inside the bracket first
  // step 1: "hello" + " " + "world" -> "hello world"
  // step 2: System.out.println() -> Print out
  System.out.println("hello" + " " + "world");


  String strl = "hello";
  System.out.println(strl); // "hello"
  System.out.println(strl.length()); // 5
  strl = strl + "world";
  System.out.println(strl.length()); // 10

  strl += "!!!";
  System.out.println(strl.length()); // 13

  // NO "-","*","/", in String
  // String supports "+", "+="
  
    // if, =, ==
    int x = 0; // = means assignment
    int x2 = 3; // = means assignment
    if (x == x2) { // == means, asking if they are eqals
      // "x == 2" return false, so the flow will nmot fall into this block
      // do something
      System.out.println("x is equals to x2");
    } else {
      System.out.println("x is equals to x2");
      // sysout is the shortcut for System.out.println()
    }

    String s1 = "hello";
    String s2 = "hello";
    if (s1.equals(s2)) {// comparing two string variables
    System.out.println("s1 is equals to s2");

    if ("hello".equals(s1)){// comparing string value to a string variable
    //if (s1.equals("hello")) // don't code in this way
  System.out.println("s1 is hello");
  }
if ("hello".equals("hello")){ //aways true
System.out.println("ABC");
}

//charAt()
// 4 is an index of String.
// Example: "hello", h -> index =0
// e -> index = 1
// l -> index = 2
// l -> index = 3
// o -> index = 4
// s1.charAt(4) return 'o'
char c = s1.charAt(4); 
System.out.println(c);//o

s1 = "samuel";
// what if we always get the last character of the String
// lenth() charAt()
int lastCharIndex = s1.length() - 1;
char lastChar = s1.charAt(lastCharIndex);
// Approach 2
lastChar = s1.charAt(s1.length() - 1);
System.out.println("lastChar");


    }
    }

  
  
}  

