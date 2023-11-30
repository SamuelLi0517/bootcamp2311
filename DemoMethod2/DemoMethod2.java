package DemoMethod2;

public class DemoMethod2 {
  public static void main(String[] args) {

    System.out.println(append("abc", "def"));
    System.out.println(getLastChar("world"));
    System.out.println(isStartedWith("world", "wor"));
    System.out.println(remove("world", "or"));
  }

  public static void sound(String animal) {
    // Early Return
    if ("ABC".equals(animal)) {
      return; // similar to break
    }
    if ("Dog".equals(animal)) {
      System.out.println("wo wo");
      return;
    } else if ("Cat".equals(animal)) {
      System.out.println("meow");
      return;
    }
    System.out.println("Default sound...");
  }


  public static String sound2(String animal) {
    // code here
    if ("ABC".equals(animal)) {
      return "";// similar to break
    }
    if ("Birld".equals(animal)) {
      System.out.println("Birld sound");
    } else if ("Lion".equals(animal)) {
      System.out.println("Lion sound");
    }
    System.out.println("Default sound...");
    return "Default sound";
  }

  public static void notifyCustomer() {
    if (sendEmail()) {
      return;
    }
    sendSMS();
  }

  public static boolean notifyCustomer2() {
    if (sendEmail()) {
      return true;
    } else if (sendSMS()) {
      return true;
    }
    return false;
  }

  public static boolean notifyCustomer3() {
    return sendEmail() || sendSMS();
  }

  public static boolean sendEmail() {
    return false;
  }


  public static boolean sendSMS() {
    return false;
  }

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
      last = s.charAt(s.length() - 1);// abcde
      return last;
    }
    // char result = s.charAt(s.length()-1);
    // return result
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
    // boolean result = s.indexOf(prefix) == 0;
    // return result;

  }

  // s -> "abcbcdabc"
  // toBeRemove -> "bcd"
  // return "abcabc"
  public static String remove(String s, String toBeRemove) {
    String[] arr = s.split(toBeRemove);
    s = "";
    for (int i = 0; i < arr.length; i++) {
      s += arr[i];
    }
    return s;



  }

}
