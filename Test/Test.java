package Test;

public class Test {
  
  public static void main(String[] args){


    //Test 1
    // Find the maximum and minimum values in an array of integers.
    int[] numbers = {5, 9, 2, 7, 1, 6};
int max = numbers[0];
int min = numbers[0];
for(int i = 0; i < numbers.length -1; i++){
  if ( numbers[i] > max){
    max = numbers[i];

  }if ( numbers[i] < min){
  min = numbers[i];
}
}
System.out.println("maxmum=" + max);
System.out.println("minimun=" + min);

// Test 2
//count the number of vowels in a given string.
String input = "Hello, World!";
int count = 0;

input = input.toLowerCase();
for ( int i = 0; i < input.length(); i++){
char ch = input.charAt(i);
if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
count++;
} 
  }
  System.out.println("Number of vowels: " + count);

  // Test 3
  //reverse a string without using any built-in functions or libraries.
  String input1 = "Hello, World!";
String reversed = "";

//for(int i = 0; i < input1.length()-1; i--){
  //reversed += input.charAt(i);
//}
for (int i = input.length() - 1; i >= 0; i--) {
 reversed += input.charAt(i);
}

System.out.println("Reversed string: " + reversed);

// Test 4
//check if a given number is prime or not.
int number = 17;
boolean isPrime = true;

if ( number <= 1){
  isPrime = false;
} else {
for (int i = 2; i <= Math.sqrt(number); i++) {
    if (number % i == 0) {
        isPrime = false;
        break;
    }
    }
    }
    


if (isPrime) {
  System.out.println(number + " is a prime number.");
} else {
  System.out.println(number + " is not a prime number.");
}
// Test 5
// calculate the factorial of a given number.
int number1 = 5;
int factorial = 1;

for (int i = 1; i <= number; i++) {
    factorial *= i;
}

System.out.println("Factorial of " + number1 + " is: " + factorial);


int[][] arr2d = new int[][] {{1,2,3},{7,8,9},{10,1,2}};
for ( int i = 0; i < arr2d.length; i++ ){
  for ( int j = 0; i < arr2d[i].length; j++){
    System.out.println("row=" + i + ", col=" + j +", val=" + arr2d[i][j]);
  }
}



}
}

