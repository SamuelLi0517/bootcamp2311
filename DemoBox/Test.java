package DemoBox;

public class Test<T> extends Box<T>{

  T age;

  public static void main(String[] args) {
    Test<String> test= new Test<>();
String o = test.t;

// public class Test extends Box<T> {} -> NOT OK
// public class Test extends Box<String> {} -> NOT OK




  }
}
