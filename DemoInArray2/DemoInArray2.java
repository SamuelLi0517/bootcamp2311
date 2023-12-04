package DemoInArray2;

public class DemoInArray2 {
  public static void main(String[] args){
// int array 10,8,6,4,2
int[] arr = new int[] {10,8,6,4,2};
// for loop -> sum
int sum = 0;
for (int i = 0; i < arr.length; i++){
  sum += arr[i];
}
System.out.println("sum=" + sum);

//find the max value
int max = 0;
for(int i = 0; i < arr.length; i++){
if(arr[i] > max){
  max = arr[i];//i =0,1,2,3,4...., ,arr[0]=10
}

}
System.out.println("max=" + max);
//find the min
int[] arr2 = new int[] {10,8,6,4,2,-999,-800};

int min = 0;
for(int i = 0; i < arr2.length; i++){
if(arr2[i] < min){
  min = arr2[i];//i =0,1,2,3,4...., ,arr[0]=10
}

}
System.out.println("min=" + min);

// second max value //10,8,6,4,2

int secondMax = Integer.MAX_VALUE;
max = Integer.MIN_VALUE;
for(int i = 0; i < arr.length; i++){
if (arr[i] > max){
secondMax = max;
max = arr[i];



}else if (arr[i] > secondMax){
  secondMax = arr[i];
}


}
System.out.println("Second Max=" + secondMax);


  }
}

