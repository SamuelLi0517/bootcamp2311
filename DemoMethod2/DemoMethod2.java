package DemoMethod2;

public class DemoMethod2 {
  // s1 -> "abc"
  // s2 -> "def"
  // return -> "abcdef"
  public static String append(String s1, String s2) {
    String str = s1.concat(s2);
    return str;


  }

  // Get the last character of the String s
  // if s length < 1, return ' '(space character)
  public static char getLastChar(String s) {
    char last = ' ';
    if (s.length() < 1) {
      return last;
    } else {
      last = s.charAt(s.length() - 1);//abcde 
      return last;
    }
  }

  // s -> "helloworld"
  // prefix -> "hello"
  // return true
  public static boolean isStartedWith(String s, String prefix) {
    if (s.startsWith(prefix)) {
      return false;
    } else {
      return true;
    }
  }

  // s -> "abcbcdabc"
  // toBeRemove -> "bcd"
  // return "abcabc"
  public static String remove(String s, String toBeRemove) {
String[] arr = s.split(toBeRemove);
s = "";
for ( int i = 0 ; i < arr.length; i++){
  s += arr [i];
}
return s;
  }

}
