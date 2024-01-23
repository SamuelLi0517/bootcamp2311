package com.example;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class Person {
  
  private String name;

  private int age;

  public Person(String name){
    this.name = name;
  }
    public Person(int age){
      this.age = age;
  
  }

  public static void main(String[] args) {
    Person person = new Person();
person.setAge(30);
person.setName("John");
System.out.println(person.getName() + " " + person.getAge()); // John 30

Person person2 = new Person("Mary", 20);




  }
}