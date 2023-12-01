package App;
// blueprint, to produce Person objects
public class Person {
  // Attributes
private String name;//

private int age; // 0


  // Constructor (Produce Person's object)
  public Person(){

  }
  public Person(String name){
    this.name = name;
  }
  // Instance Method (Object method)
  // Setter
  public void setName(String x){
    this.name = x;
  }
// Getter
public String getName(){
  return this.name ;
}

public static void main(String[] args) {
  Person p1 = new Person();
  p1.setName("john");
  Person p2 = new Person();
  p2.setName("peter");
  Person p3 = new Person();
  p3.setName("Mary");

   p3 = p1;
p3.setName("Mary");

Person p4 = new Person("Tommy");

System.out.println(p4.getName());// "Tommy"
System.out.println(p3.getName());// "Mary"
System.out.println(p1.getName());// "Mary"
System.out.println(p2.getName());// "Peter"
}

}
