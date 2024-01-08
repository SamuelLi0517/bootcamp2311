package DemoRecord;

public class Demo {
  public static void main(String[] args) {
    // Allow All-args constructor only
    Student student = new Student("John", 20);
    System.out.println(student.name());// getter
    // No setter in Record

    // toString()
    System.out.println(student);// Student[name=john, age=20]

    // equals
    Student student2 = new Student("John", 20);
System.out.println(student.equals((student2)));// true

// hashCode()
System.out.println(student.hashCode());
System.out.println(student2.hashCode());

// Other class
Cat cat1 = new Cat("ABC", "Red", 1);
Cat cat2 = new Cat("IJK", "Black", 1);

// to string
System.out.println(cat1);//Cat[name=ABC, color=Red, age=2]
System.out.println(cat2);//Cat[name=IJK, color=Black, age=1]

// equals
System.out.println(cat1.equals(cat2));// false

// hashCode()
System.out.println(cat1.hashCode());//64602483
System.out.println(cat2.hashCode());//2061946060

System.out.println(cat1.age() == cat2.age());
  }
}
