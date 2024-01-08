package DemoRecord;
// Kind of class
public record Student(String name, int age) {

public static int test = 1;

public void read(){
  System.out.println("i am reading ... ");
}

public static void sleep(){
  System.out.println("i am sleeping ... ");
}
  
  
// public Student(String name){
//   this.name name;
// }


// All attributes in "record" have been "final"
  // public void setName(String name){
  //   this.name = name;
  // }
}
