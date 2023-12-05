package DemoBigDecim;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecim {
  public static void main(String[] args){
// Problem statement: Addition (0.2 + 0.1)
double d = 0.2 + 0.1;
System.out.println("d=" + d);// 0.300000000000004

if ( d > 0.3)
System.out.println("d > 0.3");

// Solution
BigDecimal bd1 = new BigDecimal(0.2);
BigDecimal bd2 = new BigDecimal(0.1);

BigDecimal bd3= bd1.add(bd2);
System.out.println(bd3.doubleValue());

BigDecimal bd4 = BigDecimal.valueOf(0.2);
BigDecimal bd5 = BigDecimal.valueOf(0.1);

BigDecimal result = bd4.add(bd5);
System.out.println("result=" + result.doubleValue());// 0.3

// Problem statement: Subtraction (0.3 - 0.1)
double s2 = 0.3 - 0.1;
System.out.println(s2);//0.19999999999999998

BigDecimal b1 = BigDecimal.valueOf(0.3).subtract(BigDecimal.valueOf(0.1));
System.out.println("b1=" + b1.doubleValue());// 0.2

// multiply: 0.1*0.2
double s3 = 0.1 * 0.2;
System.out.println(s3);// 0.020000000000000004

BigDecimal b2 = BigDecimal.valueOf(0.1).multiply(BigDecimal.valueOf(0.2));
System.out.println("b2=" + b2.doubleValue());// 0.02

// divide 0.3 / 0.1
double s4 = 0.3 / 0.1;
System.out.println(s4);//2.9999999999999996

BigDecimal b3 = BigDecimal.valueOf(0.3).divide(BigDecimal.valueOf(0.1));
System.out.println("b3=" + b3.doubleValue());// 3.0

//
System.out.println(sum(0.2, 0.1)); // 0.3

// Comparison
BigDecimal a1 = BigDecimal.valueOf(0.3);
BigDecimal a2 = BigDecimal.valueOf(0.2);

if (a1.compareTo(a2) > 0){
System.out.println("a1 > a2");
}else if (a1.compareTo(a2) == 0){
  System.out.println("a1 == a2");
}else{
  System.out.println("a1 < a2");
}

BigDecimal result2 = BigDecimal.valueOf(1.0).divide(BigDecimal.valueOf(3),
2, RoundingMode.DOWN);

System.out.println(result2.doubleValue());

BigDecimal roundingBigDecimal = BigDecimal.valueOf(10)
.divide(BigDecimal.valueOf(3), 4, RoundingMode.DOWN)
.add(BigDecimal.valueOf(5.0))
.subtract(BigDecimal.valueOf(2.1))
.setScale(2, RoundingMode.DOWN);
System.out.println(roundingBigDecimal);// 6.23

// ** Test
}

  public static double sum(double d1, double d2) {

    return (BigDecimal.valueOf(d1).add(BigDecimal.valueOf(d2))).doubleValue();
  }
}


