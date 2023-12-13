package App.inheritance;

public class Cat extends Animal {


  public Cat() {}

  // public void setAge(int age) {
  // this.age = age;
  // }

  // public double getAge() {
  // return this.age;

  // }
  public static void main(String[] args) {
    Cat c1 = new Cat();
    c1.setAge(2);
    System.out.println(c1.getAge());
  }
}
