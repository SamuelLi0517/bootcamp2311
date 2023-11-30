package DemoRandom;

import java.util.Random;
import java.util.Scanner;

public class DemoRandom {
  public static void main(String[] args){

    int target = new Random().nextInt(100);
    System.out.println("random number=" + target);// 0, 1, 2

target = new Random().nextInt(100) + 1;
System.out.println("random number=" + target);// 1,2,3

// Game
// 1-100 (random target: 47)
// Round 1: "please input an number(1-100)" User input 49 (wrong)
// Round 2: "please input an number(1-48)" User input 35 (wrong
// Round 3: "please input an number(36-48)" User input 47 (correct)

// if the inputed number is out of range being asked, keep asking
Scanner scanner = new Scanner(System.in);
int input = scanner.nextInt();
// while loop
// if use input same as target -> exit
// otherwise, keep asking
int max = 100;
int min = 1;
do{
  System.out.println("please in put a number (" + min + "-" + max + "):");
input = scanner.nextInt();
if (input < min || input > max){

}
// Adjust the min and max value
if (input > target){
max = input -1;
} else if (input < target){
  min = input + 1;
}
}while(input != target);
System.out.println("Bingo, target=" + target);
 scanner.close();

  }
}
