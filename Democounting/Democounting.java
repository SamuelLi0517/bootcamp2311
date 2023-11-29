package Democounting;

public class Democounting {
  public static void main(String[] args){

    // Assume all numbers are positive
    int[] numbers = new int[]{10, 2, 200, 2000, 2, 2};
    int max = Integer.MAX_VALUE;
    int min = Integer.MIN_VALUE;
    for (int i = 0; i < numbers.length; i++){
      if (numbers[i] > max){
        max = numbers[i];
      }
      if (numbers[i] < min){
        min = numbers[i];
      }
    }
    System.out.println(max);// 2000
    System.out.println(min);// 2
    int [] counts = new int[max - min + 1];// 2000-2+1 = 1999
    // [ 2,3,4,5,6,7...1997,1998,1999]
    // 2 -> count 3 times
    // 200 -> count 1 time
for(int i = 0; i < numbers.length; i++){
  counts[numbers[i] - min]++;
}
int maxCount = 0;
for (int i = 0; i < counts.length; i++){
  if(counts[i] != 0 && counts[i] > maxCount){
    maxCount = counts[i];
  }
}
 System.out.println("max. count=" + maxCount);//3   
//

 String str = "abcabcdpolxyzaa";
 char maxChar = ' ';
 maxCount = 0;
int counts1[] = new int[26];
for (int i = 0; i < str.length(); i++){
 counts1[str.charAt(i)-'a']++;
 maxCount =  counts1[str.charAt(i)-'a'];
}
System.out.println(maxCount);
  }
}

