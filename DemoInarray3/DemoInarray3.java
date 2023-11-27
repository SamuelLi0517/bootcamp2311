package DemoInarray3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DemoInarray3 {
  public static void main(String[] args){

    //for loop
// {-100, 100, 34}
int temp;
    int[] arr = new int[]{100, -100, 34};
for(int i = 0; i < arr.length; i++ ){
  if (i == 0){
temp = arr[i];// 100 = 100
arr[i] = arr[i+1];// 100 = -100
arr[i+1] = temp;// -100 = 100
//

  }
}
System.out.println(Arrays.toString(arr));

//move target index value to the tail of the array
int temp1 = 0;
int[]arr2 = new int[]{100, -20, 4, 100, 500};
int targetIndex = 1;
// for loop
// expected result = {100, 4, 100, 500, -20}
for(int i = 0; i < arr2.length -2; i++){
if(arr2[i+2] != arr2[i+1]){
  temp1=arr2[i+2];
  arr2[i+2]= arr2[i+1];
  arr2[i+1]= temp1;

System.out.println(Arrays.toString(arr2));
  }
}
}

  }

