package com.example;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
//@AllArgsConstructor
@ToString
public class Dog {
  
  private final String firstName = "John";

  @NonNull
  private String lastnName;

  public static void main(String[] args) {
    Dog dog = new Dog("Chan");
    System.out.println(dog);// Dog(firstName=John, lastnName=Chan)

    Dog dog2 = new Dog(null);
    System.out.println(dog2);
  }
}
