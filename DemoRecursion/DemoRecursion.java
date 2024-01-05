package DemoRecursion;

public class DemoRecursion {

  public static void main(String[] args) {
    // 1+2+3+4+5
    int sum = 0;
    int n = 5;
    for (int i = 0; i <= n; i++) {
      sum += i;
    }
    System.out.println(sum);// 15

    // recursion : Given int n, return n + (n -1) + (n -2) + 1
    System.out.println(sum(5));

    
    System.out.println(recursiveProduct(5));  // Output: 5 * 3 * 1 = 15
System.out.println(recursiveProduct(6));  // Output: 6 * 4 * 2 = 48
System.out.println(recursiveProduct(10)); // Output: 10 * 8 * 6 * 4 * 2 = 3840
  }

  // Time/ Space complexity??
  public static int sum(int n) {// n =5
    // base criteria
    if (n == 1)
      return 1;
    return n + sum(n - 1);
  }
  // step1 : sum(5) -> return 5 + sum(4);
  // ste2 : sum(4) -> return 4 + sum(3);
  // step3 : sum(3) -> return 3 + sum(2);
  // step4 : sum(2) -> return 2 + sum(1);
  // step5 : sum(1) -> return 1;



// recursion : Given int n
    // if n is odd, return n * (n - 2) * (n - 4) * ... * 1
    // if n is even, return n * (n - 2) * (n - 4) * ... * 2
  public static int recursiveProduct(int n) {
    if (n <= 0) {
        return 1; // Base case: when n is 0 or negative, return 1
    }
    if (n % 2 == 0) {
        return n * recursiveProduct(n - 2); // Recursive case for even n
    } else {
        return n * recursiveProduct(n - 2); // Recursive case for odd n
    }
    
}

}

