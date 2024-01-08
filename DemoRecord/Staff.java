package DemoRecord;

import java.util.Objects;

public class Staff {
  
  private final int age;

private final String name;

  public Staff(String name, int age){
    this.age = age;
    this.name = name;
  }

  public String name(){
    return name;
  }

  public int age(){
    return age;
  }

  @Override
  public boolean equals(Object obj){
    if(this == obj)
    return true;
    if(!(obj instanceof Staff))
    return false;
    Staff staff = (Staff) obj;
    return Objects.equals(this.name, staff.name())
    && Objects.equals(this.age, staff.age());
  }

  @Override
  public String toString(){
    return "Staff[" //
    + "name = " + this.name
    + "age = " + this.age
    + "]";
  }
}
