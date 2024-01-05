package DemoUncheckException;

public class test {
  public static void main(String[] args) {
    // call methodA
    try {
      // System.out.println(DemoMultipleMethod.methodA(5, -1));
      System.out.println(DemoMultipleMethod.methodA("", ""));

    // } catch (ArithmeticException e) {
    //   System.out.println("Caught ArithmeticException: " + e.getMessage());
    // } catch (NumberFormatException e) {
    //   System.out.println("Caught NumberFormatException: " + e.getMessage());
    // } catch (IllegalArgumentException e) {
    //   System.out.println("Caught IllegalArgumentException: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Caught IllegalArgumentException: " + e.getMessage());
    } 
    System.out.println("after");
  }

}
