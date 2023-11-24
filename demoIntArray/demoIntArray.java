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


boolean[] arr5 = new boolean[8];







  }
}
