package DemoInArray;

public class DemoInArray {
  
public static void main(String[] args) {
  int[] arr = new int[] {2, 5, 7, 4};
int sum = 0;
  for(int i = 0; i < arr.length; i++){
    sum += arr[i];
  }

  // 2D array
  int[][] array = new int[][]{{1, 3, 4,}, {9, 2, 1000}};

for (int row = 0; row < array.length; row++){
  for(int col = 0; col < array[0].length; col++){
    System.out.println("row=" + row + ", col=" + col + " , value=" + array[row][col]);
  }
}

}

}
