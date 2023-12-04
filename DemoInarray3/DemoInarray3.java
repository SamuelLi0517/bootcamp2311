package DemoInarray3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DemoInarray3 {
  public static void main(String[] args) {

    // for loop
    // {-100, 100, 34}
    int temp;
    int[] arr = new int[] {100, -100, 34};
    for (int i = 0; i < arr.length; i++) {
      if (i == 0) {
        temp = arr[i];// 100 = 100
        arr[i] = arr[i + 1];// 100 = -100
        arr[i + 1] = temp;// -100 = 100
        //

      }
    }
    System.out.println(Arrays.toString(arr));

    // move target index value to the tail of the array
    int temp1 = 0;
    int[] arr2 = new int[] {100, -20, 4, 100, 500};
    int targetIndex = 1;
    // for loop
    // expected result = {100, 4, 100, 500, -20}
    for (int i = 0; i < arr2.length - 2; i++) {
      if (arr2[i + 2] != arr2[i + 1]) {
        temp1 = arr2[i + 2];
        arr2[i + 2] = arr2[i + 1];
        arr2[i + 1] = temp1;

        // System.out.println(Arrays.toString(arr2));
        
    }
    System.out.println(Arrays.toString(arr2));
    // Another code
    for (int i = 0; i < arr2.length; i++) {
      if (i == targetIndex && i < arr.length - 1) {
        temp = arr2[i];
        arr2[i] = arr2[i + 1];
        arr2[i + 1] = temp;
      }
    }
    System.out.println(Arrays.toString(arr2));

    // find Max value, and move to the tail
    int Maxvalue = 0;
    int[] arr3 = new int[] {100, 4, 1050, 500, -20};
    int maxIndex = -1;

    for (int i = 0; i < arr3.length; i++) {
      if (arr3[i] > Maxvalue) {
        Maxvalue = arr3[i];
        maxIndex = i;
      }
    }
    System.out.println("Maxvalue=" + Maxvalue);

    // Move the tail??
    temp = arr3[maxIndex];
    arr3[maxIndex] = arr3[arr3.length - 1];
    arr3[arr3.length - 1] = temp;
    System.out.println(Arrays.toString(arr3));


    // Approach 2;
    int[] arr4 = new int[] {100, 4, 1050, 500, -20};
    // {4,100,1050,500,-20}
    // {4,100,1050,500,-20}
    // {4,100,500,1050,-20}
    // {4,100,500,-20,1050}
    for (int i = 0; i < arr4.length - 1; i++) {
      if (arr4[i] > arr4[i + 1]) {
        temp = arr4[i];
        arr4[i] = arr4[i + 1];
        arr4[i + 1] = temp;
      }
    }
    System.out.println(Arrays.toString(arr4));

String s = "abcabcabcabcabc";
char[] arr5 = new char[s.length()];

// Approach 1
for (int i= 0; i < s.length(); i++){
  arr[i] = s.charAt(i);
}
// Approach 2
char[] arr6 = s.toCharArray(); //
//replace a -> c(String)
// "abcabcabcabcabc"
// "cbccbccbccbccbc"
char[] arr7 = new char[s.length()];
for(int i = 0; i < s.length(); i++){
  if(s.charAt(i) == 'a'){
    arr7[i] = 'c';
    continue;

  }
  arr7[i] = s.charAt(i);
}


// Form array to String
System.out.println(String.valueOf(arr7));

String str = "hello";
str = new String("hello");
str = String.valueOf("hello");

System.out.println(String.valueOf(1));
System.out.println(String.valueOf(1.0d));
System.out.println(String.valueOf(1.0f));
System.out.println(String.valueOf(1L));
System.out.println(String.valueOf(new char[] {'a', 'b'}));// ab
//System.out.println(String.valueOf(new int[] {1, 2, 3})); // NOT ok

// Replace (String method)
String str4 = "abcabcabcabcabc";
String result4 = str4.replace('a', 'c'); // replace a by c
System.out.println("str4=" + str4);
System.out.println("result4=" + result4);// result4 = cbccbccbccbccbc
// replace a patten "ab" by "ij"
System.out.println(str4.replace("ab", "ij"));// ijcijcijcijcijc
  }
}

}
