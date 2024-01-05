package DemoUncheckException;

public class DemoMultipleMethod {
  // Difference of throwing checked or unchecked exception
  // 1. For checked exception , you have to handle it by try-catch at the end.
  // 2. For unchecked exception, you can either program fix to "avoid" or agree to "accept" 
  // 3. For checked / unchecked, there is  still polymorhism between parent and child exception


  public static void main(String[] args) {
    // call methodA
    try {
      System.out.println(DemoMultipleMethod.methodA(5, 7));
     // System.out.println(DemoMultipleMethod.methodA("", ""));


    } catch (ArithmeticException e) {
      System.out.println("Caught ArithmeticException: " + e.getMessage());
    } catch (NumberFormatException e) {
      System.out.println("Caught NumberFormatException: " + e.getMessage());
    } catch (IllegalArgumentException e) {
      System.out.println("Caught IllegalArgumentException: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Caught IllegalArgumentException: " + e.getMessage());
    } 
    System.out.println("after");
  }

  public static int methodA(int x, int y)
      throws ArithmeticException, IllegalArgumentException {
    // call methodB
    return methodB(x, y);
  }

  public static int methodA(String x, String y) throws ArithmeticException,
      IllegalArgumentException, NumberFormatException {
    // call methodB
    if (x.isEmpty() || y.isEmpty())
      throw new NullPointerException("null point on99");
    int convertX = Integer.parseInt(x);
    int convertY = Integer.parseInt(y);

    return methodB(convertX, convertY);
  }

  public static int methodB(int x, int y)
      throws ArithmeticException, IllegalArgumentException {
    // call methodC
    return methodC(x, y);
  }

  public static int methodC(int x, int y)
      throws ArithmeticException, IllegalArgumentException {
    if (y == 0) {
      throw new ArithmeticException("Division by zero :");
    }
    if (x < 0 || y < 0) {
      throw new IllegalArgumentException("Negative numbers not allowed");
    }
    return x / y;
  }
}
