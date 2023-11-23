package DemoOperator;

public class DemoOperator { 
  
  public static void main(String[] args) {

   int x = 2;
x++;
++x;
x += 1;
x = x + 1;  //6    

// difference between a++ and ++a
int a = 5;
int preIncrement = ++a; //
// a -> 6 first, then preIncrement -> 6

int b = 5;
int postIncrement = b++;
// postIncrement -> 5, b -> 6
System.out.println("postIncrement=" + postIncrement);//5
System.out.println("b=" + b);//6

int c = 5;
int c1 = c--;
System.out.println("c1=" + c1);//5
System.out.println("c=" + c);//4

//conditional Operators
//&& || ! &&=and ||=or

// Example 1
if(c == 2 && b == 4) {
  // (c == 2) -> true
  // (b == 4) -> false
  // true && false -> false
  System.out.println("Example 1=yes");
} else {
  System.out.println("Example 1=no"); // print
}

// Example 2 -> ||=or
if (c == 2 || b == 4) {
  // (c==2) -> true
  // (b==4) -> false
  // (true || false) -> true
  System.out.println("example 2=yes"); // print
} else {
  System.out.println("Example 2=no");
}
// Example 3 - AND OR
String h = "hello";
if (c==2 && (b==4 || "hello".equals(h))) {
    // (c==2) -> true
  // (b==4) -> false
  // "hello".equals(h) -> true
  // (true && (false || true)) -> true
  System.out.println("yes"); // print
} else {
  System.out.println("no");
}

//Example 4 -AND
if (c == 1 && b == 6){
  // (c == 1) -> false
  // (b == 6) will NOT be executed
  System.out.println("yes");
}

//Example
boolean phone = true;
Boolean battery = true;
String network = "n";

if(phone == true && battery.equals(true)  && "n".equals(network)) {
  System.out.println("yes");
} else {
  System.out.println("no");
}

// Example 5 - AND OR
if (c == 1 || b == 4 && "hello".equals(h)) {
  // b == 4 -> false
  //"hello".equals(h) -> true
  // c == 1 -> false
  // false || false && true
  // false || false
  // false
  System.out.println("example 5=yes");
} else {
  System.out.println("example 5=no");
}

// Example 6 - AND OR
if (h.charAt(3) == 'e' || b == 6) {
  // h.charAt(3) -> "l"
  // b == 6 -> true
  // flase || true
  // true
  System.out.println("example 6=yes");
}
// Cmparsion operators NOT only exists i if statements
// boolean -> && ||
boolean b1 = true && false;
System.out.println("b1=" + b1);

boolean b2 = false;
boolean b3 = true;

boolean result = b2 || b3;
System.out.println("result=" + result); // true

boolean result2 = b2 || b3 && b1;
System.out.println("result2=" + result2);// false

if (b1 == false) { // !b1
  System.out.println("example 7a=b1 is false");
}

if (!b1){ // b1 == false
  System.out.println("example 7b=b1 is false"); // print
}

if (b1 == true) { // b1
System.out.println("example 8a=b1 is true"); // not print
}

if (b1) { // b1 == true
  System.out.println("example 8b=b1 is true");// not print
}

int g = 0;
if (b1 == false){
  g= 10;
}

int k = b1 == false ? 10:0;
System.out.println("k=" + k);
//if b1 is false, assign 10 to k, otherwise 0
 
// Test 1
int a1 = 10;
int a2 = 4;
int min;

if (a1 > a2) {
  min = a2;
} else {
  min = a1;
}
System.out.println("min=" + min);

// Test 2
int number = 13;
boolean isOdd ;

if (number % 2 == 0){
  isOdd = false;
  System.out.println("The number is even");
}else{
  isOdd = true;
System.out.println("Odd Number:" + isOdd); // Odd Number: true
}

//Test 3
double totalAmout = 0;
int itemTotal = 2211;
double feeRate = 0.03;
// if iteamtotal >3000, NO transportation free, otherwise +3% transportation
if (itemTotal >= 3000) {
  totalAmout = itemTotal;
}else{
  totalAmout = itemTotal * (1 + feeRate);
}
System.out.println("Total Amount=" + totalAmout);// 2277.33

// another code
double transportationfee = 0.0d; // 0.0
if (itemTotal <= 3000){
  transportationfee = itemTotal * feeRate;
}
totalAmout = itemTotal +transportationfee;
System.out.println("Total Amount=" + totalAmout);

String str = "www.apple.com";
if (str.length() < 10 || "www.apple.com".equals((str))) {
System.out.println("lengh <10 or www.apple.com");
}

String s = ""; // empty string, lengh = 0
System.out.println(s.length()); // 0
s += "hello";
if (!s.isEmpty()) {
  System.out.println(" si is NOT empty");
}

}





}

