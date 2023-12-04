package App;

// blueprint, to produce Person objects
public class Person {
  // Attributes
  private String firstName;//

  private String lastName;

  private int age; // 0


  // Constructor (Produce Person's object)
  public Person() {

  }

  public Person(String firstName) {
    this.firstName = firstName;
    this.lastName = "";
  }
  // public Person(String lastName){
  // this.lastName = lastName;
  // }

  public Person(int age) {
    this.age = age;
  }

  public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public Person(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  // Instance Method (Object method)
  // Setter
  public void setfirstName(String x) {
    this.firstName = x;
  }

  public void setlastName(String y) {
    this.lastName = y;
  }

  public String getFullName() {
    if(this.lastName == null)
    return this.firstName;
    return this.lastName.isEmpty() ? this.firstName
        : this.firstName.concat(" ").concat(this.lastName);
  }

  public String getFullName(boolean isCapLetter) {
    String fullName = this.firstName.concat(" ").concat(this.lastName);
    return isCapLetter ? fullName.toUpperCase() : fullName.toLowerCase();
  }

  //
  public String getFullName2() {
    return this.firstName.substring(0, 1).toUpperCase()
        .concat(this.firstName.substring(1, this.firstName.length()))
        .concat(this.firstName.substring(0, 1).toUpperCase()).concat(" ")//
        .concat(this.lastName.substring(0, 1).toUpperCase())
        .concat(this.lastName.substring(1, this.lastName.length()));
  }

  public String getCapFullName() {
    return this.getFullName().toUpperCase();
  }

  public String getSmallFullName() {
    return this.getFullName().toLowerCase();
  }

  public void setAge(int x) {
    this.age = x;
  }

  // Getter
  public String getfirstName() {
    return this.firstName;
  }

  public String getlastName() {
    return this.lastName;
  }

  public int getAge() {
    return this.age;
  }

  public static void main(String[] args) {
    Person p1 = new Person();
    p1.setfirstName("john");
    Person p2 = new Person();
    p2.setfirstName("peter");
    Person p3 = new Person();
    p3.setfirstName("Mary");

    p3 = p1;
    p3.setfirstName("Mary");

    Person p4 = new Person("Tommy");
    p4.setfirstName("Jenny");
    System.out.println(p4.getfirstName());// "Tommy"
    System.out.println(p3.getfirstName());// "Mary"
    System.out.println(p1.getfirstName());// "Mary"
    System.out.println(p2.getfirstName());// "Peter"

    Person p5 = new Person("Ken", "Wong");
    System.out.println("p5 full name=" + p5.getCapFullName());
    System.out.println("p5 full name=" + p5.getSmallFullName());
    System.out.println("p5 full name=" + p5.getFullName());


  }

}

