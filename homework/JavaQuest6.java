import java.util.Arrays;

public class JavaQuest6 {
  /**
   * Expected output: 1 1 2 3 5 8 13 21 ...
   * 
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    // for loop to print first 15 numbers in Fibonacci Sequence
    int firstNumber = 1;
    int sercondNumber = 1;
    int thirdNumber = -1;
    int[] arr = new int[15];
    int idx = 0;
    arr[idx++] = firstNumber;
    arr[idx++] = sercondNumber;
    while (thirdNumber < 1000) {
      thirdNumber = firstNumber + sercondNumber;
      firstNumber = sercondNumber;
      sercondNumber = thirdNumber;
      arr[idx++] = thirdNumber;
      if (idx > 14)
        break;
      // firstNumber = thirdNumber;
    }
    System.out.println(Arrays.toString(arr));
  }


}
