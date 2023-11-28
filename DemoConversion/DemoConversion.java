package DemoConversion;

public class DemoConversion {
  public static void main(String[] args){
// byte -> short -> int -> long
byte b = 2;
short s1 = b;// ok, upcast, no precision loss
int i1 = s1;// ok
long l1 = i1;// ok

// long -> int -> short -> byte
long l2 = 4L;
//short s2 = l2;// Not ok, potentially precision loss
short s2 = (short) l2;// Fixed, Risky
l2 = 40000; // ?
s2 = (short) l2; // overflow
System.out.println("s2=" + s2);// -25536

short s3 = 130;
byte b2 = (byte)s3;// overflow 
System.out.println("b2=" + b2);// -126

int i2 = 130;
short s4 = (short)i2;

byte b3 = 127; // int value

float f1 = (float)1.3d;
double d1 = 5.2f; // upcast

// float vs long
float f2 = 3.5f;
long l3 = (long) f2;// downcast
float f3 = 10L; // upcast

// char vs int
int i3 = 'a';// 97, upcast
int i4 = 65610;// 65610 - 65535
char c3 = (char) i4;// downcast
System.out.println("c3 (int)=" + (int) c3);// 74
System.out.println("c3 (char)=" + c3);// j


  }
}
