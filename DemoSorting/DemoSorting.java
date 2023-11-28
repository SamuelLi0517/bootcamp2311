package DemoSorting;

import java.util.Arrays;

public class DemoSorting {
  public static void main(String[] args) {

    int[] arr = new int[] {100, 4, 1050, 500, -20};
    // 1.bubble sort
    int temp;
    for (int i = 0; i < arr.length - 1; i++) { // reset counter
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;

        }
      }
    }
    System.out.println(Arrays.toString(arr));

    // 2. Insertion sort
    int j;
    int key;
    int[] arr1 = new int[] {100, -30, 40, 22, 44};
    for (int i = 1; i < arr1.length; i++) { // start from the 2nd element
      key = arr1[i];
      j = i - 1;
      while (j >= 0 && arr1[j] > key) {
        arr1[j + 1] = arr1[j]; // move to right
        j--;
      }
      arr1[++j] = key;
    }
    System.out.println(Arrays.toString(arr1));
  }

}

