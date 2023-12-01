package Demoloop2;

public class DemoForEachloop {
  public static void main(String[] args) {
    Integer[] integers = new Integer[] {100, -30, 20};

    for (Integer i : integers) {
      System.out.println("i=" + i);

    }
    for (int i = 0; i < integers.length; i++) {
      System.out.println("i=" + integers[i]);
    }
    String str = "abc,def,ijk,zxy";
    String[] parts = str.split(",");
    for (int i = 0; i < parts.length; i++) {
      System.out.println(parts[i]);
    }
    for (String s : parts) {
      System.out.println("part=" + s);
    }


    // Example 1:
    String str2 = "abcdefghijk";
    // char array
    System.out.println("final String=" + evenIndex(str2));
    System.out.println("final String=" + evenIndex(""));
    System.out.println("final String=" + evenIndex("abc"));// "ac"
    System.out.println("final String=" + evenIndex("abcd")); // "ac"
    // finalString -> "aceigk"
    System.out.println("final String=" + String.valueOf(str2));




  

    // Example 2:
    // Given String "abcdefg"
    // finalString "gfedcba"
    // char array
    System.out.println("Reversed String=" + reverse("abcdef"));
    System.out.println("Reversed String=" + reverse(""));
    System.out.println("Reversed String=" + reverse("abcde"));

    String str3 = "abcdefg";
    char[] character1 = str.toCharArray();
    

  }
  public static String evenIndex(String s) {
    char[] characters = s.toCharArray(); // toCharArray() -> new char[str2.length()]
    // finalString -> "acegik"
    int arrLength = s.length() % 2 == 0 ? s.length() / 2 : s.length() / 2 + 1;
    char[] result = new char[arrLength];
    int idx = 0;
    for (int i = 0; i < characters.length; i++) {
        if (i % 2 == 0) {
            result[idx++] = characters[i];
        }
    }
    return String.valueOf(result);
}

  public static String reverse(String s) {
    // abcdefg(7 / 2 -1) -> 2

    // a <-> g
    // b <-> f
    // when to stop?
    
      // result[0] <-> result[.length -1]
      // result[1] <-> result[.length -2]
      // result[2] <-> result[.length -3]
// declare %2 == 0 , ,%2!=0
char[] result = s.toCharArray();
    char temp;
    for (int i = 0; i < result.length /2; i++) {
      temp = result[i];
      result[i] = result[s.length()-1 -i];
        result[s.length()-1-i] = temp;
    }
    return String.valueOf(result);
  }
}




