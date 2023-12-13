package App.inheritance;

import java.math.BigDecimal;

//Bigdecimal has No the "final" keyword, so SuperDecimal can inherit it.
public final class SuperDecimal extends BigDecimal{

  public SuperDecimal(){
     super("0.0");
  }

  private SuperDecimal(double value){
    super(String.valueOf(value));
  }

  //public SuperDecimal(double value){
  //  super(String.valueOf(value));// new BigDecimal("3.0")
  //}

  public static SuperDecimal valueOf(double value){
return new SuperDecimal(value);

  }

  @Override
  public SuperDecimal multiply(BigDecimal value){
    BigDecimal bd = this; // upcast
    BigDecimal bdvalue = value; // upcast
    return new SuperDecimal (bd.multiply(bdvalue).doubleValue());
  }
  
public static void main(String[] args){
SuperDecimal sd = new SuperDecimal();// calling BigDecimal()
// 3.0 x 4.0
SuperDecimal sd2 =  SuperDecimal.valueOf(3.0);
SuperDecimal sd3 =  SuperDecimal.valueOf(4.0);

// 3.0 x 4.0(sd2 * sd3)
// sd2, sd3 inherit all BigDecimal public in
SuperDecimal sd4 = sd2.multiply(sd3);
System.out.println(sd4.doubleValue());





}





}
