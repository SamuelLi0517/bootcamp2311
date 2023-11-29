package DemoWrapper;

public class DemoWrapper {
  public static void main(String[] args) {
    // int -> integer
    int i1 = 3;
    Integer i2 = 3; // 3 is int value -> auto-boxing
    int i3 = i2; // auto-unbox
    Integer i4 = new Integer(5);
    Integer i5 = Integer.valueOf(3);

    int result = i4.compareTo(i2); // 1
    System.out.println(result);
    int result2 = i2.compareTo(i4); // -1
    System.out.println(result2);

    if (i2.compareTo(i4) == 0) { // asking if i2 == i4
    }
    if (i2 == i4) { // comparing the 2 int values

    }
    // double -> Double
    double d1 = 0.2d;
    Double d2 = 0.2d;
    Double d3 = Double.valueOf(d1);
    Double d4 = new Double(d2);

    // char -> character
Character test = new Character('a');
    Character test2 = 'a';
    Character test3 = Character.valueOf('a');
    //Character test5 = Character.valueOf(2);
    //Character test6 = Character.valueOf(2.0d);
    //Character test7 = Character.valueOf(2.0f);
//only char , can not String, double.....

    // boolean -> Boolean
    boolean isOkay = true;
    Boolean isPassed = true; // autbox
    Boolean isPassed2 = Boolean.valueOf(true);// self box
    Boolean isPassed3 = new Boolean(true);
   
// long
Long l1 = 10L;// 10L is long value, auto-box
// Long -> Integer, how to fix
//Long -> long
//Integer -> int
//int  <-> long
Integer i10 = (int) (long) l1;
Long l2 = (long)(int) i10;// long -> Long (autobox)




  }
}
