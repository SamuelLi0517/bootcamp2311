package DemoPrimitives;
public class DemoInt{

  public static void main(String[] args){
    //"" -> String
    // number
    System.out.println("2 abc");
    System.out.println("2");
    System.out.println("2.3");


// i and a are both "variable" change
    int i = 2;
    int a = 3;

// "int age" -> declaration, int -> "integer"
// age = 30 -> Assignment, assign the integer value 30 to the variable
    int age =30;

    int level; // declaration
    level = 1; // Assignment
    level = 10; // Re-Assignment
    // int level; // We cannot re-declare the same variable

   System.out.println("age = 30");
   System.out.println("i = 2");
   System.out.println("a = 3");

   // step 1: level =10 + 3; (because level = 10 before reaching this line)
   // step 2: level = 16;
   level = level + 3; // 13
   level += 3; // 16

   level = level - 7; // 9
   level -= 7; // 2

   level = level * 3; //6
   level *= 3; // 18

   level = level / 2; //9
   float str4 = level;
   str4 /= 2; // 4.5
   System.out.println(str4);

   level = level + 1; //5
   level++; //6
   ++level; //7

   // the remainder of 5 / 2 -> 1
   int remainder = 5 % 2; //1
   System.out.println(remainder);


   int result = (5 + 3) / 2 % 3;
   System.out.println("result=" + result); // 1

   
   result = 5 + 3 / 2 % 3;
   System.out.println("result=" + result); // 6


   // byte, short, int, long (primitive)
   byte b = -128; // from -128 to 127 
   byte b2 = 127;
   // byte b3 = 128; // 128 is out of range of integer value that can be stored

   short s = -32768;
   short s2 = 32767;
   // short s3 = 32768;

   // int range (-2147483648 to 2147483647)
   int i1 = -2147483648;
   int i2 = 2147483647;
   //int i3 = 2147483648;

  // long l0 = 2147483648; // 2147483648 is int presentation, but out range of
   long l1 = -9223372036854775808L; // notation L -> long value
   int i5 = 100; // The value 100 has no notation -> default it is an int value
   byte b4 = 100; // java implicitly convert the int to byte
   short s4 = 100; // java implictly convert the int to short

l1 = l1 + 10L;
System.out.println(l1); // -9223372036854775798
   


  }
}