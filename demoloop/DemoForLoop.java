package demoloop;

public class DemoForLoop {
  public static void main(String[] args){

    int x = 2;

    for(int i = 0; i < 4; i++){
       // counter initialization ; counter  continue conditian ; counter's movement
       // step 1: int i = 0
       // step 2: i < 4 ??
       // step 3: Yes -> x*=2
       // step 4: sysout
       // step 5: i++
       // step 6: i < 4 ?? i is 1
       // step 7: Yes -> x*=2
       // step 8: sysout
       // step 9: i++
       // step 10: i < 4 ?? i is 2
       // step 11: Yes -> x*=2
       // step 12: sysout
       // step 13: i++
       // step 14: i < 4 ?? i is 3
       // step 15: Yes -> x*=2
       // step 16: sysout
       // step 17: i++
       // step 18: i < 4 ?? i is 4
       // step 19: Yes -> x*=2
      x *= 2;
      System.out.println("x=" + x);

      // x *= 2;
      //System.out.println("x=" + x);
// x *= 2;
// //System.out.println("x=" + x); // 16

    }

    //Text(1)
int y = 4;
for(int z = 0; z < 5; z++){
  y *= 4;
  System.out.println("y=" + y);
}

// Example 1
// 0 + 1 + 2 + 3 + 4 + ... + 10 -> total = 55
int w = 0;
int total = 0;
for(int s = 0; s < 11; s++){
  w += s;
  System.out.println("w=" + w);
}

// Example 2
// 0 + 2 + 4 + ... + 10 -> total -> 30

int a = 0;
total = 0;
for(int b = 0; b < 11; b++){
  //a += b * 2;
  if (b % 2 == 0){
    total += b;
  }
  System.out.println("a=" + total);
}

// Example 3
// i) 0 - 50, odd -> sum1
// ii) 51 -100, even -> anther sum2
// total -> sum1 * sum2

int c = 0;
total = 0;
int sum1 = 0;
int sum2 = 0;
for(int d = 0; d < 101; d++){ // 0,1,2,3,4...100
if(d < 51){
  if(d % 2 == 1) {

    sum1 += d;
  }
} else
  if(d % 2 == 0) {
    sum2 += d;

  }
}

  total = sum1 * sum2;
  System.out.println("total is " + total);


  // continue
  // sum up all odd number (0-100)
  int sum = 0;
  for(int i = 0; i < 101; i++){ // 0,1,2,3,4...100
// skip even number: continue
if(i % 2 == 0){
  continue; // Go to the next iteration, skip the rest of codes
}
// For even number, the following code will skipped
sum += i;



  }
System.out.println("sum" + sum);

// Text
int sum3 = 0;
for( int e = 0; e< 101; e++){
  if(e % 5 != 0){
    continue;
  }
sum3 += e;
}
System.out.println("sum3=" + sum3);

// break -> exit the loop the directly
//sum up all odd number (0-100)
// i) sum <= 200
// The loop should be ended at which number of i?
for (int i = 0; i < 3; i++){
  if(i == 2){
    break;
  }
System.out.println("i=" + i);// i = 0, i = 1
}

int sum4 = 0;
int finalsum = 0;
for(int i = 0; i < 101; i++){
  if(i % 2 ==0 ){
    continue;
  }
  sum4 += i;

  if(sum4 > 200){
    break;
  }
finalsum = sum4;
}
System.out.println("finalsum " + finalsum);

}


  }

