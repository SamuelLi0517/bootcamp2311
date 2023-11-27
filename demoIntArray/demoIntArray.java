package demoIntArray;

public class demoIntArray {
  public static void main(String[] args){
    int age1 = 20;
    int age2 = 25;
    int age3 = 30;
    int age4 = 28;
// define an array (container) to store a list of int number
// this array (containie) can only store int number
    int[] array = new int[9];// [length of array], by index 0 - 8
    // assignment
    array[0] = 20;
    System.out.println("array[0]=" + array[0] );
    array[1] = 25;
System.out.println("array[1]=" + array[1]);
  array[2] = 30;
  System.out.println("array[2]=" + array[2]);
  array[3] = 28;
  System.out.println("array[3]=" + array[3]);
array[8] = 28;
System.out.println("array[8]=" + array[8]);

System.out.println("arrary[4]=" + array[4]); // 0

// arr[9] = 28; // error, no index 9 in array arr

int a; //local variable
a = 1; // explicitly assignment
System.out.println(a);// You have to explicitly assign value before using it

int[] arr2 = new int[5];
int[] arr3 = new int[] {100, 5, 30, 9, -40};

double[] arr4 = new double[]{1.2, 4.9, 4.3, 23.0};

System.out.println(arr2.length); //5

// array supports for loop


// default value of int[]
int[] arr5 = new int[3];
for (int i = 0; i < arr5.length; i++){
  // arr5 is storing the arrdess of the array object
  // we use arr[5] find out the 3 values stored in the array object
  arr5[i] = i + 1;
  System.out.println("arr5[i]=" + arr5[i]);
  // [0] -> 1
  // [0] -> 2
  // [0] -> 3
System.out.println("arr5[i]=" + arr5[i]);

}
for (int i= arr5.length - 1; i >= 0; i--){
  //3 2 1
System.out.print(arr5[i]); // "3 2 1"
if (i > 0){
  System.out.print(" ");
}
}

String str = "hello"; // str is storing the address of String object hello
String str2 = new String("hello");// str2 is storing the address of String object hello
String str3 = String.valueOf("hello");







  }
}
