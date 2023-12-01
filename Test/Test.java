package Test;

public class Test {
  
  public static void main(String[] args){

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



  }
}
