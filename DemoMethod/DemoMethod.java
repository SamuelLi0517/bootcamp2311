package DemoMethod;

public class DemoMethod {

   public static void main(String[] args) {
    // javac -> compile command, convering .java -> .class
    // java -> run.class file
    int x = 2;
    int y = 10;
    x *= 2;// 4
    x += y;
    System.out.println("x=" + x);// 14

    y = 100;
    x = 2;
    x *= 2;// 4
    x += y;
    System.out.println("x=" + x);// 104

    // Trigger Method
    int result10 = sum(10, 3);
    System.out.println(result10);// 13
    System.out.println(sum(2, 4));// 6
    System.out.println(sum(-10, -30));// -40

    // find if any method with 3 int input parameters
    int result13 = sum(10, 3, 20);
    int result14 = sum(10, 3, 'c');
    double result15 = sum(1.7, 2.2, 3.5);
    

    int result11 = subtraction(12, 10);
    System.out.println(result11);// 2
    System.out.println(subtraction(20, 12));// 8
    System.out.println(subtraction(90, 78));// 12

    int result12 = subtraction(20, 3);
    System.out.println(result11);// 
    System.out.println(divide(20, 12));// 
    System.out.println(divide(90, 78));// 1
  }

  // main -> method name
  // public -> or private
  // static method -> tool
  // void -> return type

  // Method name: sum
  // return type: int
  // parameters: No parameter, one or more than one parameters
  // f(x1, x2) = x1 + x2
  // y = x1 + x2

// Method Signature: sum(int x, int y, int z)
public static int sum(int x, int y) {
    int sum = x + y;
    return sum;
  }
  public static int sum(int x, int y, int z) {
    int sum = x + y + z;
    return sum;
  }
public static double sum(double x, double y, double z) {
    double sum = x + y + z;
    return sum;
  }
  // Method Signature: sum(int x, int y, char z)
public static int sum(int x, int y, char z) {
    int sum = x + y + z;
    return sum;
  }
  public static int subtraction(int x, int y) {
    int subtraction = x - y;
    return subtraction;
  }
public static int multiply(int x, int y) {
    int total = x * y;
    return total;
}
public static  int divide(int x, int y) {
    int total = x / y;
    return total;
}
}


