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
  
    

  
  
}  
}
