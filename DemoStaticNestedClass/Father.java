package DemoStaticNestedClass;

import java.sql.Driver;

public class Father implements Driver{

  @Override
public void driver

public static void main(String[] args){
  Driver driver = new Father();
  driver.drive();

  Driver driver2 = new Driver(){
    @Override
    public void drive(){
      System.out.println("Anonymous Inner Class ... driving ...");
    }
  };

driver2.drive();

}

}
