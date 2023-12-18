package Demoobject;

import java.util.Objects;

public class Cat {

  private String name;

  private int age;

  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

@Override
public boolean equals(Object obj){
  if(this == obj)
  return true;
  if(!(obj instanceof Cat))
  return false;
  Cat cat = (Cat) obj;
  //return cat.getAge() == this.age 
  //&& cat.getName().equals(this.name);
  return Objects.equals(cat.getAge(), this.age)
  && Objects.equals(cat.getName(), this.name);
}

@Override
public int hashCode() {// hashcode -> represent object address
return Objects.hash(this.name, this.age);
}




  // Cat equals
public static void main(String[] args){
Cat c1 = new Cat("ABC", 5);
Cat c2 = new Cat("ABC", 10);
Cat c3 = new Cat("DEF", 5);
Cat c4 = new Cat("IJK", 7);
Cat c5 = new Cat("ABC", 5);

System.out.println(c1.equals(c2));// false, different age
System.out.println(c1.equals(c3));// false, different name
System.out.println(c1.equals(c4));// false, different name and different age
System.out.println(c1.equals(c5));// true


}
}